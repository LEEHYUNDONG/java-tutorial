package javaTutorial.reference;

public class multiDimensionArray {
    public static void main(String[] args) {
        int[][]mathScore = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("mathScores["+i+"]["+j+"] :"+mathScore[i][j]);
            }
        }
    }
}
