package insa.ihm;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MemberListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] noms = new String[] {"A", "B", "C"};

        ListView view = (ListView) findViewById(R.id.member_list_view);

        if (view == null)
            System.out.println("XXXXXXXX");
        ArrayAdapter<String> adapter = new MemberListAdapter(this, noms);
        view.setAdapter(adapter);
    }



}
