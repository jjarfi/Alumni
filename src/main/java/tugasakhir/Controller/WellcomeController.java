package tugasakhir.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WellcomeController {

    @GetMapping(value = "/index")
    public String wellcontroller(){
        return "/wellcomealumni";
    }
}
