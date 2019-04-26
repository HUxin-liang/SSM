package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能描述：标识Mybatis的DAO，方便{@link org.mybatis.spring.mapper.MapperScannerConfigurer}的扫描
 *  param：
 *  return:
 *  author：hu.tutu
 *  date:
 */


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyBatisDao {
}
