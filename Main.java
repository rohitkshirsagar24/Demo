
package com.jetbrains;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            System.out.println("Opening notepad");
            Runtime runTime = Runtime.getRuntime();
            Process process = runTime.exec("notepad");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Closing notepad");
            process.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
