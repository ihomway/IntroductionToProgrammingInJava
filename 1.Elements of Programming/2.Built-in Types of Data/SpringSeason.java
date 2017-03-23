public class SpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        
        boolean isSpringSeason = (m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && m <= 20);
        
        println(isSpringSeason);
    }
}