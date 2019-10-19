package com.example.nursingpracticeapp.ui.wode;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WodeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WodeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("我的信息");
    }

    public LiveData<String> getText() {
        return mText;
    }
}