package exercises;

public class TriangleExercise {

    public void easiestExerciseEver(){
        System.out.println("*");
        System.out.println();
    }

    public void drawHorizontalLine(int numberOfColumns){

        for(int i=0;i<numberOfColumns;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void drawVerticalLine(int numberOfRows){
        for(int i=0;i<numberOfRows;i++){
            System.out.println("*");
        }
        System.out.println();
    }

    public void drawARightTriangle(int numberOfStages){
        for(int i=1;i<=numberOfStages;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        System.out.println();
    }
}
