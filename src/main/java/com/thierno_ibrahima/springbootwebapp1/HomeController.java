package com.thierno_ibrahima.springbootwebapp1;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;




@Controller
@CrossOrigin
public class HomeController {
  
  @RequestMapping("/index")
  public String home(){
    System.out.println("in index");

    //The view resolver will look for a view named "index.jsp" in the classpath. We set this in the Spring Boot application.properties file as spring.
    //spring.mvc.view.prefix=/WEB-INF/views/
    //spring.mvc.view.suffix=.jsp
    return "index";  
  }

  // accepting a parameter the servlet way
  @RequestMapping("/add")
  public String add(HttpServletRequest request, HttpSession session){ 
    System.out.println("in add");
    //request.getParameter() is used to get the parameters from the request
      int num1 = Integer.parseInt(request.getParameter("num1"));
      int num2 = Integer.parseInt(request.getParameter("num2"));
      int result = num1 + num2;
      
      //saving the result in the session object which is accessible across all requests of the same session
      session.setAttribute("result", result);
      
      //returning the view
      System.out.println(result);
      
      return "result";
  }

  // accepting a parameter and automatically extracting the parameters from the request body by matching the parameter names (no need to use request.getParameter() anymore)
  @RequestMapping("/add_auto_extract")
  public String add(int num1, @RequestParam("num2")int numero2, HttpSession session){ 
    System.out.println("in add_auto_extract");
      // num1 and num2 are automatically extracted from the request body
      int result = num1 + numero2;
      
      //saving the result in the session object which is accessible across all requests of the same session
      session.setAttribute("result", result);
      
      //returning the view
      System.out.println(result);
      return "result";
  }

  // using model for handling data only
  @RequestMapping("/add_using_model")
  public String add(int num1, int num2, Model model){
    System.out.println("in add_using_model");


    int result = num1 + num2;

    //adding the result to the ModelAndView, which will be available in the view
    model.addAttribute("result", result);
    
    //returning the view
    System.out.println(result);
    return "result";  
  }

  // using model and view for rendering the result in a page (Best Practice if you want springboot to handle FE and BE)
  @RequestMapping("/add_using_model&view")
  public ModelAndView add(int num1, int num2, ModelAndView mv){
    System.out.println("in add_using_model&view");
    int result = num1 + num2;

    //adding the result to the ModelAndView, which will be available in the view
    mv.addObject("result", result);

    //adding the view to the ModelAndView
    mv.setViewName("result");
    
    //returning the view
    System.out.println(result);
    return mv; 
  }

  @RequestMapping("alienIndex")
  public ModelAndView alienIndex(ModelAndView mv){
    mv.setViewName("alienIndex");
    return mv;
  }

  @RequestMapping("/addAlien")
  public ModelAndView addAlien(int alienId, String alienName, ModelAndView mv){
    System.out.println("in addAlien");
    mv.addObject("alien", new Alien(alienId, alienName));
    mv.setViewName("displayAlien");
    return mv;
  }

  //Springboot automatically binds the request parameters to an Alien object
  //By using ModelAttribute we directly bind the targeted element to an attribute of the model which can be accessed in the view
  //No longer need for the Model and ModelAndView objects
  @RequestMapping("/addAlien_ModelAttribute")
  public String addAlienModelAttribute(@ModelAttribute Alien alien){
    return "displayAlien";
}

//You can even omit the ModelAttribute annotation since it is optional
  @RequestMapping("/addAlien_no_model_attribute")
  public String addAlienNoModelAttribute(Alien alien){
    return "displayAlien";
  }

  //The ModelAttribute annotation can also be used to bind the return value of a method to an attribute of the model which can be accessed in the view
  @ModelAttribute("planet")
  public String planet(){
    return "Mars";
  }

  //--------------------------------------
  @RequestMapping("/dogIndex")
  public String dogForm(){
    return "dogIndex";
  }

  @RequestMapping("/displayDog")
  public String displayDog(Dog dog) {
      return "displayDog";
  }

  @ModelAttribute("dogColors")
  public List<String> dogColors() { 
    return Arrays.asList("Black", "Brown", "White", "Gray");
  }
  //--------------------------------------


}
