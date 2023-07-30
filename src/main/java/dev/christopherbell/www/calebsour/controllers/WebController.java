package dev.christopherbell.www.calebsour;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    /**
     * Returns the home page.
     *
     * @return index/home
     */
    @GetMapping(value = "/")
    public String getHomePage(HttpServletRequest request) {
        return "index.html";
    }
    
}
