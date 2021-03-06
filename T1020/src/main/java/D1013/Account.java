package D1013;

public class Account {
    private Integer id;
    private String username;
    private Double balance;

    public Double getBalance() {
        return balance;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    public void setBalance(Double balance){
        this.balance=balance;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public void  setUsername(String username){
        this.username=username;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}
