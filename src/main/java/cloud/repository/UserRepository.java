package cloud.repository;

import cloud.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    @Query("SELECT u from User u order by u.nickname")
    List<User> findAllBySortedUser();
}
