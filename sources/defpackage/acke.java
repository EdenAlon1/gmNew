package defpackage;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acke implements acpg {
    public static final entd a = entd.c("BugleSatelliteBg");
    public final ffbr b;
    private final Context c;
    private final acuq d;
    private final acyk e;
    private final acyv f;
    private WebView g;
    private acyu h;

    public acke(Context context, acuq acuqVar, ffbr ffbrVar, acyk acykVar, acyv acyvVar) {
        this.c = context;
        this.d = acuqVar;
        this.b = ffbrVar;
        this.e = acykVar;
        this.f = acyvVar;
    }

    @Override // defpackage.acpg
    public final acyu a(Map map) {
        if (this.g != null) {
            throw new IllegalStateException("Background service WebView can only be created once.");
        }
        if (this.d.h(acua.BACKGROUND)) {
            throw new IllegalStateException("Cannot create background bridge, one already exists");
        }
        WebView webView = new WebView(this.c);
        this.g = webView;
        acyv acyvVar = this.f;
        acyj a2 = this.e.a("Bugle.Satellite.Background.LoadDuration");
        a2.e();
        acyu a3 = acyvVar.a(webView, a2, new ackd());
        this.h = a3;
        a3.c().ifPresent(new Consumer() { // from class: ackc
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                WebSettings webSettings = (WebSettings) obj;
                webSettings.setJavaScriptEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setUserAgentString(webSettings.getUserAgentString() + " " + new emww(" ").b((Iterable) acke.this.b.b()));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a3.f();
        String uri = acrz.b(acrz.a().appendPath("satellite_bg")).build().toString();
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundWebViewFactory", "createAndLoad", 109, "SatelliteBackgroundWebViewFactory.java")).t("Starting WebView Load on %s", uri);
        a3.e(uri, map);
        return a3;
    }

    @Override // defpackage.acpg
    public final void b() {
        if (this.h != null) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundWebViewFactory", "destroy", 76, "SatelliteBackgroundWebViewFactory.java")).q("Unloading background service webview");
            final acyu acyuVar = this.h;
            acyuVar.getClass();
            acyuVar.b().ifPresent(new Consumer() { // from class: acyo
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    acyu.this.d("about:blank");
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        WebView webView = this.g;
        if (webView != null) {
            webView.destroy();
        }
        this.g = null;
        this.h = null;
    }
}
