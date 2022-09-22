package keyframe.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "tb_playlist", schema = "keyframe")
public class Playlist extends AbstractEntity{
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
    @Column(name = "videosCount", nullable = false)
    private Long videosCount = 0L;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private User createdBy;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(name="tb_playlist_user", schema = "keyframe",
            joinColumns={@JoinColumn(name="playlist_id")},
            inverseJoinColumns={@JoinColumn(name="user_id")})
    private List<User> users;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(name="tb_playlist_video", schema = "keyframe",
            joinColumns={@JoinColumn(name="playlist_id")},
            inverseJoinColumns={@JoinColumn(name="video_id")})
    private List<Video> videos;



    public String toString(){
        return "titulo: "+ this.title;
    }
}
