package com.spring.mvc;

import com.spring.mvc.model.Person;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("msg", "Spring 3 MVC Hello World");
        model.addAttribute("name", "yuntao");
        return "hello";
    }
    @RequestMapping(value = "/person")
    public String toPerson(String name,int age) {
        System.out.print(name+" "+age);
        return "hello";
    }
    @RequestMapping(value = "/person1")
    public String toPerson(Person person) {
        System.out.print(person.getName()+" "+person.getAge());
        return "hello";
    }
    @RequestMapping(value = "/date")
    public String date(Date date) {
        System.out.printf(date.toString());
        return "hello";
    }
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }
    @RequestMapping(value = "/show")
    public String showPerson(Map<String,Object> map) {
        Person p = new Person();
        map.put("p",p);
        p.setAge(20);
        p.setName("Tom");
        return "show";
    }
    @RequestMapping(value = "/getPerson")
    @ResponseBody
    public void getPerson(String name1,PrintWriter pw) {
        System.out.println("name1 = [" + name1 + "]");
        pw.write("hello," + name1);
    }
    @RequestMapping("/name")
    public String sayHello() {
        return "name";
    }

}
