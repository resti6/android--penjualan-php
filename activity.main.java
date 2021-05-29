<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="10dp">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Nama Pembeli :"
                android:textColor="@android:color/holo_purple"
                android:textStyle="bold" />

            <EditText
                android:id="@+id/etNamaPelanggan"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:imeOptions="actionNext" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Nama Barang :"
                android:textColor="@android:color/holo_purple"
                android:textStyle="bold" />

            <EditText
                android:id="@+id/etNamaBarang"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:imeOptions="actionNext" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Jumlah Barang :"
                android:textColor="@android:color/holo_purple"
                android:textStyle="bold" />

            <EditText
                android:id="@+id/etJmlBarang"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:imeOptions="actionNext"
                android:inputType="number" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Harga : Rp "
                android:textColor="@android:color/holo_purple"
                android:textStyle="bold" />

            <EditText
                android:id="@+id/etHarga"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:imeOptions="actionNext"
                android:inputType="number" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Uang Bayar :"
                android:textColor="@android:color/holo_purple"
                android:textStyle="bold" />

            <EditText
                android:id="@+id/etJmlUang"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:imeOptions="actionNext"
                android:inputType="number" />

        </LinearLayout>

        <Button
            android:id="@+id/btnProses"
            android:layout_width="357dp"
            android:layout_height="45dp"
            android:layout_margin="20dp"
            android:background="@drawable/ic_launcher_background"
            android:text="Proses"
            android:textColor="@android:color/darker_gray" />

        <View
            android:layout_width="match_parent"
            android:layout_height="1dp"
            android:background="#ffc0cb" />

        <TextView
            android:id="@+id/tvNamaPembeli"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="20dp"
            android:textColor="@android:color/holo_blue_light"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/tvNamaBarang"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:textColor="@android:color/holo_blue_light"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/tvJmlBarang"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:textColor="@android:color/holo_blue_light"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/tvHarga"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:textColor="@android:color/holo_blue_light"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/tvUangBayar"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:textColor="@android:color/holo_blue_light"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/tvTotal"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:textColor="@android:color/holo_blue_light"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/tvKembalian"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:textColor="@android:color/black"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/tvBonus"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:textColor="@android:color/holo_blue_light"
            android:textStyle="bold" />

        <TextView
            android:id="@+id/tvKeterangan"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:textColor="@android:color/holo_blue_light"
            android:textStyle="bold" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <Button
                android:id="@+id/btnHapus"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_margin="20dp"
                android:layout_weight="1"
                android:background="@drawable/ic_launcher_background"
                android:text="Hapus Data"
                android:textColor="@android:color/darker_gray" />

            <Button
                android:id="@+id/btnKeluar"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_margin="20dp"
                android:layout_weight="1"
                android:background="@drawable/ic_launcher_background"
                android:text="Keluar"
                android:textColor="@android:color/darker_gray" />

        </LinearLayout>

    </LinearLayout>

</ScrollView>