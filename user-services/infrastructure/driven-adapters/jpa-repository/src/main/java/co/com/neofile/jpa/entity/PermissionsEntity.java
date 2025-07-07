package co.com.neofile.jpa.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PermissionsEntity extends BaseEntity{


    @Column(unique = true, nullable = false)
    private String name;

    private String description;

}
