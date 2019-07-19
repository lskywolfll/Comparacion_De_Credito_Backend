package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
	//metodos
}
