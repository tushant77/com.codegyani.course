package com.codegyani.course.security;
//package com.codegyani.course.security;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//
//import com.codegyani.student.entity.Authority;
//import com.codegyani.student.entity.User;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public final class JwtUserFactory {
//
//    private JwtUserFactory() {
//    }
//
//    public static JwtUser create(User user) {
//        return new JwtUser(
//                user.getId(),
//                user.getUsername(),
//                user.getFirstname(),
//                user.getLastname(),
//                user.getEmail(),
//                user.getPassword(),
//                mapToGrantedAuthorities(user.getAuthorities()),
//                user.getEnabled(),
//                user.getLastPasswordResetDate()
//        );
//    }
//
//    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Authority> authorities) {
//        return authorities.stream()
//                .map(authority -> new SimpleGrantedAuthority(authority.getName().name()))
//                .collect(Collectors.toList());
//    }
//}
