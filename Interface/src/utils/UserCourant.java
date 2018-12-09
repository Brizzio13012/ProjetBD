package utils;

public class UserCourant {
    public static boolean admin;

    public static boolean isAdmin() {
        return admin;
    }

    public static void setAdmin(boolean admin) {
        UserCourant.admin = admin;
    }
}
