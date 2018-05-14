package com.ansh.work.pinterestuiandroidscholarshipchallange.HomeFragmentFiles;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ansh.work.pinterestuiandroidscholarshipchallange.R;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment1_home, container, false);
        
        
        RecyclerView rv=v.findViewById(R.id.frag_rv_home);
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
