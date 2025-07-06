package co.com.neofile.model.user;
import co.com.neofile.model.person.Person;
import co.com.neofile.model.role.Role;
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
public class User {
    private Long id;
    private String username;
    private String password;
    private boolean enabled;
    private Person person;
    private List<Role> roles;
}
