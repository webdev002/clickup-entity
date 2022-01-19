package pdp.uz.clickuptestproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pdp.uz.clickuptestproject.entity.template.AbstractEntity;

import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceUser extends AbstractEntity {

    @OneToOne
    private Space space;

    @OneToOne
    private User member;


}
