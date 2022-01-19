package pdp.uz.clickuptestproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pdp.uz.clickuptestproject.entity.enums.DependencyType;
import pdp.uz.clickuptestproject.entity.template.AbstractEntity;

import javax.lang.model.type.DeclaredType;
import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaskDependency extends AbstractEntity {

    @ManyToOne
    private Task task;

    @OneToOne
    private TaskDependency taskDependency;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<DependencyType> dependencyTypes;

}
