package riccardogulin.u5d7.controllers;

import org.springframework.web.bind.annotation.*;

@RestController // N.B. @RestController != @Controller
// @Controller è l'annotazione da NON USARE
// Entrambe sono specializzazione di @Component
@RequestMapping("/examples")
public class ExampleController {

	@GetMapping // GET http://localhost:3001/examples
	public String getExample1() {
		return "Ciao sono l'endpoint che risponde alle richieste GET";
	}

	@PostMapping // POST http://localhost:3001/examples
	public String postExample1() {
		return "Ciao sono l'endpoint che risponde alle richieste POST";
	}

	@GetMapping("/getExample") // Tra le parentesi tonde posso anche definire la parte finale dell'indirizzo (quella che viene dopo /examples)
	// GET http://localhost:3001/examples/getExample
	public String getExample2() {
		return "Ciao sono l'endpoint che risponde alle richieste GET su http://localhost:3001/examples/getExample";
	}

	@PostMapping("/postExample") // POST http://localhost:3001/examples/postExample
	public String postExample2() {
		return "Ciao sono l'endpoint che risponde alle richieste POST su http://localhost:3001/examples/postExample";
	}

	@PutMapping("/putExample") // PUT http://localhost:3001/examples/postExample
	public String putExample() {
		return "Ciao sono l'endpoint che risponde alle richieste PUT su http://localhost:3001/examples/putExample";
	}

	@PatchMapping("/patchExample") // PATCH http://localhost:3001/examples/patchExample
	public String patchExample() {
		return "Ciao sono l'endpoint che risponde alle richieste PATCH su http://localhost:3001/examples/patchExample";
	}

	@DeleteMapping("/deleteExample") // DELETE http://localhost:3001/examples/deleteExample
	public String deleteExample() {
		return "Ciao sono l'endpoint che risponde alle richieste DELETE su http://localhost:3001/examples/deleteExample";
	}

	// ************************************************** QUERY PARAMETERS *********************************************
	@GetMapping("/queryParamsExample")
	// GET http://localhost:3001/examples/queryParamsExample?name=Giorgia&age=20
	// /examples/queryParamsExample?name=Nicola
	// /examples/queryParamsExample?name=Elena
	public String queryParamsExample(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age) {
		// Di default i parametri sono tutti OBBLIGATORI, cioè se non li passo ottengo una BAD REQUEST come risposta
		// Volendo posso metterli come OPZIONALI utilizzando (required = false)
		// Attenzione però che se un parametro opzionale non viene passato il suo valore sarà NULL con tutte le conseguenze
		// del caso (rischiamo tante NullPointerException!)
		return "I parametri inseriti sono : " + name.toUpperCase() + ", " + age;
	}
}
