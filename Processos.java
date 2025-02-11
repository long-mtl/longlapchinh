
package OOP;
import java.util.Scanner;
import java.util.ArrayList;

public class Processos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> Cars=new ArrayList<>();
        System.out.println("Nhap xe 1:");
        String model = scanner.nextLine();
        System.out.println("Nhap nam xe 1:");
        int year = scanner.nextInt();
        scanner.nextLine();

        Car myCar = new Car(model, year);
        Cars.add(myCar);
        System.out.println("Nhap xe 2:");
        String model2 = scanner.nextLine();
        System.out.println("Nhap nam xe 2:");
        int year2 = scanner.nextInt();
        Car myCar2 = new Car(model2, year2);
        Cars.add(myCar2);
        for(Car car:Cars){
            car.displayDetails();
        }

    }
}
