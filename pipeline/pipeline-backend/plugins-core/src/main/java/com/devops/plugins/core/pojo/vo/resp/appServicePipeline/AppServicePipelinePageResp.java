/*
 *
 * Copyright 2023 Talkweb Co., Ltd.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * /
 */

package com.devops.plugins.core.pojo.vo.resp.appServicePipeline;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * 应用服务的ci流水线表
 *
 * @author sheep
 * @Date 2022-01-11 14:36:10
 */
@Getter
@Setter
public class AppServicePipelinePageResp  implements Serializable{

	private static final long serialVersionUID = 1L;

    /** pipelineId */
    @ApiModelProperty(notes = "流水线id", dataType = "String", example = "流水线id")
    private String pipelineId;
	/** 应用服务id */
    @ApiModelProperty(notes = "应用服务id", dataType = "String", example = "应用服务id")
    private String appServiceId;
	/** 状态(enable启用,disable禁用) */
    @ApiModelProperty(notes = "状态(enable启用,disable禁用)", dataType = "String", example = "状态(enable启用,disable禁用)")
    private String status;
	/** gitlab分支 */
    @ApiModelProperty(notes = "gitlab分支", dataType = "String", example = "gitlab分支")
    private String gitlabRef;
	/** 提交sha */
    @ApiModelProperty(notes = "提交sha", dataType = "String", example = "提交sha")
    private String sha;
	/** 提交内容 */
    @ApiModelProperty(notes = "提交内容", dataType = "String", example = "提交内容")
    private String commitContent;
    /** pipeline时长 */
    @ApiModelProperty(notes = "pipeline时长", dataType = "String", example = "pipeline时长")
    private String duration;
	/** 提交人 */
    @ApiModelProperty(notes = "提交人", dataType = "String", example = "提交人")
    private String commiter;
	/** 开始时间 */
    @ApiModelProperty(notes = "开始时间", dataType = "Date", example = "开始时间")
    private Date startTime;
	/** 结束时间 */
    @ApiModelProperty(notes = "结束时间", dataType = "Date", example = "结束时间")
    private Date endTime;

    @ApiModelProperty(notes = "流水线阶段", dataType = "List", example = "流水线阶段")
    private List<AppServicePipelineStageResp> stages;

    @ApiModelProperty(notes = "创建时间", dataType = "Date", example = "创建时间")
    private Date createTime;



    public  Timestamp modifyTime(Date create_time){
        long time = create_time.getTime() / 1000l;
        long daySecond = 60 * 60 * 24;
        long dayTime = time - (time + 8 * 3600) % daySecond;
        return new Timestamp(dayTime * 1000);
    }
}
