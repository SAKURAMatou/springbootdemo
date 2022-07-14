package com.dl.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
public class User {
    private String username;
    private String nickname;
    private String password;
    @TableId(value = "user_pkid", type = IdType.ASSIGN_UUID)
    private String user_pkid;
}
