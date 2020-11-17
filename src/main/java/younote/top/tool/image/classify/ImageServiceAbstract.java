package younote.top.tool.image.classify;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;

/**
 * @Description:
 * @Author: duanluyao
 * @CreateTime: 2020/11/17 20:43:57
 */
@Slf4j
public abstract class ImageServiceAbstract implements ImageService {
    /**
     * 打印图片所有 EXIF 信息
     * @param filePath
     * @throws ImageProcessingException
     * @throws IOException
     */
    private void getAllExifInfo(String filePath) throws ImageProcessingException, IOException {
        Metadata metadata = ImageMetadataReader.readMetadata(new File(filePath));
        metadata.getDirectories().forEach(res -> {
            res.getTags().forEach(tag -> {
                log.info(res.getName() + " [" + tag.getTagName() + "] : " + tag.getDescription());
            });
        });
    }

}
