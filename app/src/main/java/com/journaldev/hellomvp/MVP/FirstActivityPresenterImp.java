package com.journaldev.hellomvp.MVP;

public class FirstActivityPresenterImp implements FirstActivityPresenter {

  FirstActivity firstActivity;

  public FirstActivityPresenterImp(FirstActivity firstActivity) {
    this.firstActivity = firstActivity;

  }


  @Override
  public void handellogin(String username, String password) {
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    if(username.matches(emailPattern) && password.length()>0){

      firstActivity.loginsucess();
    }
    else {
      firstActivity.loginfail();
    }


  }
}
