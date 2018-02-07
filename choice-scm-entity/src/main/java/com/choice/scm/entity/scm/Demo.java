package com.choice.scm.entity.scm;

import lombok.Data;

import java.io.Serializable;

/**
 * @author linwbai
 * @version $Id: Demo.java, v 0.1 2018-01-17 上午10:52 linwbai Exp $$
 */
@Data
public class Demo implements Serializable {

    private static final long serialVersionUID = 3459565965181324358L;

    private Long id;

    private String test;
}
