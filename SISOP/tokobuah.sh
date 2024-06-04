#!/bin/bash

USERS_FILE="users.txt"
INVENTORY_FILE="inventory.txt"
HISTORY_FILE="history.txt"

# Fungsi untuk membuat pengguna baru
create_user() {
    echo -n "Masukkan username: "
    read username
    echo -n "Masukkan password: "
    read -s password
    echo ""
    echo -n "Masukkan hak akses (admin/user): "
    read role
    echo "$username:$password:$role" >> $USERS_FILE 
    echo "Pengguna $username berhasil dibuat."
}

# Fungsi untuk login
login() {
    echo "============================"
    echo "      SELAMAT DATANG        "
    echo "============================"
    echo -n "Masukkan username: "
    read username
    echo -n "Masukkan password: "
    read -s password
    echo ""
    if grep -q "$username:$password" $USERS_FILE; then
        role=$(grep "$username:$password" $USERS_FILE | cut -d ':' -f 3)
        echo "Login berhasil sebagai $role."
        return 0
    else
        echo "Login gagal. Username atau password salah."
        return 1
    fi
}

# Fungsi untuk menampilkan daftar harga
list_prices() {
    echo "Daftar Harga Buah:"
    cat $INVENTORY_FILE
}

# Fungsi untuk membeli buah
buy_fruit() {
    echo -n "Masukkan nama buah yang ingin dibeli: "
    read fruit
    price=$(grep "$fruit" $INVENTORY_FILE | cut -d ':' -f 2)
    if [ -z "$price" ]; then
        echo "Buah tidak ditemukan."
        return
    fi
    echo -n "Masukkan jumlah: "
    read quantity
    total=$((price * quantity))
    echo "Total harga: $total"

    echo -n "Apakah Anda ingin menggunakan plastik? (y/n): "
    read plastic
    if [ "$plastic" == "y" ]; then
        total=$((total + 1000))
        echo "Biaya tambahan untuk plastik: 1000"
    fi

    echo "Total harga dengan biaya tambahan: $total"
    echo -n "Masukkan nama pelanggan: "
    read customer
    echo "$customer membeli $quantity $fruit dengan total $total pada $(date)" >> $HISTORY_FILE
    echo "Pembelian berhasil dicatat."  
}

# Fungsi untuk menampilkan riwayat pembelian
view_history() {
    echo "History Pembelian: "
    cat $HISTORY_FILE
}

# Inisialisasi daftar harga buah
init_inventory() {
    cat > $INVENTORY_FILE <<EOL
Apple:10000
Banana:5000
Orange:8000
Grapes:15000
EOL
}


if [ ! -f $INVENTORY_FILE ]; then
    init_inventory
fi

# Fungsi untuk menambahkan item ke inventaris (hanya admin)
add_inventory() {
    echo -n "Masukkan nama buah yang ingin ditambahkan: "
    read fruit
    echo -n "Masukkan harga buah: "
    read price
    echo "$fruit:$price" >> $INVENTORY_FILE
    echo "Buah $fruit dengan harga $price berhasil ditambahkan."
}

# Menu utama
while true; do
    echo "1. Buat pengguna baru"
    echo "2. Login"
    read choice

    case $choice in
        1)
            create_user
            ;;
        2)
            login
            if [ $? -eq 0 ]; then
                while true; do
                    echo "========================="
                    echo "        MENU UTAMA       "
                    echo "========================="  
                    echo "1. Daftar Harga"
                    echo "2. Beli Buah"
                    if [ "$role" == "admin" ]; then
                        echo "3. Riwayat Pembelian"
                        echo "4. Tambah Inventaris"
                        echo "5. Keluar"
                    else
                        echo "3. Keluar"
                    fi
                    echo "Pilih: "
                    read sub_choice

                    case $sub_choice in
                        1)
                            list_prices
                            ;;
                        2)
                            buy_fruit
                            ;;
                        3)
                            if [ "$role" == "admin" ]; then
                                view_history
                            else
                                echo "Keluar..."
                                exit 0
                            fi
                            ;;
                        4)
                            if [ "$role" == "admin" ]; then
                                add_inventory
                            else
                                echo "Pilihan tidak valid."
                            fi
                            ;;
                        5)
                            echo "Keluar..."
                            exit 0
                            ;;
                        *)
                            echo "Pilihan tidak valid."
                            ;;
                    esac
                done
            fi
            ;;
        *)
            echo "Pilihan tidak valid."
            ;;
    esac
done
