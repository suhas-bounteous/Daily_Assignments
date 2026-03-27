package com.oops.learning;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();

        c1.accelerate(50);
        c2.accelerate(30);

        System.out.println("Car1 Speed: " + c1.currentSpeed);
        System.out.println("Car2 Speed: " + c2.currentSpeed);

        Box b1 = new Box();
        b1.width = 10;

        Box b2 = b1;
        b2.width = 50;

        System.out.println("b1 width: " + b1.width);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        Printer printer = new Printer();
        Document doc = new Document("Hello OOP!");
        doc.sendToPrinter(printer);

        Student s = new Student();
        s.setGpa(3.5);
        s.setGpa(5.0);

        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(200);
        System.out.println("Balance: " + acc.getBalance());

        new User();
        new User();
        System.out.println("Total Users: " + User.getTotalUsers());

        System.out.println(MathUtils.isEven(4));
        System.out.println(MathUtils.factorial(5));
        System.out.println(MathUtils.max(10, 20));

        MenuItem m1 = new MenuItem("Coffee", 100);
        MenuItem m2 = new MenuItem("Sandwich", 150);
        MenuItem m3 = new MenuItem("Cake", 200);

        Order order = new Order();
        order.addMenuItem(m1);
        order.addMenuItem(m2);
        order.addMenuItem(m3);

        order.printReceipt();
    }
}
