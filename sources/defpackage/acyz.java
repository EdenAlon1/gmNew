package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyz implements acyw {
    @Override // defpackage.acyw
    public final void a(acyu acyuVar, pes pesVar, Uri uri) {
        Looper webViewLooper;
        WebView webView = (WebView) acyuVar.b().orElseThrow(new Supplier() { // from class: acyy
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("Could not post a WebMessage; WebView has been destroyed");
            }
        });
        if (pew.a.equals(uri)) {
            uri = pew.b;
        }
        int i = pesVar.c;
        pey peyVar = pga.d;
        if (i == 0) {
            webView.postWebMessage(pfi.a(pesVar), uri);
            return;
        }
        if (!peyVar.d() || !pfq.b(pesVar.c)) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            webViewLooper = webView.getWebViewLooper();
            if (webViewLooper != Looper.myLooper()) {
                throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
            }
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        pew.a(webView).a.postMessageToMainFrame(new fimo(new pfq(pesVar)), uri);
    }

    @Override // defpackage.acyw
    public final peu[] b(acyu acyuVar) {
        WebView webView = (WebView) acyuVar.b().orElseThrow(new Supplier() { // from class: acyx
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("Could not create a WebMessage channel; WebView has been destroyed");
            }
        });
        Uri uri = pew.a;
        pey peyVar = pga.a;
        return pfu.f(webView.createWebMessageChannel());
    }
}
