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
    public Output getOutput(@RequestParam("inputValue") String inputValue, @RequestParam(name="condition", defaultValue = "1") String conditionStr) {
        //
        return outputService.getOutput(inputValue, Integer.parseInt(conditionStr));
    }

    @GetMapping(value = "step1")
    public String getOutputStep1(@RequestParam("inputValue") String inputValue) {
        //
        return outputService.getOutputStep1(inputValue);
    }

    @GetMapping(value = "step2")
    public String getOutputStep2(@RequestParam("inputValue") String inputValue) {
        //
        return outputService.getOutputStep2(inputValue);
    }
}
