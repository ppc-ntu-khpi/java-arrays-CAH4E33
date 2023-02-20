package test;
import domain.Exercise;
public class TestResult {
    public static void main(String[] args) {
        Exercise test = new Exercise();
        test.setSize(10);
        test.GenArray();
        test.displayArray();
        test.updateArray();
        test.displayArray();

    }
}





