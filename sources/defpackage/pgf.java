package defpackage;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgf implements pge {
    final WebViewProviderFactoryBoundaryInterface a;

    public pgf(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // defpackage.pge
    public final StaticsBoundaryInterface a() {
        return (StaticsBoundaryInterface) fimp.a(StaticsBoundaryInterface.class, this.a.getStatics());
    }

    @Override // defpackage.pge
    public final WebViewProviderBoundaryInterface b(WebView webView) {
        return (WebViewProviderBoundaryInterface) fimp.a(WebViewProviderBoundaryInterface.class, this.a.createWebView(webView));
    }

    @Override // defpackage.pge
    public final WebkitToCompatConverterBoundaryInterface c() {
        return (WebkitToCompatConverterBoundaryInterface) fimp.a(WebkitToCompatConverterBoundaryInterface.class, this.a.getWebkitToCompatConverter());
    }

    @Override // defpackage.pge
    public final String[] d() {
        return this.a.getSupportedFeatures();
    }
}
