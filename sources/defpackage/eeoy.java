package defpackage;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eeoy extends WebViewClient {
    private static final entd a = entd.c("SaferWebViewClient");
    private final eepe b;
    private final eepe c;
    private boolean d = false;

    public eeoy(eepe eepeVar, eepe eepeVar2) {
        this.b = eepeVar;
        this.c = eepeVar2;
    }

    private static boolean a(WebView webView, boolean z, boolean z2) {
        if (z2) {
            return true;
        }
        if (z) {
            return false;
        }
        webView.loadUrl("about:invalid#zSaferWebViewz");
        return true;
    }

    private final boolean b(Uri uri) {
        boolean z = true;
        if (!eepd.a.matcher(uri.toString()).find() && !this.c.b(uri)) {
            z = false;
        }
        if (!z) {
            ((ensz) a.n().h("com/google/android/libraries/saferwebview/AbstractSaferWebViewClient", "isResourceAllowlisted", 290, "AbstractSaferWebViewClient.java")).t("Uri '%s' is not allowed as resource", eepd.a(uri));
        }
        return z;
    }

    public boolean d(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl().toString();
        return false;
    }

    public final void e() {
        this.d = true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        if (this.d || b(webResourceRequest.getUrl())) {
            return null;
        }
        return new WebResourceResponse("text/plain", "UTF-8", 403, "Resource not allowlisted", null, null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean d;
        boolean b = this.b.b(webResourceRequest.getUrl());
        if (b) {
            webResourceRequest.getUrl().toString();
            d = false;
        } else {
            d = d(webView, webResourceRequest);
        }
        return a(webView, b, d);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri.parse(str);
        if (this.d || b(Uri.parse(str))) {
            return null;
        }
        return new WebResourceResponse("text/plain", "UTF-8", 403, "Resource not allowlisted", null, null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, this.b.b(Uri.parse(str)), false);
    }
}
