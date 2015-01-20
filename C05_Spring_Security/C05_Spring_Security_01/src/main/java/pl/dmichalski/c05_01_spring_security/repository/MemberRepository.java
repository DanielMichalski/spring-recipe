package pl.dmichalski.c05_01_spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.c05_01_spring_security.entity.Member;

/**
 * Author: Daniel
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}
