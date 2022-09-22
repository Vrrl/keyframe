package keyframe.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "tb_evaluation", schema = "keyframe")
public class Evaluation extends AbstractEntity{
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private User createdBy;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "video_id")
    private Video video;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @Getter
    @Setter
    @Column(name = "isPositive", nullable = false)
    private boolean isPositive;
}
