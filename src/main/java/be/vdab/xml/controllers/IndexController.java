package be.vdab.xml.controllers;

import be.vdab.xml.services.KwadraatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@Controller
@RequestMapping("/")
class IndexController {

    private final KwadraatService kwadraatService;
    IndexController(KwadraatService kwadraatService){
        this.kwadraatService = kwadraatService;
    }

    @GetMapping
    public ModelAndView Index(){
        return new ModelAndView("index","kwadraat",
                kwadraatService.kwadraat(4));
    }

}
