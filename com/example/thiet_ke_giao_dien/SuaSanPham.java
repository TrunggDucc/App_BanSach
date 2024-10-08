package com.example.thiet_ke_giao_dien;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class SuaSanPham extends AppCompatActivity {
    Spinner spnDanhMuc, spnTheLoai;
    ImageView btnBack, btnCamera, btnFolder;
    Button btnSuaThongTin, btnLuuThongTin, btnHuy;
    EditText edtTenSach, edtTacGia, edtNhaCungCap, edtSoLuong, edtGiaBan, edtDanhMuc, edtTheLoai;
    String tenSach, tacGia, nhaCungCap, soLuong, giaBan;
    LinearLayout lnTheLoai, lnDanhMuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sua_san_pham);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        spnDanhMuc = findViewById(R.id.spnDanhMuc);
        spnTheLoai = findViewById(R.id.spnTheLoai);
        btnBack = findViewById(R.id.btnBack);
        btnSuaThongTin = findViewById(R.id.btnSuaThongTin);
        btnLuuThongTin = findViewById(R.id.btnLuuThongTin);
        btnHuy = findViewById(R.id.btnHuy);
        edtTenSach = findViewById(R.id.edtTenSach);
        edtTacGia = findViewById(R.id.edtTacGia);
        edtNhaCungCap = findViewById(R.id.edtNhaCungCap);
        edtSoLuong = findViewById(R.id.edtSoLuong);
        edtGiaBan = findViewById(R.id.edtGiaBan);
        edtDanhMuc = findViewById(R.id.edtDanhMuc);
        edtTheLoai = findViewById(R.id.edtTheLoai);
        lnDanhMuc = findViewById(R.id.lnDanhMuc);
        lnTheLoai = findViewById(R.id.lnTheLoai);
        btnCamera = findViewById(R.id.btnCamera);
        btnFolder = findViewById(R.id.btnFolder);

        tenSach = edtTenSach.getText().toString();
        tacGia = edtTacGia.getText().toString();
        nhaCungCap = edtNhaCungCap.getText().toString();
        soLuong = edtSoLuong.getText().toString();
        giaBan = edtGiaBan.getText().toString();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnSuaThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enableEditing(true);
                btnSuaThongTin.setVisibility(View.GONE);
                btnHuy.setVisibility(View.VISIBLE);
                btnLuuThongTin.setVisibility(View.VISIBLE);
                lnDanhMuc.setVisibility(View.VISIBLE);
                lnTheLoai.setVisibility(View.VISIBLE);
                edtDanhMuc.setVisibility(View.GONE);
                edtTheLoai.setVisibility(View.GONE);
                btnCamera.setVisibility(View.VISIBLE);
                btnFolder.setVisibility(View.VISIBLE);
            }
        });

        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtTenSach.setText(tenSach);
                edtTacGia.setText(tacGia);
                edtNhaCungCap.setText(nhaCungCap);
                edtSoLuong.setText(soLuong);
                edtGiaBan.setText(giaBan);

                enableEditing(false);
                btnLuuThongTin.setVisibility(View.GONE);
                btnHuy.setVisibility(View.GONE);
                btnSuaThongTin.setVisibility(View.VISIBLE);
                edtDanhMuc.setVisibility(View.VISIBLE);
                edtTheLoai.setVisibility(View.VISIBLE);
                lnDanhMuc.setVisibility(View.GONE);
                lnTheLoai.setVisibility(View.GONE);
                btnCamera.setVisibility(View.GONE);
                btnFolder.setVisibility(View.GONE);
            }
        });

        btnLuuThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tenSach = edtTenSach.getText().toString();
                tacGia = edtTacGia.getText().toString();
                nhaCungCap = edtNhaCungCap.getText().toString();
                soLuong = edtSoLuong.getText().toString();
                giaBan = edtGiaBan.getText().toString();

                edtTenSach.setText(tenSach);
                edtTacGia.setText(tacGia);
                edtNhaCungCap.setText(nhaCungCap);
                edtSoLuong.setText(soLuong);
                edtGiaBan.setText(giaBan);

                enableEditing(false);
                btnLuuThongTin.setVisibility(View.GONE);
                btnHuy.setVisibility(View.GONE);
                btnSuaThongTin.setVisibility(View.VISIBLE);
                edtDanhMuc.setVisibility(View.VISIBLE);
                edtTheLoai.setVisibility(View.VISIBLE);
                lnDanhMuc.setVisibility(View.GONE);
                lnTheLoai.setVisibility(View.GONE);
                btnCamera.setVisibility(View.GONE);
                btnFolder.setVisibility(View.GONE);
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
    private void enableEditing(boolean enabled) {
        edtTenSach.setEnabled(enabled);
        edtTacGia.setEnabled(enabled);
        edtNhaCungCap.setEnabled(enabled);
        edtSoLuong.setEnabled(enabled);
        edtGiaBan.setEnabled(enabled);
    }
}