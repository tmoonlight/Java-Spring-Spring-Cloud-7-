package tmoonlight.srvapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tmoonlight.srvapi.service.DemoService;

import javax.annotation.Resource;

@RequestMapping("/demo")
@RestController
public class DemoController {

    @Resource
    DemoService demoService;

    @RequestMapping("test1")
    public String DemoDo(){


        return demoService.TeShao();
    }
}