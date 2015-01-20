package pl.dmichalski.c05_01_spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c05_01_spring_security.entity.MemberRole;

/**
 * Author: Daniel
 */
public interface MemberRoleRepository extends JpaRepository<MemberRole, Long> {
}
