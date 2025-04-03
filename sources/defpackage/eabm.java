package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class eabm extends WebViewClient {
    private long a = 0;
    private final emxc b;

    public eabm(emxc emxcVar) {
        this.b = emxcVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.b.g()) {
            new Date().getTime();
            ((dzyb) this.b.c()).a();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.a = new Date().getTime();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.b.g()) {
            ((dzyb) this.b.c()).a();
        }
    }
}
