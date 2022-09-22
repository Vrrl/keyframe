package keyframe.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "tb_user", schema = "keyframe")
public class User extends AbstractEntity {

    @Getter
    @Setter
    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Getter
    @Setter
    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Getter
    @Setter
    @Column(name = "password", nullable = false, length = 50)
    private String password;

    @Getter
    @Setter
    @Column(name = "avatar", nullable = false, length = 50)
    private String avatar = "avatar.jpg";

    @Getter
    @Setter
    @Column(name = "subsCount", nullable = false)
    private Long subsCount = 0L;

    @Getter
    @Setter
    @Column(name = "lastLogin", nullable = false)
    private LocalDateTime lastLogin;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "userLevel", nullable = false)
    private UserLevel userLevel = UserLevel.common;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "users")
    private List<Playlist> playlists;


    public String toString(){
        return "nome: "+ this.username;
    }
}
