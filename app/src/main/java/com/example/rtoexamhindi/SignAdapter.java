package com.example.rtoexamhindi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SignAdapter extends ArrayAdapter {
    private Context mContext;
    private List<SignItem> signList = new ArrayList<>();

    public SignAdapter(@NonNull Context context, ArrayList<SignItem> list) {
        super(context, 0, list);
        mContext = context;
        signList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.sign_item, parent, false);
        SignItem currentSign = signList.get(position);

        ImageView image = (ImageView) listItem.findViewById(R.id.imgSign);
        image.setImageResource(currentSign.getmImageResource());

        TextView detail = (TextView) listItem.findViewById(R.id.tvDetail);
        detail.setText(currentSign.getmDetail());

        TextView signNo = (TextView) listItem.findViewById(R.id.tvSignNo);
        signNo.setText("संकेत: " + Integer.toString(currentSign.getmSignNo()));

        return listItem;
    }
}
