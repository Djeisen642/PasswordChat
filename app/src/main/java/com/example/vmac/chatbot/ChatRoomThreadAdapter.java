package com.example.vmac.chatbot;

/**
 * Created by VMac on 17/11/16.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;



public class ChatRoomThreadAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private int SELF = 100;
    private Context mContext;
    private ArrayList<Message> messageArrayList;


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView message, timestamp;

        public ViewHolder(View view) {
            super(view);
            message = (TextView) itemView.findViewById(R.id.message);
            //timestamp = (TextView) itemView.findViewById(R.id.timestamp);
        }
    }


    public ChatRoomThreadAdapter(Context mContext,ArrayList<Message> messageArrayList) {
        this.mContext = mContext;
        this.messageArrayList=messageArrayList;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        // view type is to identify where to render the chat message
        // left or right
        if (viewType == SELF) {
            // self message
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.chat_item_self, parent, false);
        } else {
            // WatBot message
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.chat_item_watson2, parent, false);
        }


        return new ViewHolder(itemView);
    }


    @Override
    public int getItemViewType(int position) {
        Message message = messageArrayList.get(position);
        if (message.getId().equals("1")) {
            return SELF;
        }

        return position;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        Message message = messageArrayList.get(position);
        message.setMessage(message.getMessage());
        ((ViewHolder) holder).message.setText(message.getMessage());

       /* if(message.getId().equals("2"))
        {
            String timestamp = "Watson Says";
            ((ViewHolder) holder).timestamp.setText(timestamp);
        }*/
        }



    @Override
    public int getItemCount() {
       // if(messageArrayList !=null) {
            return messageArrayList.size();
        //}
       // return 1;
    }


}