package com.example.thiet_ke_giao_dien;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SanPhamDatHangAdapter extends BaseAdapter {
    Context context;
    List<SanPham> sanPhamList;

    public SanPhamDatHangAdapter(Context context, List<SanPham> sanPhamList) {
        this.context = context;
        this.sanPhamList = sanPhamList;
    }

    @Override
    public int getCount() {
        return sanPhamList.size();
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
            view = LayoutInflater.from(context).inflate(R.layout.activity_san_pham_dat_hang, viewGroup, false);
        }
        TextView txtTenSanPham = view.findViewById(R.id.txtTenSanPham);
        ImageView imgAnhSanPham = view.findViewById(R.id.imgAnhSanPham);
        TextView txtSoLuong = view.findViewById(R.id.txtSoLuong);
        TextView txtTacGia = view.findViewById(R.id.txtTacGia);
        TextView txtGiaBan = view.findViewById(R.id.txtGiaBan);

        SanPham sanPham = sanPhamList.get(i);
        txtTenSanPham.setText(sanPham.getTenSanPham());
        imgAnhSanPham.setImageResource(sanPham.getAnhSanPham());
        txtSoLuong.setText(String.format("Số lượng: %s", sanPham.getSoLuong()));
        txtTacGia.setText(sanPham.getTacGia());
        txtGiaBan.setText(String.format("Đơn giá: %s$", sanPham.getGiaBan()));

        return view;
    }
}
