package svc.temperature.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long deviceId;

    private Long temp;

    private Boolean isLast;

    @Column(nullable = false)
    @UpdateTimestamp
    private Timestamp lastModificationDate;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdDate;
}
