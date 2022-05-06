package com.coder.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestObject {

//    @NotBlank(message = "名称不能为空")
//    @Length(min = 2, max = 5, message = "长度2-5之间")
//    private String name;
//
//    @NotBlank(message = "mail 不可为空")
//    @Length(max = 10, message = "mail不超过{max}个字符")
//    @Email(message = "{valid.mail}")
//    private String mail;
//
//    @Max(10)
//    @Min(3)
//    private Integer number;

    @NotEmpty(message = "not null", groups = {VaildGroup.class})
    private String content;

//    @Size(min = 3, max = 5)
//    private List<Integer> list;


}
