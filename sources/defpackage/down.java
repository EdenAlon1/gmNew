package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class down {
    private final WebResourceRequest a;
    private final WebResourceError b;

    public down(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a = webResourceRequest;
        this.b = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof down)) {
            return false;
        }
        down downVar = (down) obj;
        return ffkj.e(this.a, downVar.a) && ffkj.e(this.b, downVar.b);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.a;
        return ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "WebViewError(request=" + this.a + ", error=" + this.b + ")";
    }
}
