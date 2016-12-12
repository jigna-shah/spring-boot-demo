package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
