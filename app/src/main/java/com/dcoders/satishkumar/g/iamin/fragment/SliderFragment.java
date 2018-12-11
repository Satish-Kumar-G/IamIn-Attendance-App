package com.dcoders.satishkumar.g.iamin.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.dcoders.satishkumar.g.iamin.R;

import java.util.HashMap;

public class SliderFragment extends Fragment
        implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener{

    SliderLayout slider;
   /*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_slider, container, false);
        slider=view.findViewById(R.id.imageSlider);
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Something a",R.drawable.one);
        map.put("Something b",R.drawable.two);
        map.put("Something c",R.drawable.three);
        map.put("Something d",R.drawable.four);
        map.put("Something e",R.drawable.five);
        map.put("Something f",R.drawable.six);
        map.put("Something g",R.drawable.seven);
        map.put("Something h",R.drawable.eight);
        map.put("Something i",R.drawable.nine);
        map.put("Something j",R.drawable.ten);
        for (String names : map.keySet()) {
            TextSliderView sliderView = new TextSliderView(getActivity());
            sliderView
                    .description(names)
                    .image(map.get(names))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            sliderView.bundle(new Bundle());
            sliderView.getBundle()
                    .putString("extra", names);

            slider.addSlider(sliderView);
        }
        slider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        slider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        slider.setCustomAnimation(new DescriptionAnimation());
        slider.setDuration(3000);
        slider.addOnPageChangeListener(this);


        return view;
    }


    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
