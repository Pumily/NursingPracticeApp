package com.example.nursingpracticeapp.ui.zhengd;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ZhengdViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ZhengdViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}