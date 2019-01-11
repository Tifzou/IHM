package insa.ihm;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

public class ProjectSummary extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.activity_summary, container, false);


        String[] projetsEnCours = new String[] {"Projet IHM", "PLD AGILE"};
        String[] archives = new String[] {"Web sémantique"};

        ListView listView1 = (ListView) view.findViewById(R.id.current_projects);

        ArrayAdapter<String> adapter1 = new ProjectListAdapter(getActivity(), projetsEnCours);
        listView1.setAdapter(adapter1);

        ListView listView2 = (ListView) view.findViewById(R.id.archives);

        ArrayAdapter<String> adapter2 = new ProjectListAdapter(getActivity(), archives);
        listView2.setAdapter(adapter2);

        Button deconnexionButton = (Button) view.findViewById(R.id.logout);
        deconnexionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // https://stackoverflow.com/a/33616390
                getActivity().finish();
            }
        });

        // https://github.com/commonsguy/cw-omnibus/blob/master/WidgetCatalog/Tab/app/src/main/java/com/commonsware/android/tabhost/TabDemo.java

        TabHost tabHost = (TabHost) view.findViewById(R.id.tabs);

        tabHost.setup();

        TabHost.TabSpec specs = tabHost.newTabSpec("tag1");
        specs.setContent(R.id.tab1);
        specs.setIndicator("Projets en cours");
        tabHost.addTab(specs);

        TabHost.TabSpec specs2 = tabHost.newTabSpec("tag2");
        specs2.setContent(R.id.tab2);
        specs2.setIndicator("Archives");
        tabHost.addTab(specs2);

        return view;
    }
}