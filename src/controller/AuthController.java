package controller;

public class AuthController {
    public static boolean isPlayer(String phoneNumber, String password) {
        if (phoneNumber.equals("07512040914" )&&password.equals("blnd")) {
            return true;
        }
        return false;
    }
    public static boolean isFieldOwner(String phoneNumber, String password) {
        if (phoneNumber.equals("07512040914" )&&password.equals("blnd00")) {
            return true;
        }
        return false;
    }
}
