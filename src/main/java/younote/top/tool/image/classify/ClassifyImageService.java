package younote.top.tool.image.classify;


import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

/**
 * @Description: 对图片分类
 * @Author: duanluyao
 * @CreateTime: 2020/11/17 17:22:04
 */
@Slf4j
@Service
public class ClassifyImageService {
    private static final String JPEG_PATH =
            "/Users/duanluyao/code/mycode/JavaTool/src/main/java/younote/top/tool/image/data/WechatIMG13.jpeg";
    private static final String RAW_PATH =
            "/Users/duanluyao/code/mycode/JavaTool/src/main/java/younote/top/tool/image/DSC05220.ARW";
    public static void main(String[] args) throws ImageProcessingException, IOException {
    }


}
