package net.lzw;


import net.lzw.interfaces.GrowUpInterface;
import net.lzw.interfaces.People;
import net.lzw.interfaces.SpeakInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 2015/12/31
 */
@Controller
public class SpeakController
{
    private static final int age = 18;

    @Resource
    private SpeakInterface speakInterface;

    @Resource
    private GrowUpInterface growUpInterface;

    @RequestMapping("/index.htm")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        //假设获取到了对象
        People people = new People();
        people.setAge(age);

        people = growUpInterface.addAge(people);

        String result = speakInterface.speak(people);


        //封装进model
        model.addAttribute("result",result);
        return "index";
    }
}
