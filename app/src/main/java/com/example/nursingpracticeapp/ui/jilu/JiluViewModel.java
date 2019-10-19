package com.example.nursingpracticeapp.ui.jilu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JiluViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JiluViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("诊断记录");
    }

    public LiveData<String> getText() {
        return mText;
    }
}