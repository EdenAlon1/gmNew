package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffuj extends fghc implements ffte, fftx {
    public ffuq d;

    public abstract void a(Throwable th);

    public abstract boolean b();

    public final ffuq e() {
        ffuq ffuqVar = this.d;
        if (ffuqVar != null) {
            return ffuqVar;
        }
        ffkj.c("job");
        return null;
    }

    @Override // defpackage.fftx
    public final ffuv hN() {
        return null;
    }

    @Override // defpackage.ffte
    public final void hO() {
        Object E;
        Object f;
        fghc fghcVar;
        fghi fghiVar;
        ffuq e = e();
        do {
            E = e.E();
            if (!(E instanceof ffuj)) {
                if (!(E instanceof fftx) || ((fftx) E).hN() == null) {
                    return;
                }
                do {
                    f = f();
                    if (f instanceof fghi) {
                        fghc fghcVar2 = ((fghi) f).a;
                        return;
                    }
                    if (f == this) {
                        return;
                    }
                    f.getClass();
                    fghcVar = (fghc) f;
                    fghiVar = (fghi) fghcVar.g.a;
                    if (fghiVar == null) {
                        fghiVar = new fghi(fghcVar);
                        fghcVar.g.b(fghiVar);
                    }
                } while (!this.e.d(f, fghiVar));
                fghcVar.g();
                return;
            }
            if (E != this) {
                return;
            }
        } while (!e.d.d(E, ffur.g));
    }

    @Override // defpackage.fftx
    public final boolean hP() {
        return true;
    }

    @Override // defpackage.fghc
    public final String toString() {
        return ffsp.a(this) + "@" + ffsp.b(this) + "[job@" + ffsp.b(e()) + "]";
    }
}
