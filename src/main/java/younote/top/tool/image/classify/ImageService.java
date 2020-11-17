package younote.top.tool.image.classify;

import younote.top.tool.image.pojo.Image;

/**
 * @Description:
 * @Author: duanluyao
 * @CreateTime: 2020/11/17 20:28:14
 */
public interface ImageService {
    /**
     * 获取图片exif信息
     * @return
     */
    Image getImageExifInfo();
}
