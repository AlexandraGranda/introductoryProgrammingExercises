package exercises;

public class Main {

    public static void main(String[] args) {

        TriangleExercise triangleExercise = new TriangleExercise();
        DiamondExercises diamondExercises = new DiamondExercises();
        FizzBuzzExercise fizzBuzzExercise = new FizzBuzzExercise();
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();

        triangleExercise.easiestExerciseEver();

        triangleExercise.drawHorizontalLine(4);

        triangleExercise.drawVerticalLine(4);

        triangleExercise.drawARightTriangle(4);

        diamondExercises.isoscelesTriangle(4);

        diamondExercises.diamond(4);

        diamondExercises.diamondWithName(3);

        fizzBuzzExercise.fizzBuzz();

        System.out.println(primeFactorsExercise.generate(30));
    }
}
