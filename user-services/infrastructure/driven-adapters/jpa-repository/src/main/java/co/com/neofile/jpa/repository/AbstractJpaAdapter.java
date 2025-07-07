package co.com.neofile.jpa.repository;


import co.com.neofile.jpa.helper.AdapterOperations;
import co.com.neofile.jpa.iRepository.BaseSpringDataRepository;
import org.reactivecommons.utils.ObjectMapper;

public abstract class AbstractJpaAdapter<E, D, I, R extends BaseSpringDataRepository<D,I>> extends AdapterOperations<E, D, I, R> {

    protected AbstractJpaAdapter(R repository, ObjectMapper mapper, Class<E> domainClass, Class<D> entityClass){
        super(repository, mapper, entity -> mapper.map(entity, domainClass));
    }
}
