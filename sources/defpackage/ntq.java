package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ntq implements nrl {
    private final lsi a;
    private final List b;
    private final AtomicLong c = new AtomicLong();

    public ntq(lsi lsiVar, List list) {
        this.a = lsiVar;
        this.b = list;
    }

    @Override // defpackage.nsb
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.nsb
    public final Surface b() {
        return this.a.b();
    }

    @Override // defpackage.nsb
    public final /* synthetic */ lxz c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nry
    public final void e(nql nqlVar, long j, lqc lqcVar, boolean z) {
        String scheme;
        int i = 1;
        lti.a(!nqlVar.b());
        lqt lqtVar = nqlVar.a.b;
        boolean equals = (lqtVar == null || (scheme = lqtVar.a.getScheme()) == null) ? false : scheme.equals("transformer_surface_asset");
        long a = nqlVar.a(j);
        if (lqcVar != null) {
            if (lqcVar.y % 180 != 0) {
                lqb lqbVar = new lqb(lqcVar);
                lqbVar.t = lqcVar.w;
                lqbVar.u = lqcVar.v;
                lqbVar.w = 0;
                lqcVar = new lqc(lqbVar);
            }
            lqc lqcVar2 = lqcVar;
            engr engrVar = new engr();
            engrVar.j(nqlVar.g.c);
            engrVar.j(this.b);
            engw g = engrVar.g();
            lsi lsiVar = this.a;
            if (equals) {
                i = 4;
            } else {
                String str = lqcVar2.o;
                lti.f(str);
                if (lre.j(str)) {
                    i = 2;
                } else if (str.equals("video/raw")) {
                    i = 3;
                } else if (!lre.l(str)) {
                    throw new IllegalArgumentException("MIME type not supported ".concat(str));
                }
            }
            lsiVar.c(i, lqcVar2, g, this.c.get());
        }
        this.c.addAndGet(a);
    }

    @Override // defpackage.nsb
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.nsb
    public final int h(Bitmap bitmap, ltr ltrVar) {
        return this.a.h(bitmap, ltrVar) ? 1 : 2;
    }

    @Override // defpackage.nsb
    public final boolean i() {
        return this.a.g();
    }

    @Override // defpackage.nsb
    public final /* synthetic */ void j() {
        throw new UnsupportedOperationException();
    }
}
