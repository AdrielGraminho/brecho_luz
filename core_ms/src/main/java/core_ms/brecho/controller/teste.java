package core_ms.brecho.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class teste {
    @GetMapping
    public HttpStatus getTest(){
        return HttpStatus.ACCEPTED;
    }
}
