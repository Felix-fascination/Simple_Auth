package cgpb.ottp.authjdbssecurity.model;

import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Client_m {
    private long id;

    @NonNull
    private String login;
    @NonNull
    private String password;

}
