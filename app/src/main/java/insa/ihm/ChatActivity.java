package insa.ihm;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Big thanks to https://blog.sendbird.com/android-chat-tutorial-building-a-messaging-ui
public class ChatActivity extends AppCompatActivity {

    private RecyclerView mMessageRecycler;
    private MessageListAdapter mMessageAdapter;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        mMessageRecycler = (RecyclerView) findViewById(R.id.reyclerview_message_list);

        // message list already in memory
        List<BaseMessage>messageList = new ArrayList<>();
        UserMessage sentMsg1 = new UserMessage();
        sentMsg1.message = "sent msg 1";
        messageList.add(sentMsg1);
        BaseMessage receivedMsg1 = new BaseMessage();
        receivedMsg1.message = "received msg 1";
        messageList.add(receivedMsg1);
        UserMessage sentMsg2 = new UserMessage();
        sentMsg2.message = "sent msg 2";
        messageList.add(sentMsg2);

        mMessageAdapter = new MessageListAdapter(this, messageList);
        mMessageRecycler.setLayoutManager(new LinearLayoutManager(this));
    }
}
