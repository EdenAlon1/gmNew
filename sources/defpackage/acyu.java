package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyu {
    public final akzt a;
    private final WeakReference b;

    public acyu(akzt akztVar, WebView webView, acyj acyjVar, WebChromeClient webChromeClient) {
        this.a = akztVar;
        webView.setWebViewClient(acyjVar);
        if (webChromeClient != null) {
            webView.setWebChromeClient(webChromeClient);
        }
        this.b = new WeakReference(webView);
    }

    public final Optional a() {
        return b().map(new Function() { // from class: acyq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                WebViewClient webViewClient;
                webViewClient = ((WebView) obj).getWebViewClient();
                return webViewClient;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: acyr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                WebViewClient webViewClient = (WebViewClient) obj;
                if (webViewClient instanceof acyj) {
                    return (acyj) webViewClient;
                }
                acyu.this.a.e("Satellite.Exceptions.WeakWrappedDittoWebView", 1);
                throw new IllegalStateException("WebView client does not extend DittoWebViewClient");
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final Optional b() {
        return Optional.ofNullable((WebView) this.b.get());
    }

    public final Optional c() {
        return b().map(new Function() { // from class: acys
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((WebView) obj).getSettings();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final void d(String str) {
        ((WebView) b().orElseThrow(new Supplier() { // from class: acyl
            @Override // java.util.function.Supplier
            public final Object get() {
                acyu.this.a.e("Satellite.Exceptions.WeakWrappedDittoWebView", 2);
                return new IllegalStateException("Could not load Url; WebView has been destroyed");
            }
        })).loadUrl(str);
    }

    public final void e(String str, Map map) {
        ((WebView) b().orElseThrow(new Supplier() { // from class: acym
            @Override // java.util.function.Supplier
            public final Object get() {
                acyu.this.a.e("Satellite.Exceptions.WeakWrappedDittoWebView", 2);
                return new IllegalStateException("Could not load Url; WebView has been destroyed");
            }
        })).loadUrl(str, map);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof acyu) {
            return b().equals(((acyu) obj).b());
        }
        return false;
    }

    public final void f() {
        ((WebView) b().orElseThrow(new Supplier() { // from class: acyn
            @Override // java.util.function.Supplier
            public final Object get() {
                acyu.this.a.e("Satellite.Exceptions.WeakWrappedDittoWebView", 3);
                return new IllegalStateException("Could not set importantForAccessibility; WebView has been destroyed");
            }
        })).setImportantForAccessibility(1);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
