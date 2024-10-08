package com.example.thiet_ke_giao_dien;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham extends AppCompatActivity {
    SearchView svSanPham;
    ImageView imgBooks, btnThemSanPham;
    Spinner spnDanhMuc, spnTheLoai, spnGiaBan;
    ListView lvSanPham;
    List<SanPham> sanPhamList;
    SanPhamAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quan_ly_san_pham);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        svSanPham = findViewById(R.id.svSanPham);
        spnDanhMuc = findViewById(R.id.spnDanhMuc);
        spnTheLoai = findViewById(R.id.spnTheLoai);
        spnGiaBan = findViewById(R.id.spnGiaBan);
        btnThemSanPham = findViewById(R.id.btnThemSanPham);
        imgBooks = findViewById(R.id.imgBooks);
        lvSanPham = findViewById(R.id.lvSanPham);
        sanPhamList = new ArrayList<>();
        sanPhamList.add(new SanPham(R.drawable.haisophan, "Hai số phận", 25, "Jefrey Archer", 30));
        sanPhamList.add(new SanPham(R.drawable.bogia, "Bố già", 12, "Mario puzo", 43));
        sanPhamList.add(new SanPham(R.drawable.nguoiduadieu, "Người đua diều", 2, "Mahi Dick", 20));
        sanPhamList.add(new SanPham(R.drawable.ditimlesong, "Đi tìm lẽ sống", 15, "Jefrey Archer", 18));

        adapter = new SanPhamAdapter(this, sanPhamList);
        lvSanPham.setAdapter(adapter);
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

        ArrayList<String> giaBanArray = new ArrayList<String>();
        giaBanArray.add("Giá bán");
        giaBanArray.add("Từ thấp đến cao");
        giaBanArray.add("Từ cao đến thấp");

        ArrayAdapter adapterDanhMuc = new ArrayAdapter(this, android.R.layout.simple_spinner_item, danhMucArray);
        adapterDanhMuc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnDanhMuc.setAdapter(adapterDanhMuc);

        ArrayAdapter adapterTheLoai = new ArrayAdapter(this, android.R.layout.simple_spinner_item, theLoaiArray);
        adapterTheLoai.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnTheLoai.setAdapter(adapterTheLoai);

        ArrayAdapter adapterGiaBan = new ArrayAdapter(this, android.R.layout.simple_spinner_item, giaBanArray);
        adapterGiaBan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnGiaBan.setAdapter(adapterGiaBan);

        imgBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnThemSanPham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuanLySanPham.this, ThemSanPham.class);
                startActivity(intent);
            }
        });

        lvSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(QuanLySanPham.this, SuaSanPham.class);
                startActivity(intent);
            }
        });
    }
}