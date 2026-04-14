package riccardogulin.u5d7.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import riccardogulin.u5d7.payloads.NewUserPayload;

/* ******************************************** USERS CRUD *****************************************

1. GET http://localhost:PORT/users --> 200 OK con array di utenti
2. POST http://localhost:PORT/users (+payload) --> 201 CREATED con utente appena creato
3. GET http://localhost:PORT/users/{userId} --> 200 OK con utente trovato (404 se non trovato, lo faremo domani)
4. PUT http://localhost:PORT/users/{userId} (+payload) --> 200 OK con utente aggiornato (404 se non trovato, lo faremo domani)
5. DELETE http://localhost:PORT/users/{userId} --> 204 NO CONTENT (404 se non trovato, lo faremo domani)


 */
@RestController
@RequestMapping("/users")
public class UsersController {

	// 1. GET http://localhost:PORT/users
	@GetMapping
	public void findAll() {
	}

	// 2. POST http://localhost:PORT/users (+payload)
	@ResponseStatus(HttpStatus.CREATED) // 201
	@PostMapping
	public void createUser(@RequestBody NewUserPayload body) {
	}

	// 3. GET http://localhost:PORT/users/{userId}
	@GetMapping("/{userId}")
	public void getUserById(@PathVariable long userId) {
	}

	// 4. PUT http://localhost:PORT/users/{userId}
	@PutMapping("/{userId}")
	public void getUserByIdAndUpdate(@PathVariable long userId, @RequestBody NewUserPayload body) {
	}

	// 5. DELETE http://localhost:PORT/users/{userId}
	@DeleteMapping("/{userId}")
	@ResponseStatus(HttpStatus.NO_CONTENT) // 204
	public void getUserByIdAndDelete(@PathVariable long userId) {
	}


}
