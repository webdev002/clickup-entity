package pdp.uz.clickuptestproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import pdp.uz.clickuptestproject.entity.template.AbstractEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task extends AbstractEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @OneToOne
    private Status status;

    @ManyToOne
    private Category category;

    @OneToOne
    private Priority priority;

    @Column(nullable = false)
    private String startDate;

    @Column(nullable = false)
    private String startDateHas;

    @Column(nullable = false)
    private String dueDate;

    @Column(nullable = false)
    private String dueTimeHas;

    @Column(nullable = false)
    private Long estimeteTime;

    @Column(nullable = false)
    private String activeDate;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<User> user;



}
