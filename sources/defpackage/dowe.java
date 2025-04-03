package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dowe extends WebChromeClient {
    public doxf a;

    public final doxf a() {
        doxf doxfVar = this.a;
        if (doxfVar != null) {
            return doxfVar;
        }
        ffkj.c("state");
        return null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        webView.getClass();
        super.onProgressChanged(webView, i);
        if (((dowi) a().b.a()) instanceof dowf) {
            return;
        }
        a().b(new dowh(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        webView.getClass();
        super.onReceivedIcon(webView, bitmap);
        a().c(bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        webView.getClass();
        super.onReceivedTitle(webView, str);
        a().d(str);
    }
}
