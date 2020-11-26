package top.younote.tool.image.classify.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Author: duanluyao
 * @CreateTime: 2020/11/19 20:33:52
 */
@SpringBootTest
class SonyImageServiceTest {

    private static final String JPEG_PATH =
            "/Users/duanluyao/code/mycode/JavaTool/src/main/java/younote/top/tool/image/data/WechatIMG13.jpeg";
    private static final String RAW_PATH =
            "/Users/duanluyao/code/mycode/JavaTool/src/main/java/younote/top/tool/image/data/DSC05220.ARW";


    @Autowired
    SonyImageService sonyImageService;
    @Test
    void getAllExifInfo() {
        sonyImageService.getAllExifInfo(RAW_PATH);
    }

    @Test
    void getImageExifInfo() {
        sonyImageService.getImageExifInfo(RAW_PATH);
    }
}