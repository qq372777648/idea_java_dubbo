package cunsumerTest;

import net.lzw.interfaces.People;
import org.springframework.remoting.support.RemoteInvocation;
import org.springframework.remoting.support.RemoteInvocationResult;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Author：lzw
 * Email: 372777648@qq.com
 * Create Date：2016/10/6
 * Depiction：
 * Version: V1.0.0
 */
public class PostObj {
    public static void main(String[] args) throws Exception
    {
        HttpURLConnection httpUrlConnection = ((HttpURLConnection)new URL("http://127.0.0.1:8888/EatInterface?methods=eat&version=0.0.1&client=jetty").openConnection());
        httpUrlConnection.setDoOutput(true);
        httpUrlConnection.setDoInput(true);
        httpUrlConnection.setUseCaches(false);
        httpUrlConnection.setRequestProperty("Content-type", "application/x-java-serialized-object");
        httpUrlConnection.setRequestMethod("POST");
        httpUrlConnection.connect();
        OutputStream outStrm = httpUrlConnection.getOutputStream();
        ObjectOutputStream objOutputStrm = new ObjectOutputStream(outStrm);

        People people = new People();
        people.setAge(1);
        people.setSex(1);

        RemoteInvocation invocation = new RemoteInvocation("speak",new Class[]{People.class},new Object[]{people});

        objOutputStrm.writeObject(invocation);
        objOutputStrm.flush();

        InputStream inStrm = httpUrlConnection.getInputStream();
        ObjectInputStream input = new ObjectInputStream(inStrm);
        RemoteInvocationResult result = (RemoteInvocationResult)input.readObject();
        System.out.println(result.getValue());
    }
}
