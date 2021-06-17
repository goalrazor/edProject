package com.example.educationproj;

public class Utils {

  private void privateMethod() {

  }

  public void publicMethod() {
    privateMethod();
  }

  private String stringMethod(String time, int date) {
    //придумывает название к скриншоту
    return "fhjkdls";
  }

  private void stringMethod(String time, int date) {
    //придумывает название к скриншоту
    String string = "fhjkdls";
  }

  private String stringMethod(String time) {
    //придумывает название к скриншоту
    return "fhjkdls";
  }

  private void makeScreenshot() {
    String screenshotName = stringMethod();
    //какая-то логика для делания скриншота
  }

}
