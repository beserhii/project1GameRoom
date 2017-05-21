package controller;

import view.View;


import java.util.Scanner;

public class InputController {

    public String inputWithScanner(View view, String regex){
        view.printMunu();

        Scanner sc = new Scanner(System.in);
        String valueWithScanner = sc.nextLine();

        while (!valueWithScanner.matches(regex)) {
            view.wrongInput();
            valueWithScanner = sc.nextLine();
        }
        return valueWithScanner;
    }
}
