package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csb {
    public final dbe a;
    public final hho b;
    public final hho c;
    private final cvo e;
    public cyq d = csc.a;
    private final hho f = new hic(null, hla.a);

    public csb(cvo cvoVar, dbe dbeVar, das dasVar, cwc cwcVar) {
        this.e = cvoVar;
        this.a = dbeVar;
        this.b = new hic(dasVar, hla.a);
        this.c = new hic(cwcVar, hla.a);
    }

    public final das a() {
        return (das) this.b.a();
    }

    public final hkx b() {
        return (hkx) this.f.a();
    }

    public final iam c() {
        hkx b;
        if (!this.e.a() || (b = b()) == null) {
            return null;
        }
        return (iam) b.a();
    }

    public final void d(iam iamVar, iam iamVar2) {
        if (this.e.a()) {
            if (b() == null) {
                this.d = cwn.a;
            }
            e(a().b(new crz(this), new csa(this, iamVar2, iamVar)));
        }
    }

    public final void e(hkx hkxVar) {
        this.f.b(hkxVar);
    }

    public final boolean f() {
        return ((Boolean) this.a.f()).booleanValue();
    }
}
