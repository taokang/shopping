package com.imooc.o2o.util;

public class PathUtil {
    private static String seperator = System.getProperty("file.separator");

    //获取图片的根路径
    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/IntelliJ IDEA2019 Projects/shopImage";
        } else {
            basePath = "/Users/baidu/work/image";
        }
        basePath = basePath.replace("/", seperator);
        return basePath;
    }

    //获取图片修改后的地址
    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/images/item/shop/" + shopId + "/";
        return imagePath.replace("/", seperator);
    }
}
