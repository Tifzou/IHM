package insa.ihm;

import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class BottomNavFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_bottom_nav, container, false);

        ImageButton mDashboardButton = (ImageButton) view.findViewById(R.id.dashboardButton);
        mDashboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) view.findViewById(R.id.main_layout);
                //              getFragmentManager().beginTransaction().add(layout.getId(), new Dashboard(), "").commit();
            }
        });

        ImageButton mTasksButton = (ImageButton) view.findViewById(R.id.tasksButton);
        mTasksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) view.findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new ProjectDetails(), "").commit();
            }
        });

        ImageButton mGroupInfoButton = (ImageButton) view.findViewById(R.id.group_infoButton);
        mGroupInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) view.findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new GroupInfo(), "").commit();
            }
        });


        return view;



    }
}