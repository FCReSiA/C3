package D1013;

import java.util.List;

public interface UserDao {
    public int addUser(User user);
    public int deleteUser(int i);
    public User findUserbyid(int i);
    public List<User> findAllUser();
    public int updateUser(User user);
    public int findusernamecount();
}
