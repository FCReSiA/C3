package com.itheima.po;

public class Customer {
    private Integer id;
    private String username;
    private String jobs;
    private String phone;
    //ʡ��Getter��Setter����
    @Override
    public String toString() {
        return "Customer [id=" + id + ", username=" + username +
                ", jobs=" + jobs + ", phone=" + phone + "]";
    }

}
