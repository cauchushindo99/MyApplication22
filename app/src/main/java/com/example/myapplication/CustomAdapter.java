package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CarResponse> {
    private Context context;
    private int resourceID;
    private ArrayList<CarResponse> carList;

    public CustomAdapter(Context context, int resource, ArrayList<CarResponse> carList) {
        super(context, resource, carList);

        this.context = context;
        this.resourceID = resource;
        this.carList = carList;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.item_list, viewGroup, false);
        CarResponse car = carList.get(i);
        TextView tvId = itemView.findViewById(R.id.tvid);
        TextView txTen = itemView.findViewById(R.id.tvten);
        TextView tvSoKhoi = itemView.findViewById(R.id.tvsokhoi);
        TextView txNSX = itemView.findViewById(R.id.tvnsx);

        tvId.setText(car.getIdXe());
        txTen.setText(car.getTenXe());
        tvSoKhoi.setText(car.getSoKhoi().toString());
        txNSX.setText(car.getNhaSanXuat());
        return itemView;
    }
}

