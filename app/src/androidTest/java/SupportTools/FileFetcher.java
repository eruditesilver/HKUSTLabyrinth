package SupportTools;

import android.content.Context;
import android.content.pm.PackageManager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Silver on 12/3/2016.
 */
public class FileFetcher {
    public static String DEFAULT_APP_PATH = "";

    public void init(Context context){
        try {
            DEFAULT_APP_PATH = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.dataDir;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static <T> T fetchFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(DEFAULT_APP_PATH + fileName);
        ObjectInputStream in = new ObjectInputStream(fis);
        T object = (T) in.readObject();
        in.close();
        return (T)object;
    }

    public static <T> void storeToFile(String fileName, T object) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(DEFAULT_APP_PATH + fileName);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(object);
        out.close();
    }
}

