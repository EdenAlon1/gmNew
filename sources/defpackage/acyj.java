package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.MailTo;
import android.net.ParseException;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.android.vcard.VCardConfig;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyj extends eepc implements ctbj {
    public Optional c;
    public elfl d;
    public final ctbl e;
    public final ctbl f;
    public final ctbl g;
    private final elbx j;
    private final albq k;
    private final ctbl l;
    private final String m;
    private static final cskc h = cskc.g("Bugle", "DittoWebView");
    private static final enru i = enru.c("com/google/android/apps/messaging/dittosatellite/webview/DittoWebViewClient");
    public static final engw a = engw.u("https://messages.google.com/web/*", "https://messages-web-preprod.sandbox.google.com/web/*", "https://messages-web-staging.sandbox.google.com/web/*", "https://messages-web-autopush.sandbox.google.com/web/*");
    static final engw b = engw.s("listening_on_sat_jsb_dittotobugle", "listening_on_sat_jsb_bugletoditto");

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public acyj(defpackage.elbx r8, defpackage.albq r9, defpackage.ctbk r10, java.lang.String r11) {
        /*
            r7 = this;
            engw r0 = defpackage.acyj.a
            int r1 = defpackage.eeoz.a
            int r1 = defpackage.engw.d
            engr r1 = new engr
            r1.<init>()
            enqv r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = defpackage.emxe.c(r2)
            if (r3 != 0) goto Lf
            java.lang.String r3 = "://"
            int r3 = r2.indexOf(r3)
            r4 = -1
            if (r3 == r4) goto Lf
            int r3 = r3 + 3
            java.lang.String r5 = "/"
            int r5 = r2.indexOf(r5, r3)
            if (r5 != r4) goto L3a
            java.lang.String r5 = "\\?"
            int r5 = r2.indexOf(r5, r3)
        L3a:
            if (r5 != r4) goto L42
            java.lang.String r5 = "#"
            int r5 = r2.indexOf(r5, r3)
        L42:
            if (r5 != r4) goto L48
            int r5 = r2.length()
        L48:
            java.lang.String r6 = "*"
            int r6 = r2.indexOf(r6)
            if (r6 == r4) goto L54
            if (r6 < r3) goto L54
            if (r6 < r5) goto Lf
        L54:
            emxc r2 = defpackage.eepb.a(r2)
            boolean r3 = r2.g()
            if (r3 == 0) goto Lf
            java.lang.Object r2 = r2.c()
            r1.h(r2)
            goto Lf
        L66:
            eeoz r0 = new eeoz
            engw r1 = r1.g()
            r0.<init>(r1)
            r7.<init>(r0)
            j$.util.Optional r0 = j$.util.Optional.empty()
            r7.c = r0
            ctbl r0 = r10.a(r7)
            r7.l = r0
            ctbl r0 = r10.a(r7)
            r7.e = r0
            ctbl r0 = r10.a(r7)
            r7.f = r0
            ctbl r10 = r10.a(r7)
            r7.g = r10
            r7.j = r8
            r7.k = r9
            r7.m = r11
            acye r8 = new acye
            r8.<init>()
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.kfg.a(r8)
            elfl r8 = defpackage.elfl.g(r8)
            r7.d = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acyj.<init>(elbx, albq, ctbk, java.lang.String):void");
    }

    private final void f() {
        this.d = elfl.g(kfg.a(new kfd() { // from class: acyf
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                acyj.this.c = Optional.of(kfbVar);
                return null;
            }
        }));
    }

    public final ctbx a(String str, ctbf ctbfVar) {
        return this.l.a(ctbfVar, "Subscribe to Ditto Load Start Events", str, "Unsubscribe from Ditto Load Start Events");
    }

    @Override // defpackage.eeoy
    public final boolean d(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url == null) {
            return false;
        }
        String uri = url.toString();
        if (uri != null && uri.startsWith(acrz.d())) {
            webView.loadUrl(url.toString());
            return true;
        }
        if (URLUtil.isNetworkUrl(url.toString())) {
            try {
                Context context = webView.getContext();
                Intent intent = new Intent("android.intent.action.VIEW", url);
                if (!(context instanceof Activity)) {
                    intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                }
                eldl.p(context, intent);
                return true;
            } catch (ActivityNotFoundException e) {
                h.s("Did not find a browser to open link in", e);
            }
        } else {
            String uri2 = url.toString();
            cskc cskcVar = cpdg.a;
            if (aoqw.h(uri2)) {
                try {
                    Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
                    try {
                        String[] split = MailTo.parse(url.toString()).getTo().split(",");
                        if (split.length == 0) {
                            ((enrr) ((enrr) i.j()).h("com/google/android/apps/messaging/dittosatellite/webview/DittoWebViewClient", "onUrlLoadBlocked", 149, "DittoWebViewClient.java")).q("No TO addresses parsed, not sending email intent");
                            return false;
                        }
                        intent2.putExtra("android.intent.extra.EMAIL", split);
                        Context context2 = webView.getContext();
                        if (!(webView.getContext() instanceof Activity)) {
                            intent2.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                        }
                        eldl.p(context2, intent2);
                        return true;
                    } catch (ParseException unused) {
                        ((enrr) ((enrr) i.j()).h("com/google/android/apps/messaging/dittosatellite/webview/DittoWebViewClient", "onUrlLoadBlocked", 145, "DittoWebViewClient.java")).q("Failed to parse mailto link");
                        return false;
                    }
                } catch (ActivityNotFoundException e2) {
                    h.s("Did not find a email app to open the email in", e2);
                }
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String queryParameter;
        Uri parse = Uri.parse(str);
        if (str != null && emxe.b(parse.getPath()).equals("/web/notify_satellite") && (queryParameter = parse.getQueryParameter("event")) != null && b.contains(queryParameter)) {
            ekzm b2 = this.j.b("receivedInterceptorSignal");
            try {
                csjb c = h.c();
                c.I("Received interceptor signal");
                c.A("signal", queryParameter);
                c.r();
                ekzz f = eleg.f("Interceptor Signal Callback");
                try {
                    this.g.b(queryParameter, f);
                    f.close();
                    b2.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    b2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ekzm b2 = this.j.b("onPageFinished");
        try {
            if (emxe.b(Uri.parse(str).getPath()).startsWith("/web")) {
                this.k.n(this.m);
                this.c.ifPresent(new Consumer() { // from class: acyg
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        engw engwVar = acyj.a;
                        ((kfb) obj).b(null);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                f();
                ekzz f = eleg.f("Ditto Load finish Callback");
                try {
                    this.e.b(null, f);
                    f.close();
                } finally {
                }
            }
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ekzz f;
        super.onPageStarted(webView, str, bitmap);
        ekzm b2 = this.j.b("onPageStarted");
        try {
            if (emxe.b(Uri.parse(str).getPath()).startsWith("/web")) {
                h.p("Detected a Ditto page load starting");
                this.k.b(this.m);
                f = eleg.f("Ditto Load Start Callback");
                try {
                    this.l.b(null, f);
                    f.close();
                } finally {
                }
            }
            if (emxe.b(Uri.parse(str).getPath()).startsWith("/web/authentication")) {
                h.p("Ditto is on the Authentication page");
                f = eleg.f("Ditto Needs Authentication Callback");
                try {
                    this.f.b(null, f);
                    f.close();
                } finally {
                }
            }
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        Uri url = webResourceRequest.getUrl();
        csjb e = h.e();
        e.I("onReceivedError");
        e.A("urlHost", url.getHost());
        e.A("description", webResourceError.getDescription());
        e.y("code", webResourceError.getErrorCode());
        e.r();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (url == null || !emxe.b(url.getPath()).startsWith("/web")) {
            return;
        }
        this.k.e(this.m);
        this.c.ifPresent(new Consumer() { // from class: acyh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                engw engwVar = acyj.a;
                ((kfb) obj).c(new acyi(webResourceError));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        f();
    }

    @Override // defpackage.ctbj
    public final void fN() {
    }

    @Override // defpackage.ctbj
    public final void fO() {
    }
}
