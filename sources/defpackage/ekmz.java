package defpackage;

import android.content.ComponentCallbacks2;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekmz {
    public volatile qqs a;
    private final ffbr c;
    private final ekna d;
    private final boolean e;
    private final Object f = new Object();
    public final ComponentCallbacks2 b = new ekmu(this);

    public ekmz(ffbr ffbrVar, ekna eknaVar, boolean z) {
        this.c = ffbrVar;
        this.d = eknaVar;
        this.e = z;
    }

    public final qqo a(Class cls) {
        return h().a(cls);
    }

    public final qqo b() {
        return h().b();
    }

    public final qqo c() {
        return h().d();
    }

    public final qqo d(Drawable drawable) {
        return h().e(drawable);
    }

    public final qqo e(Uri uri) {
        return h().f(uri);
    }

    public final qqo f(qtp qtpVar) {
        return h().h(qtpVar);
    }

    public final qqo g(String str) {
        return h().i(str);
    }

    public final qqs h() {
        if (this.e) {
            efbd.c();
        }
        if (this.a == null) {
            synchronized (this.f) {
                if (this.a == null) {
                    this.a = (qqs) this.c.b();
                    this.d.a(this);
                }
            }
        }
        return this.a;
    }
}
