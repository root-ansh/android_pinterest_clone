package com.ansh.work.pinterestuiandroidscholarshipchallange.ProfileFragmentFiles;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ansh.work.pinterestuiandroidscholarshipchallange.HomeFragmentFiles.RvHomeFragDataModel;
import com.ansh.work.pinterestuiandroidscholarshipchallange.R;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment4_profile, container, false);


        final Button b1=v.findViewById(R.id.bt_profile1);
        final Button b2=v.findViewById(R.id.bt_profile2);
        final Button b3=v.findViewById(R.id.bt_profile3);

        View.OnClickListener l=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.bt_profile1:{
                        b1.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_selected));
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b3.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        break;
                    }
                    case R.id.bt_profile2:{
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_selected));
                        b1.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b3.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        break;
                    }
                    case R.id.bt_profile3:{
                        b3.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_selected));
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b1.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        break;
                    }

                }
            }
        };
        b1.setOnClickListener(l);b2.setOnClickListener(l);b3.setOnClickListener(l);

        RecyclerView rv=v.findViewById(R.id.rv_profile);
        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));


        ItemAdapter<RvHomeFragDataModel> itemsHolderAdapter=new ItemAdapter();
        FastAdapter<RvHomeFragDataModel> rvAdpFast=FastAdapter.with(itemsHolderAdapter);

        itemsHolderAdapter.add(getRvItemList());
        rvAdpFast.withSelectable(true);
        rv.setAdapter(rvAdpFast);

        return v;



    }

    public List<RvHomeFragDataModel> getRvItemList() {
        List<RvHomeFragDataModel> dataArr=new ArrayList<>();
        dataArr.add(new RvHomeFragDataModel(R.drawable.pic1,"A big brown fox jumps overa lazy dog and frightens him"));
        dataArr.add(new RvHomeFragDataModel(R.drawable.pic2,"A big brown fox jumps overa lazy dog and frightens him"));
        dataArr.add(new RvHomeFragDataModel(R.drawable.pic1,"A big brown fox jumps overa lazy dog and frightens him"));
        dataArr.add(new RvHomeFragDataModel(R.drawable.pic3,"A big brown fox jumps overa lazy dog and frightens him"));
        dataArr.add(new RvHomeFragDataModel(R.drawable.pic1,"A big brown fox jumps overa lazy dog and frightens him"));
        dataArr.add(new RvHomeFragDataModel(R.drawable.pic6,"A big brown fox jumps overa lazy dog and frightens him"));
        dataArr.add(new RvHomeFragDataModel(R.drawable.pic1,"A big brown fox jumps overa lazy dog and frightens him"));
        dataArr.add(new RvHomeFragDataModel(R.drawable.pic1,"A big brown fox jumps overa lazy dog and frightens him"));
        dataArr.add(new RvHomeFragDataModel(R.drawable.pic2,"A big brown fox jumps overa lazy dog and frightens him"));
        dataArr.add(new RvHomeFragDataModel(R.drawable.pic3,"A big brown fox jumps overa lazy dog and frightens him"));


        return dataArr;

    }

}
