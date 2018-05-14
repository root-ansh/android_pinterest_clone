package com.ansh.work.pinterestuiandroidscholarshipchallange;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.ansh.work.pinterestuiandroidscholarshipchallange.ExploreFragmentFiles.ExploreFragment;
import com.ansh.work.pinterestuiandroidscholarshipchallange.HomeFragmentFiles.HomeFragment;
import com.ansh.work.pinterestuiandroidscholarshipchallange.NotificationFragmentFiles.NotificationFragment;
import com.ansh.work.pinterestuiandroidscholarshipchallange.ProfileFragmentFiles.ProfileFragment;
import com.ansh.work.pinterestuiandroidscholarshipchallange.R;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {
    android.support.v4.app.FragmentManager manager;

    HomeFragment fhome=new HomeFragment();
    ExploreFragment fexp=new ExploreFragment();
    NotificationFragment fnot=new NotificationFragment();
    ProfileFragment fprof=new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager=getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.frame_act_main,fhome).setTransitionStyle(FragmentTransaction.TRANSIT_ENTER_MASK).commit();

        BottomNavigationView bnvBottomBar=findViewById(R.id.bnv_bottom_bar);
        BottomNavigationViewHelper.removeShiftMode(bnvBottomBar);

        FrameLayout frRoot=findViewById(R.id.frame_act_main);


        bnvBottomBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                setCurrentFragment(item.getItemId());
                return true;
            }
        });

    }

    public void setCurrentFragment(int itemID) {
        FragmentTransaction tr= manager.beginTransaction();
        switch (itemID){
            case(R.id.mitem_home):tr.replace(R.id.frame_act_main,fhome).setTransitionStyle(FragmentTransaction.TRANSIT_EXIT_MASK).commit();break;
            case(R.id.mitem_explore):tr.replace(R.id.frame_act_main, fexp).setTransitionStyle(FragmentTransaction.TRANSIT_EXIT_MASK).commit();break;
            case(R.id.mitem_notif):tr.replace(R.id.frame_act_main, fnot).setTransitionStyle(FragmentTransaction.TRANSIT_ENTER_MASK).commit();break;
            case(R.id.mitem_profile):tr.replace(R.id.frame_act_main, fprof).setTransitionStyle(FragmentTransaction.TRANSIT_ENTER_MASK).commit();break;
        }


//        this.currentFragment = currentFragment;
    }


    //the defualt libraries for bottom navigation view are unable to provide a good UI
    // (shifting the highlighted tab to the left) along with other bugs.
    // (like no badges on tabs, no quick scroll behavior,etc)
    // Use www.github.com/aurelhubert/ahbottomnavigation instead.
    public static class BottomNavigationViewHelper {
        @SuppressLint("RestrictedApi")
        public  static void removeShiftMode(BottomNavigationView view) {
            BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
            try {
                Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
                shiftingMode.setAccessible(true);
                shiftingMode.setBoolean(menuView, false);
                shiftingMode.setAccessible(false);
                for (int i = 0; i < menuView.getChildCount(); i++) {
                    BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                    //noinspection RestrictedApi
                    item.setShiftingMode(false);
                    // set once again checked value, so view will be updated
                    //noinspection RestrictedApi
                    item.setChecked(item.getItemData().isChecked());
                }
            } catch (NoSuchFieldException e) {
                Log.e("BottomNav", "Unable to get shift mode field", e);
            } catch (IllegalAccessException e) {
                Log.e("BottomNav", "Unable to change value of shift mode", e);
            }
        }
    }

}

