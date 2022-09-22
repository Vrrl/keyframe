package keyframe.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.Column;


import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractEntity {

    @Getter
    @Setter
    @Id
    private Long id;

    @Getter @Setter
    @CreationTimestamp
    @Column(name = "create_date")
    private LocalDateTime createdAt;

    @Getter @Setter
    @UpdateTimestamp
    @Column(name = "modify_date")
    private LocalDateTime updatedAt;

    @Getter @Setter
    private boolean active;


}
