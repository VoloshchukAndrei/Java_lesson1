public class TaskTwo {

    private static int n = (int) (Math.random()*2000);;
    public static void main(String[] args) {
        System.out.print("Число " + n + " старший битовый номер: ");
//        while (true) {
//            if (n == 0 || n == 1) {
//                System.out.print(n);
//                break;
//            }
//            System.out.print(n % 2);
//            n >>= 1;
//        }
        int result = 0;
        while (n != 1) {
            n >>= 1;
            result++;
        }
        System.out.print(result);
    }

}
