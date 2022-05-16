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
package org.mybatis.spring.demo;

import org.mybatis.spring.demo.dao.UserMapper;
import org.mybatis.spring.demo.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Robert Hou
 * @since 2022年05月03日 22:19
 **/
public class Test {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyBatisConfig.class);
    UserMapper userMapper = annotationConfigApplicationContext.getBean(UserMapper.class);
    User user = userMapper.getById(1L);
    System.out.println(user);
  }
}
