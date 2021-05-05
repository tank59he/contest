package com.bjfu.contest.pojo.entity;

import com.bjfu.contest.enums.ContestRegisterStatusEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**
 * 竞赛报名登记实体
 * @author warthog
 */
@Getter
@Setter
@Entity
public class ContestRegister extends BaseEntity {
    /**
     * 报名的竞赛
     */
    @ManyToOne
    private Contest contest;
    /**
     * 报名的用户
     */
    @ManyToOne
    private User user;
    /**
     * 状态
     */
    @Enumerated
    @Column(nullable = false)
    private ContestRegisterStatusEnum status;
}
