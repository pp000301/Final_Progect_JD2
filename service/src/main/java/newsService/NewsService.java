package newsService;
import dao.NewsDao;
import entity.News;

public class NewsService {
    private static final NewsService INSTANCE = new NewsService();
    private final NewsDao newsDao =NewsDao.getInstance();

    public News getNews(){
        return newsDao.getDefoultNews();
    }


   public static NewsService getInstance(){
       return INSTANCE;
   }


}
