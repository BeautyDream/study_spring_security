package cn.sm1234.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = new User("userAdmin","userAdmin", AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN,ROLE_USER"));
        return user;
    }
}
