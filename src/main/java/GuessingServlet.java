import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessingServlet", value = "/guess")
public class GuessingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO: 9/3/21 walkthrough
        request.getRequestDispatcher("/guess.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO: 9/3/21 walkthrough
        //form data by default is a string not a number
        int usersGuessedNumber = Integer.parseInt(request.getParameter("guessed_number"));//intellij helped out

        //google java random int between 1 and 10 > checked stackoverlfow
        Random random = new Random();

        int min = 1;
        int max = 3;
        int randomInt = random.nextInt(max - min+1)+min;

//        if(randomInt == usersGuessedNumber){
//            //you got it right
//            response.sendRedirect("right");
//        }else{
//            //you got it wrong
//            response.sendRedirect("wrong");
//        }
//    }

    //single servlet option
            if(randomInt == usersGuessedNumber){
        //you got it right
        response.sendRedirect("guess-result?result=right");
    }else{
        //you got it wrong
        response.sendRedirect("guess-result?result=wrong");
    }
}

}
