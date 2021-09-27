package javaTutorial.reference;

public class advancedForLoop {
    public static void main(String[] args) {
        int[] scores = {94, 71, 84, 93, 86};

        int sum = 0;
        for (int score : scores){
            sum += score;
        }
        System.out.println(sum);
        double avg = (double)sum/scores.length;
        System.out.println(avg);
    }
}
