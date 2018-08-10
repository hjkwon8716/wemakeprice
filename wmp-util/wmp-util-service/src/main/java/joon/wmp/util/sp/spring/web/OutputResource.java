package joon.wmp.util.sp.spring.web;

import joon.wmp.util.domain.Output;
import joon.wmp.util.service.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("outputs")
public class OutputResource {

    @Autowired
    private OutputService outputService;

    @GetMapping
    public Output getOutput(@RequestParam("inputValue") String inputValue, @RequestParam("condition") String condition) {
        return outputService.getOutput(inputValue, Integer.parseInt(condition));
    }
}
