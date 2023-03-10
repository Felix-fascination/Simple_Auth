package cgpb.ottp.jtdsmyHtml.dao.impl;

import cgpb.ottp.jtdsmyHtml.dao.ClientDao;
import cgpb.ottp.jtdsmyHtml.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
@RequiredArgsConstructor
public class ClientDaoImpl implements ClientDao {
    private final JdbcTemplate jdbcTemplate;
    @Override
    public Client findClientByLogin(String login) {
        String sql = "SELECT * FROM CLIENT_M WHERE LOG = ?";
        Client client  = jdbcTemplate.queryForObject(sql,(rs, rowNum) -> makeClient(rs), login);
        return client;
    }

    private Client makeClient (ResultSet rs) throws SQLException {
        long id = rs.getLong("ID");
        String login = rs.getString("LOG");
        String password = rs.getString("PWD");
        return new Client(id, login, password);
    }
}
