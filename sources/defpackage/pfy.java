package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pfy extends pfa {
    public pfy() {
        super("MULTI_PROFILE", "MULTI_PROFILE");
    }

    @Override // defpackage.pfg
    public final boolean d() {
        if (!super.d() || !pga.a("MULTI_PROCESS")) {
            return false;
        }
        Uri uri = pew.a;
        if (pga.e.d()) {
            return pgc.a.a().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
