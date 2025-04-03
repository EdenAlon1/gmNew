package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dowj extends eepc {
    public doxf a;
    public doxe b;

    public dowj(eepe eepeVar) {
        super(eepeVar);
    }

    public final doxe a() {
        doxe doxeVar = this.b;
        if (doxeVar != null) {
            return doxeVar;
        }
        ffkj.c("navigator");
        return null;
    }

    public final doxf b() {
        doxf doxfVar = this.a;
        if (doxfVar != null) {
            return doxfVar;
        }
        ffkj.c("state");
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        String str2;
        webView.getClass();
        super.doUpdateVisitedHistory(webView, str, z);
        if (str != null && !ffpc.t(str, "data:text/html")) {
            dowm a = b().a();
            if (a instanceof dowl) {
                str2 = ((dowl) a).a;
            } else {
                if (!(a instanceof dowk)) {
                    throw new ffcd();
                }
                str2 = null;
            }
            if (!ffkj.e(str2, str)) {
                doxf b = b();
                dowm a2 = b().a();
                a2.getClass();
                b.a.b(a2 instanceof dowl ? new dowl(str, ((dowl) a2).b) : new dowl(str, ffem.a));
            }
        }
        a().b(webView.canGoBack());
        a().c(webView.canGoForward());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        super.onPageFinished(webView, str);
        b().b(dowf.a);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        super.onPageStarted(webView, str, bitmap);
        b().b(new dowh(0.0f));
        b().c.clear();
        b().d(null);
        b().c(null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            b().c.add(new down(webResourceRequest, webResourceError));
        }
    }
}
