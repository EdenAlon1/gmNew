package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxb extends hvh implements ixv, isw, its {
    public final ffji a;
    public hxb b;
    public long c;
    public hxb d;
    private final Object e;

    public hxb() {
        this(null);
    }

    public final void a(hww hwwVar) {
        hxb hxbVar = this.b;
        if (hxbVar != null) {
            hxbVar.a(hwwVar);
        }
        this.b = null;
    }

    public final void b(hww hwwVar) {
        ixv ixvVar;
        hxb hxbVar;
        hxb hxbVar2 = this.b;
        hxb hxbVar3 = null;
        if (hxbVar2 == null || !hxc.b(hxbVar2, hxd.a(hwwVar))) {
            if (this.p.z) {
                fflb fflbVar = new fflb();
                ixw.d(this, new hxa(fflbVar, this, hwwVar));
                ixvVar = (ixv) fflbVar.a;
            } else {
                ixvVar = null;
            }
            hxbVar = (hxb) ixvVar;
        } else {
            hxbVar = hxbVar2;
        }
        if (hxbVar != null && hxbVar2 == null) {
            hxc.c(hxbVar, hwwVar);
        } else if (hxbVar == null && hxbVar2 != null) {
            hxbVar2.a(hwwVar);
        } else if (!ffkj.e(hxbVar, hxbVar2)) {
            if (hxbVar != null) {
                hxc.c(hxbVar, hwwVar);
                hxbVar3 = hxbVar;
            }
            if (hxbVar2 != null) {
                hxbVar2.a(hwwVar);
            }
            hxbVar = hxbVar3;
        } else if (hxbVar != null) {
            hxbVar.b(hwwVar);
        }
        this.b = hxbVar;
    }

    @Override // defpackage.ixv
    public final Object e() {
        return this.e;
    }

    @Override // defpackage.its
    public final void i(long j) {
        this.c = j;
    }

    @Override // defpackage.hvh
    public final void t() {
        this.d = null;
        this.b = null;
    }

    public /* synthetic */ hxb(byte[] bArr) {
        this.a = null;
        this.e = hwx.a;
        this.c = 0L;
    }

    @Override // defpackage.its
    public final /* synthetic */ void dY(ioc iocVar) {
    }
}
