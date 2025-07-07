package co.com.neofile.model.users;
import co.com.neofile.model.persons.Persons;
import co.com.neofile.model.roles.Roles;
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
public class Users {
    private Long id;
    private String username;
    private String password;
    private boolean enabled;
    private Persons persons;
    private List<Roles> roles;
}
