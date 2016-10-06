package net.lzw;


import net.lzw.interfaces.GrowUpInterface;
import net.lzw.interfaces.People;

/**
 * 2015/11/8
 */
public class GrowUpInterfaceImpl implements GrowUpInterface {
    public People addAge(People people) {
        System.out.println("provider2 methode is invoking");
        people.setAge(people.getAge()+1);
        return people;
    }
}
