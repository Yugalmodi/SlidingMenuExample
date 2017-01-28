package com.techpalle.slidingmaenuexample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {
    ImageView imageView;
//    int [] myImages = {R.drawable.human, R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.india_gate,
//            R.drawable.instagram, R.drawable.laptop_window, R.drawable.make_in_india, R.drawable.noughat, R.drawable.youtube};
    int [] myImages = {R.drawable.ic_menu_gallery, R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery,
        R.drawable.ic_menu_gallery,R.drawable.ic_menu_gallery};
    public MyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_my, container, false);
        imageView = (ImageView) v.findViewById(R.id.image_view);
        Bundle b = getArguments();
        int pos = b.getInt("image");
        //BASED ON THE POSITION APPLY IMAGE ON THE ImageView
        imageView.setImageResource(myImages[pos]);
        return v;
    }

}
