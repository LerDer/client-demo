package com.ler.mina.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 修改记录
 * </p>
 *
 * @author lww
 * @since 2020-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ChangeRecord对象", description="修改记录")
public class ChangeRecord extends Model<ChangeRecord> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "关联的配置信息id")
    private Long messageId;

    @ApiModelProperty(value = "操作人名称")
    private String operator;

    @ApiModelProperty(value = "原配置")
    private String originConfig;

    @ApiModelProperty(value = "新配置")
    private String newConfig;

    @ApiModelProperty(value = "操作人id")
    private Long creator;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
