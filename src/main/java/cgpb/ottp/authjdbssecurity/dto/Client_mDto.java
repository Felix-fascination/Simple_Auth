package cgpb.ottp.authjdbssecurity.dto;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class Client_mDto {
    private long id;

    @NonNull
    private String login;
    @NonNull
    private String password;
}
