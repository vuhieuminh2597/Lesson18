package com.example.studentmanagerment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/**
 *@Configuration là một Annotation đánh dấu trên một class, cho biết rằng class đó chứa các thông tin
 * cấu hình cho ứng dụng.
 */
public class DataBaseConfig {

    /**
     * @Bean là một Annotation đánh dấu trên một method trong class được đánh dấu @Configuration.
     * Nó cho biết rằng method đó tạo và trả về một bean và Spring Boot nên quản lý bean đó trong ứng dụng.
     * => Chúng sử dụng @Bean
     * trong trường hợp sử dụng các class thư viện bên thứ 3(các class đã được đóng gói thành file .class
     * không thể thực hiện chỉnh sửa code đánh dấu class bean theo cách trực tiếp)
     */
    @Bean
    public void initDatabase(){

    }
}
