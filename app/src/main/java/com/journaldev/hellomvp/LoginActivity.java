package com.journaldev.hellomvp;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.journaldev.hellomvp.databinding.SecondMainBinding;

public class LoginActivity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.second_main);

    SecondMainBinding secondMainBinding = DataBindingUtil
        .setContentView(this, R.layout.second_main);
    secondMainBinding.setViewModel(new LoginViewModel());
    secondMainBinding.executePendingBindings();
  }

  @BindingAdapter({"toastMessage"})
  public static void runMe(View view, String message) {
    if (message != null)
      Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
  }
}
