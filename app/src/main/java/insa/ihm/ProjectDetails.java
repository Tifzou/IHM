package insa.ihm;

import android.app.Fragment;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

import java.util.HashMap;

public class ProjectDetails extends Fragment {

    static HashMap<Float, Integer> colors = new HashMap<>();

    static {
        colors.put(0.0f, Color.rgb(20, 255, 0));
        colors.put(0.5f, Color.rgb(40, 230, 0));
        colors.put(1.0f, Color.rgb(60, 210, 0));
        colors.put(1.5f, Color.rgb(80, 190, 0));
        colors.put(2.0f, Color.rgb(100, 170, 0));
        colors.put(2.5f, Color.rgb(120, 150, 0));
        colors.put(3.0f, Color.rgb(140, 130, 0));
        colors.put(3.5f, Color.rgb(160, 110, 0));
        colors.put(4.0f, Color.rgb(180, 90, 0));
        colors.put(4.5f, Color.rgb(200, 70, 0));
        colors.put(5.0f, Color.rgb(200, 50, 0));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_todo_detail, container, false);


        RatingBar ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar bar, float v, boolean b) {
                int barColor = colors.get(v);
                LayerDrawable stars = (LayerDrawable) bar.getProgressDrawable();
                stars.getDrawable(2).setColorFilter(barColor, PorterDuff.Mode.SRC_ATOP);
            }
        });

        return view;
    }
}
