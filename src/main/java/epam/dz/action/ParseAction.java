package epam.dz.action;

import epam.dz.entity.CompoundTextPart;
import epam.dz.util.Parser;

import javax.servlet.http.HttpServletRequest;

public class ParseAction implements Action {
    @Override
    public String execute(HttpServletRequest request) {
        Parser parser = new Parser(request.getParameter("text"));
        CompoundTextPart Text = parser.parse("Text", "Paragraph", "text");
        request.setAttribute("text", Text);
        return "/WEB-INF/result.jsp";
    }
}
