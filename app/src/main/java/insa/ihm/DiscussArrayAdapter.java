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

/** from https://stackoverflow.com/questions/27466397/trying-create-a-chat-with-fragment **/
public class DiscussArrayAdapter extends ArrayAdapter<BaseMessage> {

    private TextView newMessage;
    private List<BaseMessage> messages = new ArrayList<BaseMessage>();
    private LinearLayout wrapper;

    public DiscussArrayAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(BaseMessage object) {
        messages.add(object);
        super.add(object);
    }

    public int getCount() {
        return this.messages.size();
    }

    public BaseMessage getItem(int index) {
        return this.messages.get(index);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_messages_chat, parent, false);
        }

        wrapper = (LinearLayout) row.findViewById(R.id.wrapper);

        BaseMessage message = getItem(position);

        newMessage = (TextView) row.findViewById(R.id.comment);

        newMessage.setText(message.getMessage());

        newMessage.setBackgroundResource(message.isBelongsToCurrentUser() ? R.drawable.chat_bubble_sent : R.drawable.chat_bubble_received);
        wrapper.setGravity(message.isBelongsToCurrentUser() ? Gravity.RIGHT : Gravity.LEFT);

        return row;
    }

}