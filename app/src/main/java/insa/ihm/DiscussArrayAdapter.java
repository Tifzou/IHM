package insa.ihm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DiscussArrayAdapter extends ArrayAdapter<BaseMessage> {

    private TextView countryName;
    private List<BaseMessage> countries = new ArrayList<BaseMessage>();
    private LinearLayout wrapper;

    public DiscussArrayAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(BaseMessage object) {
        countries.add(object);
        super.add(object);
    }



    public int getCount() {
        return this.countries.size();
    }

    public BaseMessage getItem(int index) {
        return this.countries.get(index);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_messages_chat, parent, false);
        }

        wrapper = (LinearLayout) row.findViewById(R.id.wrapper);

        BaseMessage coment = getItem(position);

        countryName = (TextView) row.findViewById(R.id.comment);

        countryName.setText(coment.getMessage());

        countryName.setBackgroundResource(coment.isBelongsToCurrentUser() ? R.drawable.chat_bubble_sent : R.drawable.chat_bubble_received);
        wrapper.setGravity(coment.isBelongsToCurrentUser() ? Gravity.RIGHT : Gravity.LEFT);

        return row;
    }

    public Bitmap decodeToBitmap(byte[] decodedByte) {
        return BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);
    }

}