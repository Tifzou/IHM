package insa.ihm;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Todo_Detail extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_todo_detail, container, false);


        Button returnButton = (Button) view.findViewById(R.id.returnButton);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) getActivity().findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new Todo_List(), "").commit();
            }
        });

        return view;
    }

}