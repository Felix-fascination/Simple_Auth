package cgpb.ottp.jtdsmyHtml.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Authorization {
    @PostMapping("/checkValidAuthData")
    public String validateClient(Model model){
        return "greeting.html";
    }
}
