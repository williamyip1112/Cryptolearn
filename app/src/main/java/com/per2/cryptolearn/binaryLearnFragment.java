package com.per2.cryptolearn;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class binaryLearnFragment extends android.support.v4.app.Fragment
{
    private TextView article;
    private TextView video;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_binary_learn, container, false);
        wireWidgets(rootView);
        setListeners();
        return rootView;
    }
    public void setListeners()
    {
        article.setOnClickListener((View.OnClickListener) this);
        video.setOnClickListener((View.OnClickListener) this);
    }

    public void wireWidgets(View view)
    {
        article = view.findViewById(R.id.textView_main_article);
        video = view.findViewById(R.id.textView_main_video);
    }




}

