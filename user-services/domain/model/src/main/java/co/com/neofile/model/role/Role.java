package co.com.neofile.model.role;
import co.com.neofile.model.permission.Permission;
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
public class Role {
    private Long id;
    private String name;
    private String description;
    private List<Permission> permissions;
}
