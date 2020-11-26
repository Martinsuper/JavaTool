package top.younote.tool.image.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description: Sony 相机Tag枚举类型
 * @Author: duanluyao
 * @CreateTime: 2020/11/19 20:57:53
 */
@AllArgsConstructor
public enum SonyEnum {
    SONY_ENUM(1,"Make","brand");
    /**
     * 枚举值
     */
    private Integer value;
    /**
     * 枚举描述
     */
    private String desc;

    private String map;
}
