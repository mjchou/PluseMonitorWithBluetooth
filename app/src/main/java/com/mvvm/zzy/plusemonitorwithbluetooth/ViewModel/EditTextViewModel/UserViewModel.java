package com.mvvm.zzy.plusemonitorwithbluetooth.ViewModel.EditTextViewModel;

import android.text.Editable;
import android.text.TextWatcher;

import com.mvvm.zzy.plusemonitorwithbluetooth.Model.Bean.User;

/**
 * Created by Administrator on 2017/6/14 0014.
 */

public class UserViewModel {
    private User user;

    public UserViewModel(User user) {
        this.user = user;
    }

    public TextWatcher userNameWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            user.setName(editable.toString());
        }
    };

    public TextWatcher userPwdWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            user.setPassword(editable.toString());
        }
    };
}
