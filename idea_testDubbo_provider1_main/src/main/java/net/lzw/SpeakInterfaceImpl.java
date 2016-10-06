package net.lzw;

import net.lzw.interfaces.GrowUpInterface;
import net.lzw.interfaces.People;
import net.lzw.interfaces.SpeakInterface;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Author：lzw
 * Email: 372777648@qq.com
 * Create Date：2016/10/5
 * Depiction：
 * Version: V1.0.0
 */
@Component("speakInterface")
public class SpeakInterfaceImpl implements SpeakInterface {
     @Resource
     private GrowUpInterface growUpInterface;

    public String speak(People people) {
        System.out.println("provider1 methode is invoking");
        return "dubbo return "+people.getAge()+"---"+growUpInterface.addAge(people).getAge();
    }
}
