package com.bjfu.contest.enums;

import lombok.Getter;

/**
 * 竞赛流程队伍状态枚举
 * @author warthog
 */
@Getter
public enum ContestProcessGroupStatusEnum {

    PREPARING("准备中"),
    READY("准备完成"),
    PROMOTION("成功晋级"),
    ELIMINATE("淘汰");

    private final String msg;

    ContestProcessGroupStatusEnum(String msg) {
        this.msg = msg;
    }
}
