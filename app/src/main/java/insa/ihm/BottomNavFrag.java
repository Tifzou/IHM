package insa.ihm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class BottomNavFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom_nav, container, false);

        /* TODO: do the same thing for Chat button
        ImageButton mChatButton = (ImageButton) view.findViewById(R.id.chat);
        mChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.group_info:
                        Intent chatActivity = new Intent(getActivity(), Chat.class);
                        startActivity(chatActivity);
                        break;
                }
            }
        });
         */

        ImageButton mDashboardButton = view.findViewById(R.id.dashboardButton);
        mDashboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.dashboardButton:
                        Intent dashboardActivity = new Intent(getActivity(), Dashboard.class);
                        startActivity(dashboardActivity);
                        break;
                }
            }
        });
        /* TODO: do the same thing for Tasks button
        ImageButton mTasksButton = (ImageButton) view.findViewById(R.id.tasksButton);
        mTasksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.tasksButton:
                        Intent tasksActivity = new Intent(getActivity(), Tasks.class);
                        startActivity(tasksActivity);
                        break;
                }
            }
        });
         */

        ImageButton mGroupInfoButton = (ImageButton) view.findViewById(R.id.group_infoButton);
        mGroupInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.group_infoButton:
                        Intent groupInfoActivity = new Intent(getActivity(), GroupInfo.class);
                        startActivity(groupInfoActivity);
                        break;
                }
            }
        });

        return view;
    }
}
