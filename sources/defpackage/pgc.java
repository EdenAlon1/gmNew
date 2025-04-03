package defpackage;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgc {
    public static final pge a;

    static {
        pge pfkVar;
        ClassLoader classLoader;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    classLoader = WebView.getWebViewClassLoader();
                } else {
                    try {
                        Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                        declaredMethod.setAccessible(true);
                        classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
                pfkVar = new pgf((WebViewProviderFactoryBoundaryInterface) fimp.a(WebViewProviderFactoryBoundaryInterface.class, (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0])));
            } catch (ClassNotFoundException unused) {
                pfkVar = new pfk();
            }
            a = pfkVar;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
