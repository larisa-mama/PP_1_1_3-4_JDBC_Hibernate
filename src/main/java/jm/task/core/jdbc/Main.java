package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь

        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
       userService.saveUser("Tim", "Petrov", (byte) 25);
        userService.saveUser("Ivan", "Maximov", (byte) 36);
        userService.saveUser("Roman", "Sidorov", (byte) 47);
        userService.saveUser("Olga", "Rogova", (byte) 58);
             System.out.println(userService.getAllUsers());
       // userService.getAllUsers().forEach(System.out::println);*/
         userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
