package insa.ihm;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View innerFrag = findViewById(R.id.fragment);


        /*Default activity*/
        DrawerLayout layout = (DrawerLayout) findViewById(R.id.main_layout);
        getFragmentManager().beginTransaction().replace(layout.getId(), new ProjectSummary(), "").commit();




        /* TODO: do the same thing for Chat button
        ImageButton mChatButton = (ImageButton) view.findViewById(R.id.chat);
        mChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                switch (view.getId()) {
                    case R.id.group_info:
                        Intent chatActivity = new Intent(getActivity(), Chat.class);
                        startActivity(chatActivity);
                        break;
                }
            }
        });
         */

        ImageButton mDashboardButton = (ImageButton) innerFrag.findViewById(R.id.dashboardButton);
        mDashboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new Dashboard(), "").commit();
            }
        });

        ImageButton mTasksButton = (ImageButton) innerFrag.findViewById(R.id.tasksButton);
        mTasksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new ProjectDetails(), "").commit();
            }
        });

        ImageButton mGroupInfoButton = (ImageButton) innerFrag.findViewById(R.id.group_infoButton);
        mGroupInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new GroupInfo(), "").commit();
            }
        });

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
