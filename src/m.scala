import javax.servlet.{ServletContextEvent, ServletContextListener}
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

class Bootstrap extends ServletContextListener {

  override def contextInitialized(e: ServletContextEvent){
    println("started")
  }

  override def contextDestroyed(e: ServletContextEvent){
    println("stopped")
  }

}

class HelloWorld extends HttpServlet {

  override def doGet(req: HttpServletRequest, resp: HttpServletResponse){
    resp.getWriter.write("hello world")
  }
}


