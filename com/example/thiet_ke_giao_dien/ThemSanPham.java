package com.example.thiet_ke_giao_dien;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ThemSanPham extends AppCompatActivity {
    ImageView btnBack;
    Spinner spnDanhMuc, spnTheLoai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_them_san_pham);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnBack = findViewById(R.id.btnBack);
        spnDanhMuc = findViewById(R.id.spnDanhMuc);
        spnTheLoai = findViewById(R.id.spnTheLoai);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });
        ArrayList<String> danhMucArray = new ArrayList<String>();
        danhMucArray.add("Danh mục");
        danhMucArray.add("Văn học");
        danhMucArray.add("Khoa học");
        danhMucArray.add("Lịch sử");
        danhMucArray.add("Sách thiếu nhi");

        ArrayList<String> theLoaiArray = new ArrayList<String>();
        theLoaiArray.add("Thể loại");
        theLoaiArray.add("Trinh thám");
        theLoaiArray.add("Hài hước");
        theLoaiArray.add("Kinh dị");
        theLoaiArray.add("Tâm lý");

        ArrayAdapter adapterDanhMuc = new ArrayAdapter(this, android.R.layout.simple_spinner_item, danhMucArray);
        adapterDanhMuc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnDanhMuc.setAdapter(adapterDanhMuc);

        ArrayAdapter adapterTheLoai = new ArrayAdapter(this, android.R.layout.simple_spinner_item, theLoaiArray);
        adapterTheLoai.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnTheLoai.setAdapter(adapterTheLoai);
    }
}