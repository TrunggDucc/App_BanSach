package com.example.thiet_ke_giao_dien;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class DonHangAdapter extends BaseAdapter {
    Context context;
    List<DonHang> donHangList;

    public DonHangAdapter(Context context, List<DonHang> donHangList) {
        this.context = context;
        this.donHangList = donHangList;
    }

    @Override
    public int getCount() {
        return donHangList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.activity_don_hang, viewGroup, false);
        }

        TextView txtMaDonHang = view.findViewById(R.id.txtMaDonHang);
        TextView txtMaKhachHang = view.findViewById(R.id.txtMaKhachHang);
        TextView txtNgayDatHang = view.findViewById(R.id.txtNgayDatHang);
        Button btnChiTiet = view.findViewById(R.id.btnXemChiTiet);

        btnChiTiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context , ChiTietDonHang.class);
                context.startActivity(intent);
            }
        });

        DonHang donHang = donHangList.get(i);
        txtMaDonHang.setText(String.format("Mã đơn: %s", donHang.getMaDonHang()));
        txtMaKhachHang.setText(String.format("Mã khách hàng: %s", donHang.getMaKhachHang()));
        txtNgayDatHang.setText(String.format("Ngày đặt hàng: %s", donHang.getNgayDatHang()));

        return view;
    }
}
