package insa.ihm;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.Pair;
import java.util.List;
import java.util.ResourceBundle;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MemberListAdapter extends ArrayAdapter<Pair<String, Boolean>> {


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View rowView = inflater.inflate(R.layout.member_layout, parent, false);


        TextView textView = (TextView) rowView.findViewById(R.id.name);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        ImageView presence = (ImageView) rowView.findViewById(R.id.presence_macaron);

        if (getItem(position).second)
            presence.setBackgroundResource(android.R.drawable.presence_online);
        else
            presence.setBackgroundResource(android.R.drawable.presence_invisible);


        textView.setText(getItem(position).first);

        if(convertView == null) {
            imageView.setImageResource(R.drawable.contact);
        }else
            rowView = convertView;

        return rowView;
    }

    public MemberListAdapter(Context context, List<Pair<String, Boolean>> values) {
        super(context, R.layout.member_layout, values);
    }
}
