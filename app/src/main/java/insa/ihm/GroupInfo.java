package insa.ihm;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class GroupInfo extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_member_list, container, false);


        List<Pair<String, Boolean>> membres = new ArrayList<>();
        membres.add(new Pair<>("Nom 1, prenom 1", true));
        membres.add(new Pair<>("Nom 2, prenom 2", false));
        membres.add(new Pair<>("Nom 3, prenom 3", true));

        ListView listView = (ListView) view.findViewById(R.id.member_list_view);

        ArrayAdapter<Pair<String, Boolean>> adapter = new MemberListAdapter(getActivity(), membres);
        listView.setAdapter(adapter);

        return view;
    }



    }
