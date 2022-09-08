package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {

        int number=0;
        int i=1;
        int fac=1;
        while(number<=printToInclusive){
            if(number==0){
                System.out.println(1);
                number++;

            }else {
                while (i<=number) {
                    fac*=i;
                    i++;
                }
                System.out.println(fac);
                i=1;
                fac=1;
                number++;
            }


        }
    }

    public static void main(String[] args) {
        printFactorialRow(3);
    }
}
