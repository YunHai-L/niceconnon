package cn.rockets.utils;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: YunHai
 * @Date: 2020/4/5 15:37
 * @Description:
 */
public class ImageUtil {
    public static Map<String , ImageIcon> ImageMap=new HashMap<>();
    public static ImageIcon GetImage(String imagePath){
        //集合中有图片，根据关键字返回图片
        if(ImageMap.containsKey(imagePath))
            return ImageMap.get(imagePath);

        //集合中没有图片，则先把图片放入集合中，再重新加载
        ImageIcon image=new ImageIcon(imagePath);
        ImageMap.put(imagePath,image);
        return image;
    }//    将图片添加至服务器 并返回访问路径
    public static String addImage(File file){
        return null;
    }
//    通过图片路径获取图片
    public static File getImage(String path){
        return null;
    }

//    通过素材名 获取素材
    public static Image getSource(String picName){
        return null;
    }

}
