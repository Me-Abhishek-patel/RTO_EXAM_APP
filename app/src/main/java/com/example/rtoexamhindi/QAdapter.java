package com.example.rtoexamhindi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class QAdapter extends ArrayAdapter<QPractice> {
    public QAdapter(Context context, ArrayList<QPractice> Questions) {
        super(context, 0, Questions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.practice_item, parent, false);
        }


        QPractice qCurrent = getItem(position);

        TextView qTextView = (TextView) listItemView.findViewById(R.id.q_practice);

        qTextView.setText(qCurrent.getmQuestion());

        TextView aTextView = (TextView) listItemView.findViewById(R.id.a_practice);

        aTextView.setText(qCurrent.getmAnswer());

        TextView qNoTextView = (TextView) listItemView.findViewById(R.id.QNoTextView);

        qNoTextView.setText("प्रश्न: " + Integer.toString(qCurrent.getmQNo()));


        return listItemView;
    }
}
