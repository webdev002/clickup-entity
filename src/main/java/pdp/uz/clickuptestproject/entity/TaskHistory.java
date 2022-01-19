package pdp.uz.clickuptestproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pdp.uz.clickuptestproject.entity.template.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaskHistory extends AbstractEntity {
    @ManyToOne
    private Task task;

    @Column(nullable = false)
    private String changeFieldName;

    @Column(nullable = false)
    private String before;

    @Column(nullable = false)
    private String after;

    @Column(nullable = false)
    private String data;
}
