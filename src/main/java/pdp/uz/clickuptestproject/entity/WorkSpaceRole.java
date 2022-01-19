package pdp.uz.clickuptestproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pdp.uz.clickuptestproject.entity.template.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkSpaceRole extends AbstractEntity {
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private WorkSpace workSpace;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String extends_role;
}
