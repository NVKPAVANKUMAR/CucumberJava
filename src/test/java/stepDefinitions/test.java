package stepDefinitions;

public class test {

    public static void main(String[] args) {
        String str = System.getProperty("os.name");
        boolean status = System.getProperty("os.name").toUpperCase().contains("WINDOWS");
        System.out.println(str + " "+status);
        String osname = "Linux";
        System.out.println(osname.toUpperCase());
    }
}
