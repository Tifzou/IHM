package insa.ihm;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dashboard extends Fragment {


    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = Dashboard_ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
    }
*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_dashboard, container, false);

        ImageButton taskButton = (ImageButton) view.findViewById(R.id.tache_rest);
        taskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) getActivity().findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new Todo_List(), "").commit();
            }
        });

        /*ImageButton messageButton = (ImageButton) view.findViewById(R.id.dashboardButton);
        messageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new Dashboard(), "").commit();
            }
        });*/

        expandableListView = (ExpandableListView) view.findViewById(R.id.expandableListView);
        expandableListDetail = Dashboard_ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(getContext(), expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);

        return view;
    }
}