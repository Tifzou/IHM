package insa.ihm;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View innerFrag = findViewById(R.id.fragment);


        /*Default activity*/
        DrawerLayout layout = (DrawerLayout) findViewById(R.id.main_layout);
        getFragmentManager().beginTransaction().replace(layout.getId(), new ProjectSummary(), "").commit();

        // Dashboard button
        ImageButton mDashboardButton = (ImageButton) innerFrag.findViewById(R.id.dashboardButton);
        mDashboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new Dashboard(), "").commit();
            }
        });

        // Tasks button
        ImageButton mTasksButton = (ImageButton) innerFrag.findViewById(R.id.tasksButton);
        mTasksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new Todo_List(), "").commit();
            }
        });

        // Group info button
        ImageButton mGroupInfoButton = (ImageButton) innerFrag.findViewById(R.id.group_infoButton);
        mGroupInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new GroupInfo(), "").commit();
            }
        });

        // Chat button
        ImageButton mChatButton = (ImageButton) innerFrag.findViewById(R.id.chatButton);
        mChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) findViewById(R.id.main_layout);
                Log.e("", "wtf");
                getFragmentManager().beginTransaction().replace(layout.getId(), new ChatFragment(), "").commit();
            }
        });
    }

}
