package za.co.signinsthembiso.signinSthe;

import lombok.AllArgsConstructor;

//import javax.management.relation.RelationService;

import org.springframework.web.bind.annotation.*;
//
//import za.co.signinsthembiso.signinSthe.registrationService;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final registrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

}
