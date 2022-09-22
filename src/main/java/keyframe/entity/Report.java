package keyframe.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "tb_report", schema = "keyframe")
public class Report extends AbstractEntity{
    @Getter
    @Setter
    @Column(name = "description", nullable = true, length = 255)
    private String description;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private User createdBy;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "video_id")
    private Video video;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "reportType", nullable = false)
    private ReportType reportType;
}
