package cgpb.ottp.authjdbssecurity.service;

import cgpb.ottp.authjdbssecurity.dto.Client_mDto;
import cgpb.ottp.authjdbssecurity.model.Client_m;
import cgpb.ottp.authjdbssecurity.utils.ClientConvertor;
import org.springframework.stereotype.Service;

@Service
public class Client_mService {
    ClientConvertor clientConvertor;

    public Client_m createClient(Client_mDto clientMDto){
            return new Client_m(clientMDto.getLogin(), clientMDto.getPassword());
    }
}
