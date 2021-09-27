package javaTutorial.reference;

public class ArrayCreatedByValueList {
    public static void main(String[] args) {
        int[] score = {83, 90, 87};

        System.out.println("score[0] :" + score[0]);
        System.out.println("score[1] :" + score[1]);
        System.out.println("score[2] :" + score[2]);

        int sum = 0;
        for(int i = 0;i <=2;i++){
            sum += score[i];
        }
        System.out.println("총 합 :" + sum);
    }
}
