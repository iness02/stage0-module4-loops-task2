package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int number = 0;
        int p=1;
        int l=1;
        if (power >= 0) {
            while (number<=power){
                if(number==0){
                    System.out.println(1);
                    number++;
                }else {
                    for (int i = 1; i <= number; i++) {
                        p *= 2;
                    }
                    System.out.println(p);
                    p = 1;
                    number++;
                }
            }
        } else {
            System.out.println("too much power");
        }
    }
}
