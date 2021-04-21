package PatternsJavaDemo.Strategy.start;

import PatternsJavaDemo.Strategy.auth.UserChecker;
import PatternsJavaDemo.Strategy.strategy.DBAuth;
import PatternsJavaDemo.Strategy.strategy.FileAuth;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();

        userChecker.check(new DBAuth("jdbc://lel"));

        userChecker.check(new FileAuth(new File("c:\\file.txt")));
    }
}
