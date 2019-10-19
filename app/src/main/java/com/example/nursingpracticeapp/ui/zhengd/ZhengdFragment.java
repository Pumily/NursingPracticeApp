package com.example.nursingpracticeapp.ui.zhengd;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.nursingpracticeapp.ChatActivity;
import com.example.nursingpracticeapp.MainActivity;
import com.example.nursingpracticeapp.R;

public class ZhengdFragment extends Fragment {

//    菜单诊断模块
    private ZhengdViewModel homeViewModel;

    /*诊断菜单页页面逻辑*/
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(ZhengdViewModel.class);
        View root = inflater.inflate(R.layout.fragment_zhengd, container, false);
        final TextView textView = root.findViewById(R.id.btn_zhengd);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText("开始诊断");
            }
        });
        Button mbt_zhengd = root.findViewById(R.id.btn_zhengd);
        mbt_zhengd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChatActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }
}