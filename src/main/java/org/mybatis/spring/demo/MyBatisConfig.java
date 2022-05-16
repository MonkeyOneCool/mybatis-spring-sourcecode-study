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

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@MapperScan("org.mybatis.spring.demo.dao")
public class MyBatisConfig {

  @Bean
  public SqlSessionFactory sqlSessionFactory() throws Exception {
    SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
    factoryBean.setDataSource(dataSource());
    factoryBean.setMapperLocations(new ClassPathResource("org/mybatis/spring/demo/xml/UserMapper.xml"));
    return factoryBean.getObject();
  }

  @Bean
  public DataSource dataSource() throws Exception {
    HikariDataSource dataSource = new HikariDataSource();
    dataSource.setJdbcUrl(
        "jdbc:mysql://localhost:3306/user?serverTimezone=GMT%2B8&useSSL=false&allowPublicKeyRetrieval=true&useUnicode=true&characterEncoding=UTF-8");
    dataSource.setUsername("root");
    dataSource.setPassword("root");
    return dataSource;
  }

  // @Bean
  // public MapperFactoryBean userMapper() throws Exception {
  // MapperFactoryBean mapperFactoryBean = new MapperFactoryBean(UserMapper.class);
  // mapperFactoryBean.setSqlSessionFactory(sqlSessionFactory());
  // return mapperFactoryBean;
  // }
}
