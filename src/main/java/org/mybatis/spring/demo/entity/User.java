/*
 * Copyright 2010-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mybatis.spring.demo.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表对象
 *
 * @author Robert Hou
 * @since 2020年11月27日 22:25
 **/
@Data
@NoArgsConstructor
public class User implements Serializable {

  private static final long serialVersionUID = 7368535729213662088L;
  /**
   * 主键
   */
  private Long id;
  /**
   * 姓名
   */
  private String name;
  /**
   * 性别
   */
  private Boolean sex;
  /**
   * 手机
   */
  private String phone;
  /**
   * 地址
   */
  private String address;
}
