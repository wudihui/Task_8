package com.fanchen.rmi;

/**
 * Created by Administrator on 2017/8/30.
 */
import org.apache.log4j.Logger;
public class MobileAccountServiceImpl implements AccountService {

    private static final Logger LOG = Logger.getLogger(MobileAccountServiceImpl.class);
    public int queryBalance(String mobileNo) {
        if (mobileNo != null)
            return 100;
        return 0;
    }

    public String shoopingPayment(String mobileNo, byte protocol) {
        StringBuffer sb = new StringBuffer("你好这是服务器001");
        LOG.info("服务器说: " + sb.toString());
        return sb.toString();
    }
}