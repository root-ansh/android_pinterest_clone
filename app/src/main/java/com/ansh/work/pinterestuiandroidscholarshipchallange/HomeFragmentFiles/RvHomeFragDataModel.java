package com.ansh.work.pinterestuiandroidscholarshipchallange.HomeFragmentFiles;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ansh.work.pinterestuiandroidscholarshipchallange.R;
import com.bumptech.glide.Glide;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;

import java.util.List;

public class RvHomeFragDataModel extends AbstractItem<RvHomeFragDataModel, RvHomeFragDataModel.RvHomeViewHolder> {

    private int imageID;
    private String imageTitle;

    public RvHomeFragDataModel(int imageID, String imageTitle) {
        this.imageID = imageID;
        this.imageTitle = imageTitle;
    }

    public int getImageID() {
        return imageID;
    }
    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }
    @Override
    public String toString() {
        return "RvHomeFragDataModel{" +
                "imageID=" + imageID +
                ", imageTitle='" + imageTitle + '\'' +
                '}';
    }


    @NonNull
    @Override
    public RvHomeViewHolder getViewHolder(View v) {
        return new RvHomeViewHolder(v);
    }

    @Override
    public int getType() {
        return R.id.frag_rv_home;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment1_rv_eachrow;
    }

    //---------holder cum-bindview class---------------------------------------------------------
    public class RvHomeViewHolder extends FastAdapter.ViewHolder<RvHomeFragDataModel> {
        ImageView ivImage;
        TextView tvDetails;

        public RvHomeViewHolder(View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.iv_image);
            tvDetails = itemView.findViewById(R.id.tv_details);
        }

        @Override
        public void bindView(RvHomeFragDataModel item, List<Object> payloads) {
            tvDetails.setText(item.getImageTitle());

            Glide.with(itemView.getContext()).load(item.getImageID()).into(ivImage);

        }

        @Override
        public void unbindView(RvHomeFragDataModel item) {

        }
    }
    //---------holder class---------------------------------------------------------


}
