package riccardogulin.u5d7.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class NewUserPayload {
	// Attenzione a non confondere questa classe con la rispettiva ENTITY
	// L'unico scopo di questa classe è quello di descrivere come sarà fatto il payload di creazione di un nuovo utente
	// In pratica conterrà gli attributi del JSON che mi verrà inviato dal client
	private String name;
	private String surname;
	private String email;
	private String password;
	private int age;
}
