package defpackage;

import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import j$.util.Collection;
import java.util.List;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyd extends WebChromeClient implements ljv {
    public static final /* synthetic */ int d = 0;
    private static final cskc e = cskc.g("Bugle", "DittoWebChromeClient");
    final adn a;
    ValueCallback b;
    adg c;
    private final adu f = new ady();

    public acyd(adn adnVar) {
        this.a = adnVar;
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        this.c = this.a.c("DittoWebChromeClient_onShowFileChooser", lkrVar, this.f, new adf() { // from class: acyb
            @Override // defpackage.adf
            public final void a(Object obj) {
                List list = (List) obj;
                ValueCallback valueCallback = acyd.this.b;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue((Uri[]) Collection.EL.stream(list).toArray(new IntFunction() { // from class: acyc
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i) {
                            int i2 = acyd.d;
                            return new Uri[i];
                        }
                    }));
                }
            }
        });
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        csjb a = e.a();
        a.I("Console");
        a.y("lineNumber", consoleMessage.lineNumber());
        a.A("sourceId", consoleMessage.sourceId());
        a.A("message", consoleMessage.message());
        a.r();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.b = valueCallback;
        this.c.c("*/*");
        return true;
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
