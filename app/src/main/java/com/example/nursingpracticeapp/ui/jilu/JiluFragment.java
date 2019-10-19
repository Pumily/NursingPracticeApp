package com.example.nursingpracticeapp.ui.jilu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.nursingpracticeapp.ChatActivity;
import com.example.nursingpracticeapp.MainActivity;
import com.example.nursingpracticeapp.R;

public class JiluFragment extends Fragment {

    private JiluViewModel dashboardViewModel;

    /*记录菜单页面逻辑*/
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(JiluViewModel.class);
        View root = inflater.inflate(R.layout.fragment_jilu, container, false);
        ImageView jilu_detail = root.findViewById(R.id.jilu_detail1);
        jilu_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChatActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }
}