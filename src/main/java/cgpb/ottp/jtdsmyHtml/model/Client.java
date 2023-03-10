package cgpb.ottp.jtdsmyHtml.model;

import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Client {
    private long id;

    @NonNull
    private String login;

    @NonNull
    private String password;
}
