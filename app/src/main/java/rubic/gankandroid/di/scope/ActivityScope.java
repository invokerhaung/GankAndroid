package rubic.gankandroid.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
/**
 * Created by invokerhuang on 2017/9/19.
 */
@Scope
@Retention(RUNTIME)
public @interface ActivityScope {
}
