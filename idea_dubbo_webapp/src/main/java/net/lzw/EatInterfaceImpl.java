package net.lzw;

import net.lzw.interfaces.EatInterface;
import net.lzw.interfaces.People;
import org.springframework.stereotype.Component;

/**
 * Author：lzw
 * Email: 372777648@qq.com
 * Create Date：2016/10/5
 * Depiction：
 * Version: V1.0.0
 */
@Component("eatInterface")
public class EatInterfaceImpl implements EatInterface {

    public String eat(People p){
        System.out.println("invoke eat");
        return p.getAge()+"--eat--"+p.getSex();
    }
}
