package core_ms.brecho.controller;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class teste {
    @GetMapping
    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public HttpStatus getTest(){
        return HttpStatus.ACCEPTED;
    }
}
