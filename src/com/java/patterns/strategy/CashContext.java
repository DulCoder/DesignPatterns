package com.java.patterns.strategy;

import com.java.patterns.strategy.impl.CashNormal;
import com.java.patterns.strategy.impl.CashRebate;
import com.java.patterns.strategy.impl.CashReturn;

/**
 * Created by zhengxianyou on 2018/4/29 0029.
 */
public class CashContext {
    private CashSuper cs;

    public CashContext(int type) {
        switch (type){
            case 1:  //正常收费
                cs = new CashNormal();
            break;
            case 2:  //折扣收费
                cs = new CashRebate(0.8);
                break;
            case 3:  //返利收费
                cs = new CashReturn(300,100);
                break;
        }
    }

    /**
     * 计算最终收费金额
     *
     * @param money
     * @return
     */
    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
