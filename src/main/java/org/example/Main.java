package org.example;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        userDAO.insertUser("Pradeep", "pradeep@gmail.com");
        userDAO.insertUser("pavan", "pavan@example.com");

        System.out.println("Users in database:");
        userDAO.getUsers();


        userDAO.updateUser(1, "John Updated", "john_updated@example.com");


        System.out.println("After update:");
        userDAO.getUsers();
        userDAO.deleteUser(2);
        System.out.println("After delete:");
        userDAO.getUsers();

        userDAO.deleteUser(1);
    }
}
