package keyframe.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "tb_video", schema = "keyframe")
public class Video extends AbstractEntity{
    @Getter
    @Setter
    @Column(name = "title", nullable = false, length = 25)
    private String title;

    @Getter
    @Setter
    @Column(name = "description", nullable = true, length = 255)
    private String description;

    @Getter
    @Setter
    @Column(name = "thumbnail", nullable = false, length = 50)
    private String thumbnail;

    @Getter
    @Setter
    @Column(name = "viewsCount", nullable = false)
    private Long viewsCount = 0L;

    @Getter
    @Setter
    @Column(name = "commentCount", nullable = false)
    private Long commentCount = 0L;

    @Getter
    @Setter
    @Column(name = "likesCount", nullable = false)
    private Long likesCount = 0L;

    @Getter
    @Setter
    @Column(name = "deslikesCount", nullable = false)
    private Long deslikesCount = 0L;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private User createdBy;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "videos")
    private List<Playlist> playlists;


    public String toString(){
        return "VIDEO: \ntitulo: " + this.title + "criador: " + this.createdBy;
    }
}
