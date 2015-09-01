package cloud.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
class GreetingController {

    @Value("${application.verbose.name:default-name}")
    private String applicationVerboseName;

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        return "Hello-test, " + name + "! from " + applicationVerboseName;
    }

    @RequestMapping("/sorter/{iterations}")
    String sort(@PathVariable Integer iterations) {
        if(iterations > 60 || iterations < 0)
            return "haha you like a funny boy dude ^^, start following the rules :p";

        List<Integer> list = new Random()
                .ints(0, 60)
                .limit(iterations)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        return String.format("Generated %d numbers, which i sorted for you %s", iterations, list);
    }

}
