package rentcloud.authorizationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rentcloud.authorizationserver.model.User;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<User,Integer>{

    Optional<User> findByUsername (String name);


}
