package defpackage;

import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doxc implements ffxy {
    final /* synthetic */ WebView a;

    public doxc(WebView webView) {
        this.a = webView;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        int ordinal = ((doxa) obj).ordinal();
        if (ordinal == 0) {
            this.a.goBack();
        } else if (ordinal == 1) {
            this.a.goForward();
        } else if (ordinal == 2) {
            this.a.reload();
        } else {
            if (ordinal != 3) {
                throw new ffcd();
            }
            this.a.stopLoading();
        }
        return ffcu.a;
    }
}
