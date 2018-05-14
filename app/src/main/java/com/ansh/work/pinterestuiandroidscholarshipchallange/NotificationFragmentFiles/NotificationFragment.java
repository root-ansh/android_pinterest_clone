package com.ansh.work.pinterestuiandroidscholarshipchallange.NotificationFragmentFiles;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ansh.work.pinterestuiandroidscholarshipchallange.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {


    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment3_notification, container, false);


        final Button b1 = v.findViewById(R.id.bt_notif_1);
        final Button b2 = v.findViewById(R.id.bt_notif_2);

        View.OnClickListener l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bt_notif_1: {
                        b1.setBackgroundColor( Color.WHITE);
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b2.setTextColor(getResources().getColor(R.color.grey));
                        b1.setTextColor(Color.BLACK);

                        break;
                    }
                    case R.id.bt_notif_2: {
                        b2.setBackgroundColor( Color.WHITE);
                        b1.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b1.setTextColor(getResources().getColor(R.color.grey));
                        b2.setTextColor(Color.BLACK);


                        break;
                    }


                }
            }
        };
        b1.setOnClickListener(l);
        b2.setOnClickListener(l);

        return v;

    }
}
