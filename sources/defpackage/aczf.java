package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczf implements aczc {
    @Override // defpackage.aczc
    public final void a(acyu acyuVar, String str) {
        WebView webView = (WebView) acyuVar.b().orElseThrow(new Supplier() { // from class: aczd
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("Cannot add message listener; WebView has been destroyed");
            }
        });
        Uri uri = pew.a;
        if (!pga.h.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        pew.a(webView).a.removeWebMessageListener(str);
    }

    @Override // defpackage.aczc
    public final void b(acyu acyuVar, String str, Set set, acwi acwiVar) {
        WebView webView = (WebView) acyuVar.b().orElseThrow(new Supplier() { // from class: acze
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("Cannot add message listener; WebView has been destroyed");
            }
        });
        Uri uri = pew.a;
        if (!pga.h.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        pgd a = pew.a(webView);
        a.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new fimo(new pfs(acwiVar)));
    }
}
