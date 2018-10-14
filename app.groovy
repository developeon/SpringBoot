@Grab("thymeleaf-spring5")

@Controller
class App {
  
  @RequestMapping(value="/", method = RequestMethod.GET)
  @ResponseBody
  def home(ModelAndView mav){
    mav.setViewName("home")
    mav
  }

  @RequestMapping(value="/send", method = RequestMethod.POST)
  @ResponseBody
  def send1(@RequestParam("name")String name, @RequestParam("msg")String msg, ModelAndView mav){
    mav.setViewName("home")
    mav.addObject("name", name + "POST")
    mav.addObject("msg", msg + "POST")
    mav
  }

  @RequestMapping(value="/send", method = RequestMethod.GET)
  @ResponseBody
  def send2(@RequestParam("name")String name, @RequestParam("msg")String msg, ModelAndView mav){
    mav.setViewName("home")
    mav.addObject("name", name + "GET")
    mav.addObject("msg", msg + "GET")
    mav
  }
}