package riccardogulin.u5d7.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Random;

@Getter
@Setter
@ToString
public class User {
	private long id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private int age;
	private LocalDateTime createdAt;
	private String avatarURL;

	public User(String name, String surname, String email, String password, int age) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.age = age;
		this.createdAt = LocalDateTime.now();
		this.avatarURL = "https://picsum.photos/200/300";
		Random random = new Random();
		this.id = random.nextInt(1, 10000);
	}
}
