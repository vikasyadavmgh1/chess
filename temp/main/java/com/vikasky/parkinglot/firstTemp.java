package p1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstTemp {
    @GetMapping("/vikas")
    public int getTheName() {
        return 10;
    }
}
