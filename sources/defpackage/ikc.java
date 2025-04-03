package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ikc extends hvh implements ixv, ixl, isu {
    public itf a;
    public boolean b;
    private ikq c;

    public ikc(ikq ikqVar, itf itfVar) {
        this.a = itfVar;
        this.c = ikqVar;
    }

    private final void i() {
        ikq ikqVar;
        fflb fflbVar = new fflb();
        ixw.b(this, new ikb());
        ikc ikcVar = (ikc) fflbVar.a;
        if (ikcVar == null || (ikqVar = ikcVar.c) == null) {
            ikqVar = this.c;
        }
        b(ikqVar);
    }

    private final void j() {
        ffkx ffkxVar = new ffkx();
        ffkxVar.a = true;
        ixw.d(this, new ika(ffkxVar));
        if (ffkxVar.a) {
            i();
        }
    }

    private final void k() {
        ffcu ffcuVar;
        if (this.b) {
            this.b = false;
            if (this.z) {
                fflb fflbVar = new fflb();
                ixw.b(this, new ijz(fflbVar));
                ikc ikcVar = (ikc) fflbVar.a;
                if (ikcVar != null) {
                    ikcVar.i();
                    ffcuVar = ffcu.a;
                } else {
                    ffcuVar = null;
                }
                if (ffcuVar == null) {
                    b(null);
                }
            }
        }
    }

    @Override // defpackage.ixl
    public final long a() {
        return this.a != null ? itf.a(isx.g(this)) : ixt.a;
    }

    public abstract void b(ikq ikqVar);

    @Override // defpackage.hvh
    public final /* synthetic */ void dL() {
        ixk.a(this);
    }

    @Override // defpackage.ixl
    public final void dU() {
        k();
    }

    @Override // defpackage.ixl
    public final void dV(iki ikiVar, ikk ikkVar, long j) {
        if (ikkVar == ikk.b) {
            List list = ikiVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (g(((iku) list.get(i)).i)) {
                    int i2 = ikiVar.e;
                    if (ikm.a(i2, 4)) {
                        this.b = true;
                        j();
                        return;
                    } else {
                        if (ikm.a(i2, 5)) {
                            k();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void dW() {
        ixk.b(this);
    }

    public final void f(ikq ikqVar) {
        if (ffkj.e(this.c, ikqVar)) {
            return;
        }
        this.c = ikqVar;
        if (this.b) {
            j();
        }
    }

    public abstract boolean g(int i);

    protected final izg h() {
        return (izg) isv.a(this, jdr.p);
    }

    @Override // defpackage.hvh
    public final void t() {
        k();
    }

    @Override // defpackage.ixl
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ixl
    public final /* synthetic */ void y() {
    }
}
