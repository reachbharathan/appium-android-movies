package utils;

import java.io.IOException;

/**
 * Package name java.utils
 * Created by Bharathan on 18/01/17.
 * Project Name appium-android-calculator
 */
public class ShellExecution {

  public static void clearAppData(){
    try {
      Runtime.getRuntime().exec("adb shell pm clear com.bitbar.movies");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
