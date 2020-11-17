package younote.top.tool.image.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Description: 图片信息实体类
 * @Author: duanluyao
 * @CreateTime: 2020/11/17 19:57:17
 */
@Data
public class Image {
    /**
     * 相机品牌
     */
    private String brand;
    /**
     * 相机型号
     */
    private String cameraModel;
    /**
     * 图片名称
     */
    private String imageName;
    /**
     * 图片拍照日期
     */
    private Date imageDate;

    /**
     * 图片类型
     */
    private String imageType;
}
