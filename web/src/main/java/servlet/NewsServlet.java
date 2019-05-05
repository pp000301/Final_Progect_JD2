package servlet;



import entity.News;
import newsService.NewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/news")
public class NewsServlet extends HttpServlet {

    private final NewsService newsService=NewsService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        News defoultNews= newsService.getNews();
        req.setAttribute("news",defoultNews);
        getServletContext().
                getRequestDispatcher("/WEB-INF/jsp/news.jsp").forward(req,resp);
    }
}
