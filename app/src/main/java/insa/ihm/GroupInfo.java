package insa.ihm;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class GroupInfo extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_member_list, container, false);

        String[] noms = new String[] {"A", "B", "C"};

        ListView listView = (ListView) view.findViewById(R.id.member_list_view);

        ArrayAdapter<String> adapter = new MemberListAdapter(getActivity(), noms);
        listView.setAdapter(adapter);

        return view;
    }



    }
