public class SpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        
        boolean isSpringSeason;
        isSpringSeason = m >= 3 && m <= 6;
        isSpringSeason = isSpringSeason && (m == 3 && d >= 20);
        isSpringSeason = isSpringSeason && (m == 6 && d <= 20);
        
        System.out.println(isSpringSeason);
    }
}