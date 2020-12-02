package com.oauth2.oauth.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@RestController
class Api {
    @GetMapping("/")
    fun redirect(response:HttpServletResponse,request:HttpServletRequest){

       return response.sendRedirect("http://localhost:3000/dashboard")
    }
    @GetMapping("/user")
    fun getUser(principal:Principal):Principal{
        return principal

    }
}