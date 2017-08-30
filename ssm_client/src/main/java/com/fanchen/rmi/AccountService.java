package com.fanchen.rmi;

/**
 * Created by Administrator on 2017/8/30.
 */
public interface AccountService {
    int queryBalance(String mobileNo);
    String shoopingPayment(String mobileNo, byte protocol);
}