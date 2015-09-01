package cloud.domain;

import javax.persistence.*;

@Entity(name = "User")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String nickname;

    public User() {
    }

    public User(String nickname) {
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
