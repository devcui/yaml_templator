package com.github.devcui.yaml.templator.web;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.devcui.yaml.templator.entity.YamlMeta;
import com.github.devcui.yaml.templator.vo.YamlParam;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

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
    public ResponseEntity<?> convert(@RequestBody YamlParam param) throws Exception {
        System.out.println(param.toString());
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        JsonNode data = convertStringToJsonNode(param.getJson());
        Yaml yaml = new Yaml(options);
        Map<String, Object> dataMap = convertJsonNodeToMap(data);
        System.out.println(yaml.dump(dataMap));
        return ResponseEntity.ok(yaml.dump(dataMap));
    }

    private static JsonNode convertStringToJsonNode(String jsonString) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readTree(jsonString);
    }

    private static Map<String, Object> convertJsonNodeToMap(JsonNode jsonData) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(jsonData, Map.class);
    }
}
