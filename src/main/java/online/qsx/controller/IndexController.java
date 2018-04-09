package online.qsx.controller;

import online.qsx.server.DirectionServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {

    @Autowired
    private DirectionServer directionServer;

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("directions",directionServer.findDirection());
        return "index";
    }


}
