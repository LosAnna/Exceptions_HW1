/** Реализуйте 3 метода, чтобы в каждом из них получить разные исключения*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws Exceptions, IOException, NumberFormatException {
        Task1 task1 = new Task1();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder weight;
        System.out.print("Input your weight: ");

        //* test1*/
        weight  = task1.inputWeight1(reader);

        //* test2*/
//        weight  = task1.inputWeight2(reader);

        //* test3*/
//        weight  = task1.inputWeight3(reader);

        System.out.println("Data accepted: " + weight + "kg");
    }
    public StringBuilder inputWeight1(BufferedReader r) throws  IOException{
        StringBuilder w1 = new StringBuilder(r.readLine());
        if (w1.length() == 0) {
            throw new IOException("Input can not be empty!");
        }
        return w1;
    }
    public StringBuilder inputWeight2(BufferedReader r) throws Exceptions, IOException {
        StringBuilder w2 = new StringBuilder(r.readLine());
        if (Integer.parseInt(w2.toString().trim()) <= 0) {
            throw new Exceptions("Weight can not be zero or negative!");
        }
        return w2;
    }
    public StringBuilder inputWeight3(BufferedReader r) throws IOException {
        StringBuilder w3 = new StringBuilder(r.readLine());
        try {
            Integer.parseInt(w3.toString());
        } catch (NumberFormatException e) {
            System.out.println("Weight has to be a number!");
            System.exit(0);
        }
        return w3;
    }
}