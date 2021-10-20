package D1013;


import D1013.AccountDao;
import D1013.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int addAccount(Account account) {
        String sql="insert into account(username,balance) values(?,?)";

        return jdbcTemplate.update(sql,account.getUsername(),account.getBalance());
    }


    public int deleteAccount(int i) {
        String sql="delete from account where id=?";

        return jdbcTemplate.update(sql,i);
    }


    public Account findAccountbyid(int i) {
        String sql="select * from account where id=?";
        List<Account> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper<Account>(Account.class),i);
        return list.get(0);
    }

    public List<Account> findAllAccount() {
        String sql="select * from account";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<Account>(Account.class));
    }


    public int updateAccount(Account account) {
        String sql="update account set username=?,balance=? where id=?";
        return jdbcTemplate.update(sql,account.getUsername(),account.getBalance(),account.getId());
    }
}
