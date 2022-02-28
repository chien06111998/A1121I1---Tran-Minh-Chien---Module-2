package class_and_object.thuc_hanh.bai_tap.stop_watch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] num = new int[100000000];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100000000);
        }
        StopWatch stopWatch = new StopWatch();
        Arrays.sort(num);
        stopWatch.end();
        System.out.print("Milisecond: " + stopWatch.getElapsedTime());
    }
}
