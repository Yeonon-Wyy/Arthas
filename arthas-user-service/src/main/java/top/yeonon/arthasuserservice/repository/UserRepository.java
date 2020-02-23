package top.yeonon.arthasuserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import top.yeonon.arthasuserservice.entity.User;

/**
 * @Author yeonon
 * @date 2020/2/23 0023 16:15
 **/
@Repository
@Component
public interface UserRepository extends JpaRepository<User, Long> {
}
