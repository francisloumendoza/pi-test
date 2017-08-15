package au.com.revelian;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RestController
public class PiController {

    @Resource
    private PiService piService;

    @RequestMapping("/")
    public String index() {
        double pi = piService.calculatePi();
        return "Approximate value of pi is: " + pi;
    }

}
