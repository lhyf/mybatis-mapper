package org.lhyf.mybatis.model.Vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/****
 * @author YF
 * @date 2018-11-05 10:51
 * @desc EmployeeVo
 *
 **/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeVo {
    private Integer empId;

    private String empName;

    private Double empSalary;
}
