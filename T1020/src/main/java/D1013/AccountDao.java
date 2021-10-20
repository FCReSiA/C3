package D1013;
import java.util.List;

public interface AccountDao {
    public void transfer(String outUser, String inUser , Double money);
    public  int addAccount(Account account);
    public int deleteAccount(int i);
    public Account findAccountbyid(int i);
    public List<Account> findAllAccount();
    public int updateAccount(Account account);
}
