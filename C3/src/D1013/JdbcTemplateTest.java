package D1013;

import java.util.List;

public class JdbcTemplateTest {

    public void addAccountTest(){
        Account account=new Account();
        account.setUsername("AW");
        account.setBalance(55.00);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao;
        accountDao = applicationContext.getBean(AccountDao.class);
        accountDao.addAccount(account);
    }

    public void deleteAccountTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        accountDao.deleteAccount(3);
    }

    public void findAccountByidTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao dao = applicationContext.getBean(AccountDao.class);
        System.out.println(dao.findAccountbyid(1));
    }

    public void findAllAccountTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        List<Account> allAccount = accountDao.findAllAccount();
        for (Account account : allAccount) {
            System.out.println(account);
        }
    }

    public void UpdateAccountTest(){
        Account account=new Account();
        account.setUsername("SL");
        account.setBalance(62.00);
        account.setId(3);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        accountDao.updateAccount(account);
    }

    public void addUserTest(){
        User user=new User();
        user.setUsername("YHC");
        user.setPassword("987");
        user.setSex("2");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.addUser(user);
    }

    public void deleteUserTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.deleteUser(2);
    }

    public void findUserByidTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        System.out.println(userDao.findUserbyid(1));
    }

    public void findAllUserTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        List<User> allUser = userDao.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }

    public void UpdateUserTest(){
        User user=new User();
        user.setUsername("HJQ");
        user.setPassword("888");
        user.setSex("1");
        user.setId(2);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.updateUser(user);
    }

    public void findUsercount(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        System.out.println(userDao.findusernamecount());
    }

    private class ApplicationContext {
        public AccountDao getBean(Class<AccountDao> accountDaoClass) {
        }
    }

    private class ClassPathXmlApplicationContext extends ApplicationContext {
        public ClassPathXmlApplicationContext(String s) {
            super();
        }
    }
}
