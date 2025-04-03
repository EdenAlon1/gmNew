package defpackage;

import android.webkit.WebView;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eabl extends eabm {
    final /* synthetic */ LighterWebView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eabl(LighterWebView lighterWebView, emxc emxcVar) {
        super(emxcVar);
        this.a = lighterWebView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.a.b(webView, str).booleanValue();
    }
}
