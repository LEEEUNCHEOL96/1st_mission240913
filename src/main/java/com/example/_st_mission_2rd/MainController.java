package com.example._st_mission_2rd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/article")
    @ResponseBody
    public String mainTest(){
        return "article !";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/article_list";
    }
}
