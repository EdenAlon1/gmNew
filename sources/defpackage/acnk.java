package defpackage;

import android.content.Context;
import android.webkit.CookieManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnk implements acni {
    public static final cskc a = cskc.g("Bugle", "SatelliteGaiaCookiesAuth");
    public final ffbr b;
    public final ejar c;
    public final ffbr d;
    public final dfao e;
    private final ffsk f;
    private final CookieManager g;

    public acnk(Context context, ffsk ffskVar, ffbr ffbrVar, ejar ejarVar, ffbr ffbrVar2) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ejarVar.getClass();
        ffbrVar2.getClass();
        this.f = ffskVar;
        this.b = ffbrVar;
        this.c = ejarVar;
        this.d = ffbrVar2;
        this.e = new dfao(context);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.getClass();
        this.g = cookieManager;
    }

    @Override // defpackage.acni
    public final elfl a(eisx eisxVar) {
        elfl c;
        eisxVar.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new acnj(this, eisxVar, null));
        return c;
    }

    @Override // defpackage.acni
    public final void b() {
        try {
            this.g.removeAllCookies(null);
            this.g.flush();
            ((akzt) this.b.b()).e("Bugle.Satellite.Gaia.Cookies.Remove.Result", 1);
        } catch (RuntimeException e) {
            csjb e2 = a.e();
            e2.I("Unable to remove cookies due to runtime exception");
            e2.s(e);
            ((akzt) this.b.b()).e("Bugle.Satellite.Gaia.Cookies.Remove.Result", 2);
            axnw.h(((cfyt) this.d.b()).b(e));
        }
    }
}
