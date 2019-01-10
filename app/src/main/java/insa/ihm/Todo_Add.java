package insa.ihm;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class Todo_Add extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_todo_add, container, false);


        Button addButton = (Button) view.findViewById(R.id.validateButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View aview) {
                DrawerLayout layout = (DrawerLayout) getActivity().findViewById(R.id.main_layout);
                getFragmentManager().beginTransaction().replace(layout.getId(), new Todo_List(), "").commit();
            }
        });

        return view;
    }

}