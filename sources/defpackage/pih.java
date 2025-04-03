package defpackage;

import android.util.Log;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pih {
    public static final ActivityEmbeddingComponent a() {
        Object newProxyInstance = Proxy.newProxyInstance(pij.class.getClassLoader(), new Class[]{pgq$$ExternalSyntheticApiModelOutline0.m621m()}, new InvocationHandler() { // from class: pig
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return ffcu.a;
            }
        });
        newProxyInstance.getClass();
        return pgq$$ExternalSyntheticApiModelOutline0.m(newProxyInstance);
    }

    public static final boolean b() {
        WindowExtensions windowExtensions;
        try {
            ClassLoader classLoader = pij.class.getClassLoader();
            if (classLoader != null) {
                pgp pgpVar = new pgp(classLoader);
                windowExtensions = WindowExtensionsProvider.getWindowExtensions();
                windowExtensions.getClass();
                if (new pla(classLoader, pgpVar, windowExtensions).a() != null) {
                    return true;
                }
            }
            return false;
        } catch (NoClassDefFoundError unused) {
            Log.d("EmbeddingCompat", "Embedding extension version not found");
            return false;
        } catch (UnsupportedOperationException unused2) {
            Log.d("EmbeddingCompat", "Stub Extension");
            return false;
        }
    }
}
