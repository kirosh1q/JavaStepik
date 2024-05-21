package resources;

import sax.ReadXMLFileSAX;

public class ResourceService {
    static ResourceService instance;
    private ResourceService(){
    }

    public static ResourceService instance()
    {
        if (instance==null)
        {
            instance = new ResourceService();
        }
        return instance;
    }

    public <T> T getResource(String path, Class<T> clazz)
    {
        return clazz.cast(ReadXMLFileSAX.readXML(path));
    }
}
