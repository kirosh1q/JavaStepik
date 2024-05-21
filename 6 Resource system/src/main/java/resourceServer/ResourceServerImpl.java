package resourceServer;

import resources.ResourceService;
import resources.TestResource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResourceServerImpl implements ResourceServer {
    static final Logger logger = LogManager.getLogger(ResourceServerImpl.class.getName());
    TestResource resource;


    public ResourceServerImpl(){}

    @Override
    public String getName() {
        return resource.getName();
    }

    @Override
    public int getAge() {
        return resource.getAge();
    }

    @Override
    public String getNameClass() {
        return resource.getClass().toString();
    }

    @Override
    public void readResource(String path) {
        resource = ResourceService.instance().getResource(path, TestResource.class);
        logger.info("Resource loaded");
    }
}
