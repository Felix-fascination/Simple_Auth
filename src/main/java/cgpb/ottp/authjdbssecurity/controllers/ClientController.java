package cgpb.ottp.authjdbssecurity.controllers;

import cgpb.ottp.authjdbssecurity.dto.Client_mDto;
import cgpb.ottp.authjdbssecurity.model.Client_m;
import cgpb.ottp.authjdbssecurity.service.Client_mService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class ClientController {
    private Client_mService clientMService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @PostMapping("/create")
    public Client_m createClient(Client_mDto clientMDto){
        Client_m clientMDto1 = clientMService.createClient(clientMDto);
        return clientMDto1;
    }

    @GetMapping("/login")
    public Client_m findClient(Client_mDto clientMDto){
        Client_m clientMDto1 = clientMService.createClient(clientMDto);
        return clientMDto1;
    }




}
