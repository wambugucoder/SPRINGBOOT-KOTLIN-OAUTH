package com.oauth2.oauth.security

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter


@EnableOAuth2Sso
@Configuration
class ApiSecurity :WebSecurityConfigurerAdapter(){

    
    override fun configure(http: HttpSecurity?) {
        http?.csrf()?.disable()?.authorizeRequests()?.antMatchers("/","/error")?.permitAll()?.anyRequest()?.authenticated()

    }





}
