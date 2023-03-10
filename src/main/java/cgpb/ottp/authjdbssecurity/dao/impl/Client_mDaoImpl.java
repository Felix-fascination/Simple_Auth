package cgpb.ottp.authjdbssecurity.dao.impl;

import cgpb.ottp.authjdbssecurity.dao.ClientDao;
import cgpb.ottp.authjdbssecurity.model.Client_m;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@RequiredArgsConstructor
@Slf4j
public class Client_mDaoImpl implements ClientDao {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public Client_m findClientByLogin(String login) {
        String sql = "SELECT * FROM CLIENT_M WHERE LOG = ?";
        Client_m client_m  = jdbcTemplate.queryForObject(sql,(rs, rowNum) -> makeClient(rs), login);
        return client_m;
    }

    @Override
    public void deleteClientById(long id) {
        String sql = "DELETE FROM CLIENT_M WHERE ID = ?";
        jdbcTemplate.update(sql);
    }

    @Override
    public Client_m createClient(Client_m client) {
        String sql = "INSERT INTO CLIENT_M (LOG, PWD";
        jdbcTemplate.update(sql, client.getLogin(), client.getPassword());
        return client;
    }


  /*  @Override
    public Client_m findClientByLoginAndPassword(String login, String password) {
        Client_m client_m = findClientByLogin(login);
        return null;
    }*/

    private Client_m makeClient (ResultSet rs) throws SQLException {
        long id = rs.getLong("ID");
        String login = rs.getString("LOG");
        String password = rs.getString("PWD");
        return new Client_m(id, login, password);
    }
}
