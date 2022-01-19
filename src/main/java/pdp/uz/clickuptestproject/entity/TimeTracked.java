package pdp.uz.clickuptestproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import pdp.uz.clickuptestproject.entity.template.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TimeTracked extends AbstractEntity {
    @OneToOne
    private Task task;

    @CreationTimestamp
    private Timestamp startedAt;

    @Column(nullable = false)
    private Timestamp stoppedAt;
}
