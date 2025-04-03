package defpackage;

import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acoc extends acpe {
    private final WebView a;
    private final acyu b;

    public acoc(WebView webView, acyu acyuVar) {
        this.a = webView;
        if (acyuVar == null) {
            throw new NullPointerException("Null weakWrappedDittoWebView");
        }
        this.b = acyuVar;
    }

    @Override // defpackage.acpe
    public final WebView a() {
        return this.a;
    }

    @Override // defpackage.acpe
    public final acyu b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acpe) {
            acpe acpeVar = (acpe) obj;
            if (this.a.equals(acpeVar.a()) && this.b.equals(acpeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        acyu acyuVar = this.b;
        return "FullWrappedDittoWebView{webView=" + this.a.toString() + ", weakWrappedDittoWebView=" + acyuVar.toString() + "}";
    }
}
