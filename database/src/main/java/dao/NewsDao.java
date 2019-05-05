package dao;

import entity.News;

public class NewsDao {
    private static final NewsDao INSTANCE = new NewsDao();

    public News getDefoultNews(){
        return News.builder().
                id(1L).
                title("News1").
                build();
    }

    public static NewsDao getInstance(){return INSTANCE;}
}

