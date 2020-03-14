package Chapter1._5String._9Practice;

public class Test2 {
    public static void main(String[] args) {
        String str1 = "asdklfhawkjehfiuhasojdfakljhsdgfiahgroihalkfhgbaliuhschfiluosa";
        String str2 = "askdjfhaiugufherasiuhgfoladskuhfasdoilujfi;aehfgnvyudsgfap;sjoi";

        if (str1.substring(2, 24).equals(str2.substring(2, 24))) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
