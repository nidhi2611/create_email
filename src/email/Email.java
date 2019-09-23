package email;

import user.User;

import java.util.Scanner;

public class Email {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of test cases");
        int n = sc.nextInt();
        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = Integer.parseInt(sc.next());
            String company = sc.next();
            users[i] = new User(name, age, company);

        }
        for (int j = 0; j < n; j++) {
            System.out.println(users[j].createEmail());
        }

    }
}
