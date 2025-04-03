package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dowx implements ffjn {
    final /* synthetic */ ffji a;
    final /* synthetic */ ffji b;
    final /* synthetic */ dowe c;
    final /* synthetic */ dowj d;
    final /* synthetic */ boolean e;
    final /* synthetic */ doxf f;
    final /* synthetic */ doxe g;
    final /* synthetic */ hho h;

    public dowx(ffji ffjiVar, ffji ffjiVar2, dowe doweVar, dowj dowjVar, boolean z, doxf doxfVar, doxe doxeVar, hho hhoVar) {
        this.a = ffjiVar;
        this.b = ffjiVar2;
        this.c = doweVar;
        this.d = dowjVar;
        this.e = z;
        this.f = doxfVar;
        this.g = doxeVar;
        this.h = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final dyn dynVar = (dyn) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dynVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dynVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-966182109);
            boolean F = hfdVar.F(this.c) | hfdVar.D(this.a) | hfdVar.D(this.b) | ((intValue & 14) == 4) | hfdVar.F(this.d);
            final ffji ffjiVar = this.a;
            final ffji ffjiVar2 = this.b;
            final dowe doweVar = this.c;
            final dowj dowjVar = this.d;
            final hho hhoVar = this.h;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                ffji ffjiVar3 = new ffji() { // from class: dowv
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        Context context = (Context) obj4;
                        context.getClass();
                        WebView webView = (WebView) ffji.this.invoke(context);
                        ffjiVar2.invoke(webView);
                        long j = dynVar.a;
                        webView.setLayoutParams(new ViewGroup.LayoutParams(true != jzk.k(j) ? -2 : -1, true == jzk.j(j) ? -1 : -2));
                        webView.setWebChromeClient(doweVar);
                        webView.setWebViewClient(dowjVar);
                        WebSettings settings = webView.getSettings();
                        settings.getClass();
                        settings.setJavaScriptEnabled(true);
                        settings.setMediaPlaybackRequiresUserGesture(false);
                        hhoVar.b(webView);
                        return webView;
                    }
                };
                hfdVar.y(ffjiVar3);
                f = ffjiVar3;
            }
            ffji ffjiVar4 = (ffji) f;
            hfdVar.o();
            hfdVar.v(-966153429);
            boolean E = hfdVar.E(this.e) | hfdVar.D(this.f) | hfdVar.D(this.g);
            final boolean z = this.e;
            final doxf doxfVar = this.f;
            final doxe doxeVar = this.g;
            Object f2 = hfdVar.f();
            if (E || f2 == hfc.a) {
                f2 = new ffji() { // from class: doww
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        WebView webView = (WebView) obj4;
                        webView.getClass();
                        if (z) {
                            return ffcu.a;
                        }
                        dowm a = doxfVar.a();
                        if (a instanceof dowl) {
                            dowl dowlVar = (dowl) a;
                            String str = dowlVar.a;
                            if (str.length() > 0 && !ffkj.e(str, webView.getUrl())) {
                                webView.loadUrl(str, ffew.m(dowlVar.b));
                            }
                        } else {
                            if (!(a instanceof dowk)) {
                                throw new ffcd();
                            }
                            webView.loadDataWithBaseURL(null, ((dowk) a).a, null, "utf-8", null);
                        }
                        doxe doxeVar2 = doxeVar;
                        doxeVar2.b(webView.canGoBack());
                        doxeVar2.c(webView.canGoForward());
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            hfdVar.o();
            kcg.b(ffjiVar4, null, (ffji) f2, hfdVar, 0, 2);
        }
        return ffcu.a;
    }
}
