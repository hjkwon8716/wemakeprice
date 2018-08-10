package joon.wmp.util.sp.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class DefaultResource {
    //
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        //
        return "index";
    }

}
