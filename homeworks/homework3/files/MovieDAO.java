
/**
 *
 * @author adrianplattner
 */
public interface MovieDAO {
    
    void save(Movie movie);
    
    void update(Movie movie);
    
    void delete(Movie movie);
    
    Movie findById(long id);
    
    Movie[] findAll();
    
    Movie[] findAllByNameStartWith(String name);
    
    Movie[] findAllByYearBetween(int start,int end);
    
    Movie [] findAllByActor(Actor actor);
   
}
