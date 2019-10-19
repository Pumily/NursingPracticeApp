package com.example.nursingpracticeapp.ui.wode;

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

public class WodeFragment extends Fragment {

    private WodeViewModel notificationsViewModel;

    /*我的信息菜单页面逻辑*/
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(WodeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_wode, container, false);
        Button mbt_logoout = root.findViewById(R.id.btn_logoout);
        mbt_logoout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }
}