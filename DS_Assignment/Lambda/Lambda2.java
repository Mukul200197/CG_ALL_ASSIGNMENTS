interface prices {
    public String prices();
}

public class Lambda2 {
    public static void main(String[] args) {

        Integer i = 15000;
        prices p = () -> {
            if (i > 10000) {
                return "Accepted!";
            } else
                return "Not Accepted!";

        };
        System.out.println(p.prices());
    }


}