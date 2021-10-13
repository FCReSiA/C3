package D1013;

import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {
    private  QueryRunner queryRunner;

    public  void  setQueryRunner(QueryRunner queryRunner){
        this.queryRunner = queryRunner;
    }
    public int addAccount(Account account){
        String sql = "insert into account values (null,?,?,?)";
        try{
            return queryRunner.update(sql,account.getId(),account.getUsername(),account.getBalance())
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
