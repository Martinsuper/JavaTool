package top.younote.tool.image.classify.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import top.younote.tool.image.classify.ImageService;
import top.younote.tool.image.pojo.Image;

import java.io.File;
import java.io.IOException;

/**
 * @Description:
 * @Author: duanluyao
 * @CreateTime: 2020/11/17 20:57:03
 */
@Service
@Slf4j
public class SonyImageService implements ImageService {

    private static final String TAG = "Exif IFD0";

    /**
     * 打印图片所有 EXIF 信息
     *
     * @param filePath
     * @return
     * @throws ImageProcessingException
     * @throws IOException
     */
    @Override
    public void getAllExifInfo(String filePath) {
        try {
            Metadata metadata = ImageMetadataReader.readMetadata(new File(filePath));
            metadata.getDirectories().forEach(res -> {
                res.getTags().forEach(tag -> {
                    log.info(res.getName() + " [" + tag.getTagName() + "] : " + tag.getDescription());
                });
            });
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

    }

    @Override
    public Image getImageExifInfo(String filePath) {
        Image image = new Image();
        try {

            Metadata metadata = ImageMetadataReader.readMetadata(new File(filePath));
            metadata.getDirectories().forEach(res -> {
                if (TAG.equals(res.getName())) {
                    JSONArray tags = JSON.parseArray(JSON.toJSONString(res.getTags()));
                    System.out.println(tags);
                }
            });
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return image;
    }
}
