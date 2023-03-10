package cgpb.ottp.jtdsmyHtml.dao;

import cgpb.ottp.jtdsmyHtml.model.Client;

public interface ClientDao {
    public Client findClientByLogin(String login);
}
