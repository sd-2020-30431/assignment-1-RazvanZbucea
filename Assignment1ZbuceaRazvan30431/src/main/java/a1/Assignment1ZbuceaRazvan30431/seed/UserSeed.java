package a1.Assignment1ZbuceaRazvan30431.seed;

import a1.Assignment1ZbuceaRazvan30431.model.User;
import a1.Assignment1ZbuceaRazvan30431.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Order(Ordered.HIGHEST_PRECEDENCE)
public class UserSeed implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.findAll().isEmpty()) {
            userRepository.save(new User("Raz", passwordEncoder.encode("1234")));
            userRepository.save(new User("Alex", passwordEncoder.encode("chess")));
            userRepository.save(new User("Tudor", passwordEncoder.encode("poker")));
        }
    }
}
