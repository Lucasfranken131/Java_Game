package System;

import java.io.IOException;

public class ClearScreen {
    public static void clrscr(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
            }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}