package com.ansh.work.pinterestuiandroidscholarshipchallange.ExploreFragmentFiles;


import android.graphics.Color;
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
public class ExploreFragment extends Fragment {


    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment2_explore, container, false);

        final Button b1=v.findViewById(R.id.btexplore1);
        final Button b2=v.findViewById(R.id.btexplore2);
        final Button b3=v.findViewById(R.id.btexplore3);

        final Button b4=v.findViewById(R.id.btexplore4);
        final Button b5=v.findViewById(R.id.btexplore5);
        final Button b6=v.findViewById(R.id.btexplore6);

        final Button b7=v.findViewById(R.id.btexplore7);
        final Button b8=v.findViewById(R.id.btexplore8);



        View.OnClickListener l=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.btexplore1:{
                        b1.setBackground(getResources().getDrawable(R.drawable.bg_explore_btn_selected));
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b3.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b4.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b5.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b6.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b7.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b8.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b1.setTextColor(Color.WHITE);
                        b2.setTextColor(Color.GRAY);
                        b3.setTextColor(Color.GRAY);
                        b4.setTextColor(Color.GRAY);
                        b5.setTextColor(Color.GRAY);
                        b6.setTextColor(Color.GRAY);
                        b7.setTextColor(Color.GRAY);
                        b8.setTextColor(Color.GRAY);



                        break;
                    }
                    case R.id.btexplore2:{
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_explore_btn_selected));
                        b1.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b3.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b4.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b5.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b6.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b7.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b8.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b2.setTextColor(Color.WHITE);
                        b1.setTextColor(Color.GRAY);
                        b3.setTextColor(Color.GRAY);
                        b4.setTextColor(Color.GRAY);
                        b5.setTextColor(Color.GRAY);
                        b6.setTextColor(Color.GRAY);
                        b7.setTextColor(Color.GRAY);
                        b8.setTextColor(Color.GRAY);



                        break;
                    }    case R.id.btexplore3:{
                        b3.setBackground(getResources().getDrawable(R.drawable.bg_explore_btn_selected));
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b1.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b4.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b5.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b6.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b7.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b8.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b3.setTextColor(Color.WHITE);
                        b2.setTextColor(Color.GRAY);
                        b1.setTextColor(Color.GRAY);
                        b4.setTextColor(Color.GRAY);
                        b5.setTextColor(Color.GRAY);
                        b6.setTextColor(Color.GRAY);
                        b7.setTextColor(Color.GRAY);
                        b8.setTextColor(Color.GRAY);



                        break;
                    }   case R.id.btexplore4:{
                        b4.setBackground(getResources().getDrawable(R.drawable.bg_explore_btn_selected));
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b3.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b1.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b5.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b6.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b7.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b8.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b4.setTextColor(Color.WHITE);
                        b2.setTextColor(Color.GRAY);
                        b3.setTextColor(Color.GRAY);
                        b1.setTextColor(Color.GRAY);
                        b5.setTextColor(Color.GRAY);
                        b6.setTextColor(Color.GRAY);
                        b7.setTextColor(Color.GRAY);
                        b8.setTextColor(Color.GRAY);


                        break;
                    }
                    case R.id.btexplore6:{
                        b5.setBackground(getResources().getDrawable(R.drawable.bg_explore_btn_selected));
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b3.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b4.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b1.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b6.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b7.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b8.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b5.setTextColor(Color.WHITE);
                        b2.setTextColor(Color.GRAY);
                        b3.setTextColor(Color.GRAY);
                        b4.setTextColor(Color.GRAY);
                        b1.setTextColor(Color.GRAY);
                        b6.setTextColor(Color.GRAY);
                        b7.setTextColor(Color.GRAY);
                        b8.setTextColor(Color.GRAY);



                        break;
                    }    case R.id.btexplore5:{
                        b6.setBackground(getResources().getDrawable(R.drawable.bg_explore_btn_selected));
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b3.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b4.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b5.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b1.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b7.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b8.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b6.setTextColor(Color.WHITE);
                        b2.setTextColor(Color.GRAY);
                        b3.setTextColor(Color.GRAY);
                        b4.setTextColor(Color.GRAY);
                        b5.setTextColor(Color.GRAY);
                        b1.setTextColor(Color.GRAY);
                        b7.setTextColor(Color.GRAY);
                        b8.setTextColor(Color.GRAY);



                        break;
                    }   case R.id.btexplore7:{
                        b7.setBackground(getResources().getDrawable(R.drawable.bg_explore_btn_selected));
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b3.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b4.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b5.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b6.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b1.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b8.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b7.setTextColor(Color.WHITE);
                        b2.setTextColor(Color.GRAY);
                        b3.setTextColor(Color.GRAY);
                        b4.setTextColor(Color.GRAY);
                        b5.setTextColor(Color.GRAY);
                        b6.setTextColor(Color.GRAY);
                        b1.setTextColor(Color.GRAY);
                        b8.setTextColor(Color.GRAY);



                        break;
                    }
                    case R.id.btexplore8:{
                        b8.setBackground(getResources().getDrawable(R.drawable.bg_explore_btn_selected));
                        b2.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b3.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b4.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b5.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b6.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b7.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));
                        b1.setBackground(getResources().getDrawable(R.drawable.bg_profile_btn_unselected));

                        b8.setTextColor(Color.WHITE);
                        b2.setTextColor(Color.GRAY);
                        b3.setTextColor(Color.GRAY);
                        b4.setTextColor(Color.GRAY);
                        b5.setTextColor(Color.GRAY);
                        b6.setTextColor(Color.GRAY);
                        b7.setTextColor(Color.GRAY);
                        b1.setTextColor(Color.GRAY);



                        break;
                    }

                }
            }
        };
        b1.setOnClickListener(l);b2.setOnClickListener(l);b3.setOnClickListener(l);
        b4.setOnClickListener(l);b5.setOnClickListener(l);b6.setOnClickListener(l);

        b7.setOnClickListener(l);b8.setOnClickListener(l);



        RecyclerView rv=v.findViewById(R.id.rv_explore);
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
