package com.itheima.jdk;

public class JdkTest {
    public static void main(String[] args) {

        JdkProxy jdkproxy = new JdkProxy();

        UserDao userDao = new UserDaoImpl();

        UserDao userDao1 = (UserDao) jdkproxy.createProxy(userDao);

        userDao1.addUser();
        userDao1.deleteUser();

    }
}
