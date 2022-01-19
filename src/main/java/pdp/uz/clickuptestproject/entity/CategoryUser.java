package pdp.uz.clickuptestproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pdp.uz.clickuptestproject.entity.enums.TaskPermission;
import pdp.uz.clickuptestproject.entity.template.AbstractEntity;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class CategoryUser extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @OneToOne
    private Category category;

    @OneToMany
    private List<User> user;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<TaskPermission> taskPermission;

}
