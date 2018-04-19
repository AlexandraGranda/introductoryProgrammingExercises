package exercises;

public class DiamondExercises {

    public void isoscelesTriangle(int numberOfStages) {

        printUpperDiamond(numberOfStages);
    }

    public void diamond(int numberOfStages) {

        printUpperDiamond(numberOfStages);

        for (int i = numberOfStages-1; i > 0 ; i--) {
            for (int j = i; j <= numberOfStages-1 ; j++) {
                System.out.print(" ");
            }

            for (int j = (i*2)-1; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void diamondWithName(int numberOfStages){
        for (int i = 1; i <=numberOfStages; i++) {

            if (i==numberOfStages){
                System.out.println("Alex");
            }
            else {
                for (int j = i; j <= numberOfStages-1; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <=(i*2)-1; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        for (int i = numberOfStages-1; i > 0 ; i--) {
            for (int j = i; j <= numberOfStages-1 ; j++) {
                System.out.print(" ");
            }

            for (int j = (i*2)-1; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printUpperDiamond(int numberOfStages){
        for (int i = 1; i <=numberOfStages; i++) {
            for (int j = i; j <= numberOfStages-1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
