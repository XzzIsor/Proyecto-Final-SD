package co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.controller;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.AdminDTO;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.DTO.ClientDTO;
import co.edu.unicauca.distribuidos.proyecto_api_rest_inicio_sesion.services.services.ISessionService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;



@RestController
@RequestMapping("/api")
@Validated
public class SessionController {
    
    @Autowired
    private ISessionService sessionService;


	@GetMapping("/client")
    public List<ClientDTO> listClient(){
        return sessionService.listClient();
    }

    @GetMapping("/client/{login}/{password}")
	public ClientDTO sessionClient(@PathVariable String login,@PathVariable String password) {
		ClientDTO client = null;		
		client = sessionService.sessionClient(login,password);		
		return client;
	}

    @PostMapping("/client")
	public ClientDTO registerClient(@RequestBody @Valid ClientDTO newClient) {	
		ClientDTO client = null;
		client =  sessionService.registerClient(client);
		return client;
	}

    @GetMapping("/admin")
    public List<AdminDTO> listAdmin(){
        return sessionService.listAdmins();
    }

    @GetMapping("/admin/{login}/{password}")
	public AdminDTO sessionAdmin(@PathVariable String login,@PathVariable String password) {
		AdminDTO admin = null;		
		admin = sessionService.sessionAdmin(login,password);		
		return admin;
	}

    @PostMapping("/admin")
	public AdminDTO registerAdmin(@RequestBody @Valid AdminDTO newAdmin) {	
		AdminDTO admin = null;
		admin =  sessionService.registerAdmin(newAdmin);
		return admin;
	}


    @ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ConstraintViolationException.class)
	ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException e) {
		return new ResponseEntity<>("Error al llamar el método, revise los parámetros: " + e.getMessage(),
				HttpStatus.BAD_REQUEST);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});

		return errors;
	}


}
