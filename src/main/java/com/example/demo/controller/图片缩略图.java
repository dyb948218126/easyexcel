package com.example.demo.controller;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.image.AffineTransformOp;
import java.awt.geom.AffineTransform;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: 图片缩略图
 * @Author: Deng YuBin
 * @Description: 缩略图
 * @Date: 2020/11/13 16:46
 * @Version: 1.0
 */
public class 图片缩略图 {
    public static void main (String argv[]) {
        try {
            File fi = new File("D:/268223-106.jpg"); //大图文件
            File fo = new File("D:/268223-106z.jpg"); //将要转换出的小图文件
            int nw = 500;
            AffineTransform transform = new AffineTransform();
            BufferedImage bis = ImageIO.read(fi); //读取图片
            int w = bis.getWidth();
            int h = bis.getHeight();
            int nh = (nw*h)/w ;
            double sx = (double)nw/w;
            double sy = (double)nh/h;
            transform.setToScale(sx,sy); //setToScale(double sx, double sy) 将此变换设置为缩放变换。
            AffineTransformOp ato = new AffineTransformOp(transform,null);
            BufferedImage bid = new BufferedImage(nw,nh,BufferedImage.TYPE_3BYTE_BGR);
            ato.filter(bis,bid);
            ImageIO.write(bid,"jpeg",fo);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
