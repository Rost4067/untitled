/*public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++)
            System.out.println(i + " * 3 = " + i*3);
    }
}
*/



public class Main {
    public static void main(String[] args) {

        int result = 0;
        for(int i=100; i>0; i--){
            result = result+i;
        }
        System.out.println("My sum" + result/100);

    }
}