package co.com.neofile.jpa.iRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.QueryByExampleExecutor;

@NoRepositoryBean
public interface BaseSpringDataRepository <D, I> extends CrudRepository<D, I>, QueryByExampleExecutor<D> {
}
