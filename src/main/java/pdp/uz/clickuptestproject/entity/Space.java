package pdp.uz.clickuptestproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pdp.uz.clickuptestproject.entity.template.AbstractEntity;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Space extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    private WorkSpace workSpace;

    @Column(nullable = false)
    private String initialLetter;

//    @OneToMany
//    private List<Icon> icon;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Attachment> avatar;

    @OneToMany(fetch = FetchType.LAZY)
    private List<User> owner;

    @Column(nullable = false)
    private String accessType;




}
