package cgpb.ottp.authjdbssecurity.utils;

import cgpb.ottp.authjdbssecurity.dto.Client_mDto;
import cgpb.ottp.authjdbssecurity.model.Client_m;
import org.springframework.stereotype.Component;

@Component
public class ClientConvertor {
    public Client_mDto fromClientToClientDto (Client_m client_m){
        return Client_mDto.builder()
                .login(client_m.getLogin())
                .password(client_m.getPassword())
                .build();
    }

    public Client_mDto fromClientDtoToClient (Client_mDto clientMDto){
        return Client_mDto.builder()
                .login(clientMDto.getLogin())
                .password(clientMDto.getPassword())
                .build();
    }
}
