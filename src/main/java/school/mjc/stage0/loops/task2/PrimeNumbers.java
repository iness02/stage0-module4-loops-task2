package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int flag;
        if(printToInclusive==0||printToInclusive==1){
            System.out.print("");
            return;
        }
        for (int i = 2; i <= printToInclusive; i++) {
            flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1)
                System.out.println(i);
        }
    }
}
