package com.example.Executive.config;


import com.example.Executive.service.CustomUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig   {

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        return http
                .csrf().disable()
                .authorizeRequests(auth ->

                                auth
                                        .antMatchers("/css/**", "/js/**", "/images/**").permitAll()
                                        .antMatchers("/" ).permitAll()
                                        .antMatchers(HttpMethod.POST, "/createUser").permitAll()
                                        .antMatchers(HttpMethod.POST, "/admin/create_Tenants").permitAll()
                                        .antMatchers("/user/**").hasRole("USER")
                                        .antMatchers("/admin/**").hasRole("ADMIN")
                                        .anyRequest()
                                        .authenticated()




                )
                .formLogin(withDefaults())
                .build();

    }




    @Autowired
    private CustomUserDetailsService customUserDetailsService;


    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService);
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
