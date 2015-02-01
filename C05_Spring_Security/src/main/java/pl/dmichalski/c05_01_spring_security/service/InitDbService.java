package pl.dmichalski.c05_01_spring_security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dmichalski.c05_01_spring_security.entity.Member;
import pl.dmichalski.c05_01_spring_security.entity.MemberRole;
import pl.dmichalski.c05_01_spring_security.repository.MemberRepository;
import pl.dmichalski.c05_01_spring_security.repository.MemberRoleRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
@Service
public class InitDbService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberRoleRepository memberRoleRepository;

    @PostConstruct
    public void initDb() {

        MemberRole adminRole = new MemberRole();
        adminRole.setName("ROLE_ADMIN");
        memberRoleRepository.save(adminRole);

        MemberRole userRole = new MemberRole();
        userRole.setName("ROLE_USER");
        memberRoleRepository.save(userRole);

        Member admin = new Member();
        admin.setName("admin");
        admin.setPassword("secret");
        admin.setEnabled(true);
        List<MemberRole> adminRoles = new ArrayList<>();
        adminRoles.add(adminRole);
        admin.setMemberRoles(adminRoles);

        Member user1 = new Member();
        user1.setName("user1");
        user1.setPassword("1111");
        user1.setEnabled(true);
        List<MemberRole> user1Roles = new ArrayList<>();
        user1Roles.add(userRole);
        user1.setMemberRoles(user1Roles);

        Member user2 = new Member();
        user2.setName("user2");
        user2.setPassword("2222");
        user2.setEnabled(false);
        List<MemberRole> user2Roles = new ArrayList<>();
        user1Roles.add(userRole);
        user2.setMemberRoles(user2Roles);

        memberRepository.save(admin);
        memberRepository.save(user1);
        memberRepository.save(user2);
    }

}
