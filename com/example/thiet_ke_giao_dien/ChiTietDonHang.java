package com.example.thiet_ke_giao_dien;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class ChiTietDonHang extends AppCompatActivity {
    ListView lvChiTietDonHang;
    SanPhamDatHangAdapter adapter;
    List<SanPham> sanPhamList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chi_tiet_don_hang);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lvChiTietDonHang = findViewById(R.id.lvChiTietDonHang);
        sanPhamList = new ArrayList<>();
        sanPhamList.add(new SanPham(R.drawable.haisophan, "Hai số phận", 25, "Jefrey Archer", 30));
        sanPhamList.add(new SanPham(R.drawable.bogia, "Bố già", 12, "Mario puzo", 43));
        sanPhamList.add(new SanPham(R.drawable.nguoiduadieu, "Người đua diều", 2, "Mahi Dick", 20));
        sanPhamList.add(new SanPham(R.drawable.ditimlesong, "Đi tìm lẽ sống", 15, "Jefrey Archer", 18));
        sanPhamList.add(new SanPham(R.drawable.ditimlesong, "Đi tìm lẽ sống", 15, "Jefrey Archer", 18));
        adapter = new SanPhamDatHangAdapter(this, sanPhamList);
        lvChiTietDonHang.setAdapter(adapter);
    }
}