package epam.dz.action;

import epam.dz.entity.Paragraph;
import epam.dz.util.Parser;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ParseAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        Parser parser = new Parser(request.getParameter("text"));
        List<String> Text =null;
        request.setAttribute("text", Text);
        return "/WEB-INF/result.jsp";
    }
}
