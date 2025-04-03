package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.Surface;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nsh implements nsb {
    public final nsb a;
    public long b;
    final /* synthetic */ nsi c;
    private final int d;

    public nsh(nsi nsiVar, nsb nsbVar, int i) {
        this.c = nsiVar;
        this.a = nsbVar;
        this.d = i;
    }

    @Override // defpackage.nsb
    public final int a() {
        throw null;
    }

    @Override // defpackage.nsb
    public final Surface b() {
        throw null;
    }

    @Override // defpackage.nsb
    public final lxz c() {
        return this.a.c();
    }

    public final void d() {
        this.c.d.b(new Runnable() { // from class: nsg
            @Override // java.lang.Runnable
            public final void run() {
                nsh nshVar = nsh.this;
                try {
                    if (nshVar.c.m) {
                        return;
                    }
                    nshVar.c.j();
                    nshVar.b += nshVar.c.n;
                    nshVar.c.j.g();
                    nsi nsiVar = nshVar.c;
                    int i = 0;
                    nsiVar.h = false;
                    int i2 = nsiVar.i + 1;
                    nsiVar.i = i2;
                    List list = nsiVar.a;
                    if (i2 == ((enou) list).c) {
                        nsiVar.i = 0;
                        nsiVar.l++;
                    } else {
                        i = i2;
                    }
                    nql nqlVar = (nql) list.get(i);
                    nsi nsiVar2 = nshVar.c;
                    npb npbVar = nsiVar2.b;
                    Looper myLooper = Looper.myLooper();
                    lti.f(myLooper);
                    nsi nsiVar3 = nshVar.c;
                    nsiVar2.j = npbVar.a(nqlVar, myLooper, nsiVar3, nsiVar3.c);
                    nshVar.c.j.h();
                } catch (RuntimeException e) {
                    nshVar.c.b(new nrd("Asset loader error", e, 1000));
                }
            }
        });
    }

    @Override // defpackage.nsb
    public final void f() {
        this.c.g.decrementAndGet();
        nsi nsiVar = this.c;
        if (nsiVar.k()) {
            this.a.f();
        } else if (nsiVar.g.get() == 0) {
            d();
        }
    }

    @Override // defpackage.nsb
    public final int h(Bitmap bitmap, ltr ltrVar) {
        throw null;
    }

    @Override // defpackage.nsb
    public final boolean i() {
        throw null;
    }

    @Override // defpackage.nsb
    public final void j() {
        lxz c = this.a.c();
        lti.g(c);
        if (c.eR()) {
            this.c.g.decrementAndGet();
            nsi nsiVar = this.c;
            if (!nsiVar.k()) {
                if (this.d == 1 && nsiVar.k) {
                    this.a.j();
                    lti.c(true);
                } else {
                    c.eO();
                    c.f = 0L;
                }
                if (this.c.g.get() == 0) {
                    d();
                    return;
                }
                return;
            }
        }
        this.a.j();
        lti.c(true);
    }
}
