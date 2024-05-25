package cl.patofer.ferji.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class FerjiController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String helloWorld(@RequestParam String var){
        return "Hello world " + var;
    }

}
