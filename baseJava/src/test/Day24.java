package test;

import org.junit.Test;

import java.io.*;

public class Day24 {
    /**
     * 1. 说明流的三种分类方式
     * 流向：输入流(InputStream, Reader)、输出流(OutputStream, Writer)
     * 数据单位：字节流(FileXXXStream)、字符流(FileWriter, FileWriter);
     * 流的角色：节点流(FileXXX)、处理流(BufferedXXX)
     * 2. 写出4个IO流中的抽象基类，4个文件流，4个缓冲流
     *     InputStream				FileXxx			BufferedXxx
     *     OutputStream
     *     Reader
     *     Writer
     *
     *     InputStreamReader: 读取字符流到字节楼
     *     OutputStreamWriter: 写出字符流到字节流
     *     RandomAccessFile:  可读，可写。
     *
     *     3. 字节流与字符流的区别与使用情境
     *          字节流可以处理任何类型的数据， 因为计算机所有的数据都是字节组成, 包括图片， 视频， 二进制文件等。
     *          字符流内部帮忙将字节转换为字符， 可以更方便的处理文本, 不能处理图片等二进制文件。
     *
     *     4. 使用缓冲流实现a.jpg文件复制为b.jpg文件的操作
     *          try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(“a.jpg”)));
     *              BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(“b.jpg”)))){
     *              byte[] buffer = new byte[1024];
     *              int len;
     *              while((len = bis.read(buffer))!= -1){
     *              	bos.write(buffer,0,len);
     *              }
     *          } catch (Exception e){
     *              e.printStackTrace();
     *          } finally { // 在 try () 中声明的流会自动关闭
     *              if (bos != null)
     *                  bos.close();
     *              if (bis != null)
     *                  bis.close();
     *          }
     *
     * 5.转换流是哪两个类，分别的作用是什么？请分别创建两个类的对象。
     *      InputStreamReader:将输入的字节流转换为输入的字符流。 解码
     *      OutputStreamWriter：将输出的字符流转换为输出的字节流。编码
     *      InputStreamReader isr = new InputStreamReader(new FileInputStream(“a.txt”),”utf-8”);
     *      OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(“b.txt”),”gbk”);
     */
    @Test
    public void write() {
        String msg = "hello IO";
        try(BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("baseJava/temp/io.txt"), "gbk"))) {
            bw.write(msg);
            bw.newLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void read() {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("temp/io.txt"), "gbk"))){

            String msg = br.readLine();
            System.out.println(msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
