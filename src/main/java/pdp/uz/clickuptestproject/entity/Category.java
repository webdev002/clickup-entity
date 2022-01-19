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
public class Category extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Project project;

    @Column(nullable = false)
    private String accessType;

    @Column(nullable = false)
    private String archived;

    @Column(nullable = false)
    private String color;
}
