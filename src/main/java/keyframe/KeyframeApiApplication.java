package keyframe;

import keyframe.entity.Playlist;
import keyframe.entity.User;
import keyframe.entity.Video;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class KeyframeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeyframeApiApplication.class, args);

        User user = new User();
        user.setEmail("contato@edinaldo.pereira.com");
        user.setUsername("Edinaldo Pereira");
        user.setPassword("123123");

        Video video = new Video();
        video.setTitle("Primeiro Video");
        video.setDescription("Descricao");
        video.setThumbnail("thumb.jpg");
        video.setCreatedBy(user);


        Playlist playlist = new Playlist();
        playlist.setCreatedBy(user);
        playlist.setTitle("Minha Playlist");
        playlist.setDescription("Desc");

//        playlist.setVideos((List<Video>) video);
        System.out.println(user.toString());
        System.out.println(video.toString());
        System.out.println(playlist.toString());



    }

}