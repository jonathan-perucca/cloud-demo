package cloud.web.rest;

import cloud.domain.User;
import cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = GET)
    public List<User> retrieveUsers() {
        return userRepository.findAllBySortedUser();
    }

    @RequestMapping(method = POST, value = "/{nickname}")
    public void createUser(@PathVariable final String nickname) {
        userRepository.save(new User(nickname));
    }
}
