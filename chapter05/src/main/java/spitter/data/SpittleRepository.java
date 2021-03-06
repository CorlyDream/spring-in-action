package spitter.data;



import spitter.entity.Spittle;

import java.util.List;

/**
 * Created by mengshuang on 2017/7/10.
 */
public interface SpittleRepository {
    List<Spittle> findRecentSpittles();
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
    void save(Spittle spittle);

}
