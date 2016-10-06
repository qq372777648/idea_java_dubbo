package cunsumerTest;


import net.lzw.interfaces.EatInterface;
import net.lzw.interfaces.People;
import net.lzw.interfaces.SpeakInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.remoting.support.RemoteInvocation;
import org.springframework.remoting.support.RemoteInvocationResult;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

/**
 * 2015/11/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-dubbo-consumer.xml","classpath:spring-context.xml"})
public class BaseTest
{
        @Resource
        private SpeakInterface speakInterface;


        @Resource
        private EatInterface eatInterface;

        @Test
        public void test() throws InterruptedException {
                while (true)
                {
                        People people =   new People();
                        people.setAge(18);
                        people.setSex(0);
//                        System.out.println(speakInterface.speak(people));
                        System.out.println(eatInterface.eat(people));
                        Thread.sleep(new Random().nextInt(3000));
                }
        }





}
