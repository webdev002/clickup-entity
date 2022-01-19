package pdp.uz.clickuptestproject.entity;

import org.hibernate.annotations.CreationTimestamp;
import pdp.uz.clickuptestproject.entity.template.AbstractEntity;

import javax.persistence.*;
import java.sql.Timestamp;

public class WorkSpaceUser extends AbstractEntity {
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private WorkSpace workSpace;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private User user;

    @ManyToMany(cascade = CascadeType.ALL)
    private WorkSpaceRole workSpaceRole;

    @CreationTimestamp
    private Timestamp date_invited;

    @Column(nullable = false)
    private String date_joined;

}
