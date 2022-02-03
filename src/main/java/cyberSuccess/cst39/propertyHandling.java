package cyberSuccess.cst39;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyHandling
{
FileInputStream file;
Properties prop;
public propertyHandling() throws Exception
{
	configHandling();
	
}

public void configHandling() throws IOException
{
	file= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\cst39\\configProperty");
    prop=new Properties();
    prop.load(file);
}

public String getProperty(String key)
{
	return prop.getProperty(key);
}


}
