package insa.ihm;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class GroupInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_list);
        String[] noms = new String[] {"A", "B", "C"};

        ListView view = (ListView) findViewById(R.id.member_list_view);

        ArrayAdapter<String> adapter = new MemberListAdapter(this, noms);
        view.setAdapter(adapter);




    }



}
