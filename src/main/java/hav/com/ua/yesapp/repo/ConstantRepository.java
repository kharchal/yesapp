package hav.com.ua.yesapp.repo;

import hav.com.ua.yesapp.model.Constant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstantRepository extends JpaRepository<Constant, Long> {

    Constant findByName(String name);
}
