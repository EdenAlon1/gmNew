package defpackage;

import android.webkit.JavascriptInterface;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eabf {
    private final LighterWebView a;
    private final Runnable b;

    public eabf(LighterWebView lighterWebView, Runnable runnable) {
        this.a = lighterWebView;
        this.b = runnable;
    }

    @JavascriptInterface
    public void dismissWebView(String str) {
        this.a.post(this.b);
    }
}
