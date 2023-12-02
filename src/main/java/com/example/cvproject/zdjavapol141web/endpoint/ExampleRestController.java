package com.example.cvproject.zdjavapol141web.endpoint;

import com.example.cvproject.zdjavapol141web.ExampleResponse;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(path = "/api")
@Data
public class ExampleRestController {
    @RequestMapping(value = "/plainExample", method = RequestMethod.GET, params = "test")
    @ResponseBody
    public ExampleResponse getExample(String text) {
        return ExampleResponse.builder().text(text).build();
    }
}
