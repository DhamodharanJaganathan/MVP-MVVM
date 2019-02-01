package com.journaldev.hellomvp.MVP;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.journaldev.hellomvp.R;

public class FirstActivity extends AppCompatActivity implements FirstActivityView {


  EditText editText1, editText2;
  Button button;

  FirstActivityPresenterImp firstActivityPresenterImp;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.first_activity);
    editText1 = findViewById(R.id.editText);
    editText2 = findViewById(R.id.editText2);
    button = findViewById(R.id.bottom1);

    firstActivityPresenterImp = new FirstActivityPresenterImp(this);

    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        firstActivityPresenterImp
            .handellogin(editText1.getText().toString(), editText2.getText().toString());
      }
    });


  }

  @Override
  public void errorMsg() {
    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
  }

  @Override
  public void loginsucess() {
    Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();

  }

  @Override
  public void loginfail() {
    Toast.makeText(this, "fail", Toast.LENGTH_SHORT).show();
  }
}
