package com.example.ex1_new;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Fragment of additional information about the sender
 */

public class MessageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);

        View layout = view.findViewById(R.id.fragment_message_layout);
        TextView textView = view.findViewById(R.id.fragment_message_text);

        layout.setBackgroundColor(
                ContextCompat.getColor(getContext(), R.color.colorAccent));

//        title.setText(message.getNameOfAuthor());
//        timestamp.setText(DateUtils.getRelativeTimeSpanString(message.getTimestamp(),
//                System.currentTimeMillis(), DateUtils.FORMAT_ABBREV_ALL));
//        content.setText(message.getContent());

        return view;

    }

}
