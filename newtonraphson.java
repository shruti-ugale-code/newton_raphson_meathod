public class newtonraphson {
    public static void main(String[] args) {
        System.out.println(search(40));

    }
    public static double search(double n){
        double x=n;
        double root;
        while (true) {

            root =  (0.5 * (x + (n / x)));
            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;

        }
        return root;
    }
}
