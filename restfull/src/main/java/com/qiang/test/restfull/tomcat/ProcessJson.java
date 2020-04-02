/*
 * 创建日期：2020年4月1日 上午2:04:08
 * 创  建  人：zhang.qiangqiang
 * 修改历史：
 *     1. [2020年4月1日]创建文件 by zhang.qiangqiang
 */

package com.qiang.test.restfull.tomcat;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * TODO（添加类/接口功能描述）
 * 
 * @author zhang.qiangqiang 2020年4月1日 上午2:04:08
 *
 */
@Configuration
public class ProcessJson implements WebMvcConfigurer {

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * addArgumentResolvers(java.util.List)
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> arg0) {
        // TODO Auto-generated method stub

    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * addFormatters(org.springframework.format.FormatterRegistry)
     */
    @Override
    public void addFormatters(FormatterRegistry arg0) {
        // TODO Auto-generated method stub

    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * addInterceptors(org.springframework.web.servlet.config.annotation.
     * InterceptorRegistry)
     */
    @Override
    public void addInterceptors(InterceptorRegistry arg0) {
        // TODO Auto-generated method stub

    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * addResourceHandlers(org.springframework.web.servlet.config.annotation.
     * ResourceHandlerRegistry)
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry arg0) {
        // TODO Auto-generated method stub

    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * addReturnValueHandlers(java.util.List)
     */
    @Override
    public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> arg0) {
        // TODO Auto-generated method stub

    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * addViewControllers(org.springframework.web.servlet.config.annotation.
     * ViewControllerRegistry)
     */
    @Override
    public void addViewControllers(ViewControllerRegistry arg0) {
        // TODO Auto-generated method stub

    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * configureAsyncSupport(org.springframework.web.servlet.config.annotation.
     * AsyncSupportConfigurer)
     */
    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer arg0) {
        // TODO Auto-generated method stub

    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * configureContentNegotiation(org.springframework.web.servlet.config.
     * annotation.ContentNegotiationConfigurer)
     */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer arg0) {
        // TODO Auto-generated method stub

    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * configureDefaultServletHandling(org.springframework.web.servlet.config.
     * annotation.DefaultServletHandlerConfigurer)
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer arg0) {
        // TODO Auto-generated method stub

    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * configureHandlerExceptionResolvers(java.util.List)
     */
    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> arg0) {
        // TODO Auto-generated method stub

    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * configureMessageConverters(java.util.List)
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 创建fastJson消息转换器
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        // 创建配置类
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        // 修改配置返回内容的过滤
        fastJsonConfig.setSerializerFeatures(
            SerializerFeature.DisableCircularReferenceDetect,
            SerializerFeature.WriteMapNullValue,
            SerializerFeature.WriteNullStringAsEmpty
        );
        fastConverter.setFastJsonConfig(fastJsonConfig);
        // 将fastjson添加到视图消息转换器列表内
        converters.add(fastConverter);
    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * configurePathMatch(org.springframework.web.servlet.config.annotation.
     * PathMatchConfigurer)
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer arg0) {
        // TODO Auto-generated method stub

    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * getMessageCodesResolver()
     */
    @Override
    public MessageCodesResolver getMessageCodesResolver() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * zhang.qiangqiang 2020年4月1日 上午2:04:08
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#
     * getValidator()
     */
    @Override
    public Validator getValidator() {
        // TODO Auto-generated method stub
        return null;
    }

}
