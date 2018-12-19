package insa.ihm;


import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;

import java.util.HashMap;

public class ProjectDetails extends AppCompatActivity {

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.task_details);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar bar, float v, boolean b) {
                int barColor = colors.get(v);
                LayerDrawable stars = (LayerDrawable) bar.getProgressDrawable();
                stars.getDrawable(2).setColorFilter(barColor, PorterDuff.Mode.SRC_ATOP);
            }
        });

    }
}
