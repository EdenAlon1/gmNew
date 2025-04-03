package defpackage;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczb {
    public static final void a(acyu acyuVar, int i) {
        WebSettings settings = ((WebView) acyuVar.b().orElseThrow(new acza())).getSettings();
        pfe pfeVar = pga.f;
        if (pfeVar.a()) {
            settings.setForceDark(i);
        } else {
            if (!pfeVar.d()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            pev.a(settings).a(i);
        }
    }
}
