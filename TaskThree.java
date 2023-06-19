public class TaskThree {

    public static void main(String[] args){
        int n = 3;
        int i = (int) (Math.random()*120);
        int x = 0;
        System.out.print("Число " + i + " " + "- ");
        while (x++ < i) {
            if ((x % n) == 0) {
                System.out.print(x + ", ");
            }
        }
    }
}
