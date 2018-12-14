package insa.ihm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    private TextView mTextMessage;
    TextView txt_help_gest;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        txt_help_gest = (TextView) findViewById(R.id.droptext);
        // hide until its title is clicked
        txt_help_gest.setVisibility(View.GONE);

        mTextMessage = (TextView) findViewById(R.id.message);
    }

    /**
     * onClick handler
     */
    public void toggle_contents(View v){
        txt_help_gest.setVisibility( txt_help_gest.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
}
