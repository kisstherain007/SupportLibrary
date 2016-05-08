package com.bz.toollibrary.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bz.toollibrary.bitmaploader.BitmapOwner;
import com.bz.toollibrary.inject.InjectUtility;


/**
 * Created by kisstherain on 2016/1/9.
 */
public abstract class BaseFragment extends Fragment implements BitmapOwner {

    private ViewGroup rootView;// 根视图

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = (ViewGroup) inflater.inflate(inflateContentView(), null);
        rootView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        InjectUtility.initInjectedView(this, rootView);

        return rootView;
    }

    /**
     * Action的home被点击了
     *
     * @return
     */
    public boolean onHomeClick() {
        return onBackClick();
    }

    /**
     * 返回按键被点击了
     *
     * @return
     */
    public boolean onBackClick() {
        return false;
    }

    abstract protected int inflateContentView();

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        if (activity instanceof BaseActivity){

            ((BaseActivity) activity).addFragment(toString(), this);
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();

        if (getActivity() != null && getActivity() instanceof BaseActivity)
            ((BaseActivity) getActivity()).removeFragment(this.toString());
    }

    @Override
    public boolean canDisplay() {
        return true;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

//        RefWatcher refWatcher = NewsApp.getRefWatcher(getActivity());
//        refWatcher.watch(this);
    }
}
