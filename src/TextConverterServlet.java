import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/text-converter")
public class TextConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        String text = request.getParameter("text");
        int charactersNumber = TextUtils.getCharactersNumber(text);
        int charactersNumberWithoutWhitespaces = TextUtils.getCharactersNumberWithoutWhitespaces(text);
        int wordsNumber = TextUtils.getWordsNumber(text);
        boolean isPalindrome = TextUtils.isPalindrome(text);

        PrintWriter writer = response.getWriter();
        writer.println("<div style=\"width: 50%\">");
        writer.println("<i>" + text + "</i><br/>");
        writer.println("</div>");
        writer.println("<p>");
        writer.println("Ilośc słów: " + wordsNumber + "<br/>");
        writer.println("Ilość znaków: " + charactersNumber + "<br/>");
        writer.println("Ilość znaków (bez spacji): " + charactersNumberWithoutWhitespaces + "<br/>");
        writer.println("Palindrom: " + isPalindrome + "<br/>");
        writer.println("</p>");
    }
}
