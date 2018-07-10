package com.hari.firstapponmac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.hari.firstapponmac.adapters.MessageAdapter;
import com.hari.firstapponmac.models.ChatMessage;
import com.hari.firstapponmac.utils.ReplyUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Button btnSend;
    private EditText editText;
    private List<ChatMessage> chatMessages;
    private ArrayAdapter<ChatMessage> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chatMessages = new ArrayList<>();

        //init UI
        listView = findViewById(R.id.outputListView);
        btnSend = findViewById(R.id.sendBtn);
        editText = findViewById(R.id.inputEditText);

        //set ListView adapter first
        adapter = new MessageAdapter(this, R.layout.input_chat_item, chatMessages);
        listView.setAdapter(adapter);

        //event for button SEND
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //process when input message is empty
                if (editText.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Please input some text...", Toast.LENGTH_SHORT).show();
                } else {
                    //add input message to list
                    String inputValue = editText.getText().toString();
                    chatMessages.add(new ChatMessage(inputValue, true));
                    adapter.notifyDataSetChanged();

                    //reply
                    String outputValue = ReplyUtils.reply(inputValue);
                    chatMessages.add(new ChatMessage(outputValue, false));
                    adapter.notifyDataSetChanged();
                    editText.setText("");
                }
            }
        });
    }
}
