package cgpb.ottp.authjdbssecurity.dao;

import cgpb.ottp.authjdbssecurity.model.Client_m;

public interface ClientDao {
   /* public Client_m findClientByLoginAndPassword(String login, String password);*/

    public Client_m findClientByLogin(String login);

    public void deleteClientById(long id);

    public Client_m createClient(Client_m client);
}
