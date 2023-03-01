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

package com.devops.plugins.gitlab.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @author sheep
 * @since 21-12-21
 */
@Getter
@Setter
public class FileDeleteReq {
    @NotNull(message = "error.file.path.null")
    @ApiModelProperty("文件路径")
    private String path;

    @NotNull(message = "error.commit.message.null")
    @ApiModelProperty("提交信息")
    private String commitMessage;

    @NotNull(message = "error.commit.user.id.null")
    @ApiModelProperty("操作人的gitlab用户id")
    private Integer userId;

    @ApiModelProperty("提交到的分支名称")
    private String branchName;

}
