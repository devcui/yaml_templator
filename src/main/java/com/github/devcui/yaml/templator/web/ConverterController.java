package com.github.devcui.yaml.templator.web;

import com.github.devcui.yaml.templator.entity.YamlMeta;
import com.github.devcui.yaml.templator.vo.YamlParam;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/converter")
public class ConverterController {


    @GetMapping
    public ModelAndView page() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("message", "Hello from Thymeleaf!");
        return modelAndView;
    }

    @PostMapping
    public ResponseEntity<?> convert(@RequestBody YamlParam param) {
        System.out.println(param.toString());
        return null;
    }
}
