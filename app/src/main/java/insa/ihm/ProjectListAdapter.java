package insa.ihm;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProjectListAdapter extends ArrayAdapter<String> {


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View rowView = inflater.inflate(R.layout.project_nav_layout, parent, false);


        TextView textView = (TextView) rowView.findViewById(R.id.project_text_view);

        textView.setText(getItem(position));

        return rowView;
    }

    public ProjectListAdapter(Context context, String[] values) {
        super(context, R.layout.project_nav_layout, values);
    }
}
