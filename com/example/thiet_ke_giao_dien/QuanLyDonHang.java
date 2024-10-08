package com.example.thiet_ke_giao_dien;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDonHang extends AppCompatActivity {
    Spinner spnTrangThai;
    ListView lvDonHang;
    DonHangAdapter adapter;
    List<DonHang> donHangList;
    ImageView imgDonHangTrong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quan_ly_don_hang);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        spnTrangThai = findViewById(R.id.spnTrangThai);
        lvDonHang = findViewById(R.id.lvDonHang);
        imgDonHangTrong = findViewById(R.id.imgDonHangTrong);

        ArrayList<String> trangThaiArray = new ArrayList<String>();
        trangThaiArray.add("Chờ duyệt");
        trangThaiArray.add("Chờ lấy hàng");
        trangThaiArray.add("Đang giao");
        trangThaiArray.add("Đã giao");
        trangThaiArray.add("Đơn bị hủy");

        ArrayAdapter adapterTrangThai = new ArrayAdapter(this, android.R.layout.simple_spinner_item, trangThaiArray);
        adapterTrangThai.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnTrangThai.setAdapter(adapterTrangThai);

        donHangList = new ArrayList<>();
        donHangList.add(new DonHang("023a42f71a", "KH01", "28/09/2024", "Cho duyet"));
        donHangList.add(new DonHang("023a42f71a", "KH01", "28/09/2024", "Cho duyet"));
        donHangList.add(new DonHang("023a42f71a", "KH01", "28/09/2024", "Cho duyet"));
        donHangList.add(new DonHang("023a42f71a", "KH01", "28/09/2024", "Cho duyet"));
        donHangList.add(new DonHang("023a42f71a", "KH01", "28/09/2024", "Cho duyet"));
        donHangList.add(new DonHang("023a42f71a", "KH01", "28/09/2024", "Cho duyet"));

        adapter = new DonHangAdapter(this, donHangList);
        lvDonHang.setAdapter(adapter);

        if (adapter.getCount() == 0) {
            // ListView không có phần tử nào
        } else {
            // ListView có phần tử
            imgDonHangTrong.setVisibility(View.GONE);
            lvDonHang.setVisibility(View.VISIBLE);
        }
    }
}