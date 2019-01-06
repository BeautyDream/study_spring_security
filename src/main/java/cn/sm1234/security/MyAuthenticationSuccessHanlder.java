package cn.sm1234.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class MyAuthenticationSuccessHanlder implements AuthenticationSuccessHandler {

    private ObjectMapper objectMapper = new ObjectMapper();

    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        HashMap map = new HashMap<String,String>();
        map.put("successful","true");

        String s = objectMapper.writeValueAsString(map);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(s);

    }
}
