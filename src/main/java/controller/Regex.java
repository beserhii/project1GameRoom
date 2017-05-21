package controller;

public interface Regex {
    String REGEX_MENU="^[1-4]{1}$";
    String REGEX_NUMBER="^[0-9]+$";
    String REGEX_AGE="^\\d{1,2}\\-\\d{1,2}$";
    String REGEX_AMOUNT="[0-9]+";
    String REGEX_STRING="[A-Za-z_-]*";
}
