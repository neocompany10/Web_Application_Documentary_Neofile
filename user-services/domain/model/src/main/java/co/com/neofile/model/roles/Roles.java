package co.com.neofile.model.roles;
import co.com.neofile.model.permissions.Permissions;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Roles {
    private Long id;
    private String name;
    private String description;
    private List<Permissions> permissions;
}
