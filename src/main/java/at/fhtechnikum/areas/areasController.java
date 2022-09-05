package at.fhtechnikum.areas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class areasController {

    areas test = new areas();

    @GetMapping("/api/area")
        public String getInfo(){
            return test.getInfo();
    }

    @GetMapping("/api/calc")
        public double getArea(){
            return test.getArea();
    }

    @PostMapping("/api/calc/{form}/{value}")
        public double getArea(@PathVariable String form, @PathVariable int value){
            test.setArea(form, value);
            return test.getArea();
    }
    @PostMapping("/api/calc/{form}/{val1}/{val2}")
        public double getArea(@PathVariable String form, @PathVariable int val1, @PathVariable int val2){
            test.setArea(form, val1, val2);
            return test.getArea();
    }

}
