package com.wangyuxuan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/23 10:14
 * @Description:
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                    .authorizeRequests()
                        .antMatchers("/", "home").permitAll()
                        .anyRequest().authenticated()
                        .and()
                    .formLogin()
                        .loginPage("/login")
                        .permitAll()
                        .and()
                    .logout()
                        .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception{
//        authenticationManagerBuilder
//                                    .inMemoryAuthentication()
//                                        .withUser("wangyuxuan").password("123456").roles("USER");
        //Spring security 5.0中新增了多种加密方式，也改变了密码的格式。
        authenticationManagerBuilder
                                    .inMemoryAuthentication()
                                        .passwordEncoder(new BCryptPasswordEncoder())
                                            .withUser("wangyuxuan").password(new BCryptPasswordEncoder().encode("123456")).roles("USER");
    }
}
