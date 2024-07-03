package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");
        return "hello"; //hello.html을 렌더링 해라.
    }
    @GetMapping("hello-mvc")
    public String helloMVC(@RequestParam(value = "name") String name, Model mode) {
        mode.addAttribute("name", name);
        return "hello-template";
    }
}
