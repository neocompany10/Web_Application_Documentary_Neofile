package co.com.neofile.model.persons;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Persons {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
