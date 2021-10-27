package D1013;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbcTemplate=new JdbcTemplate();

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addUser(User user) {
        String sql="insert into user(username,password,sex) values(?,?,?)";

        return jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getSex());
    }

    @Override
    public int deleteUser(int i) {
        String sql="delete from user where id=?";

        return jdbcTemplate.update(sql,i);
    }


    public User findUserbyid(int i) {
        String sql="select * from user where id=?";
        List<User> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class),i);
        return list.get(0);
    }


    public List<User> findAllUser() {
        String sql="select * from User";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
    }


    public int updateUser(User user) {
        String sql="update user set username=?,password=?,sex=? where id=?";
        return jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getSex(),user.getId());
    }


    public int findusernamecount() {
        String sql="select count(*) from user where username=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{"test"},Integer.class);
    }
}
