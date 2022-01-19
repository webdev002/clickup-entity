package pdp.uz.clickuptestproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pdp.uz.clickuptestproject.entity.template.AbstractEntity;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkSpace extends AbstractEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @ManyToOne
    private User owner;

    @Column(nullable = false)
    private String initialLetter;

    @OneToMany(mappedBy = "workSpace",cascade = CascadeType.ALL)
    private List<Attachment> avatar;
}
