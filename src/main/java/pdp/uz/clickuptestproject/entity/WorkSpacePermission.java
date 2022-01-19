package pdp.uz.clickuptestproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pdp.uz.clickuptestproject.entity.enums.Permission;
import pdp.uz.clickuptestproject.entity.template.AbstractEntity;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkSpacePermission extends AbstractEntity {
    @OneToOne
    private WorkSpaceRole workSpaceRole;

    @Enumerated(value = EnumType.STRING)
    @ElementCollection
    private List<Permission> permissionList;
}
