package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgp implements hkx {
    public final hkx a;
    private final ffrp b = new ffrq();
    private final hho c = new hic(null, hla.a);
    private final hho d = new hic(null, hla.a);
    private final hkx e;

    public qgp() {
        ffix ffixVar = new ffix() { // from class: qgl
            @Override // defpackage.ffix
            public final Object invoke() {
                qgp qgpVar = qgp.this;
                boolean z = false;
                if (qgpVar.a() == null && qgpVar.c() == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        hqg hqgVar = hkg.a;
        new hgk(ffixVar, null);
        this.e = new hgk(new ffix() { // from class: qgm
            @Override // defpackage.ffix
            public final Object invoke() {
                qgp qgpVar = qgp.this;
                boolean z = true;
                if (qgpVar.a() == null && qgpVar.c() == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, null);
        new hgk(new ffix() { // from class: qgn
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(qgp.this.c() != null);
            }
        }, null);
        this.a = new hgk(new ffix() { // from class: qgo
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(qgp.this.a() != null);
            }
        }, null);
    }

    @Override // defpackage.hkx
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qci a() {
        return (qci) this.c.a();
    }

    public final Throwable c() {
        return (Throwable) this.d.a();
    }

    public final synchronized void d(qci qciVar) {
        qciVar.getClass();
        if (f()) {
            return;
        }
        this.c.b(qciVar);
        ((ffuq) this.b).S(qciVar);
    }

    public final synchronized void e(Throwable th) {
        if (f()) {
            return;
        }
        this.d.b(th);
        this.b.a(th);
    }

    public final boolean f() {
        return ((Boolean) this.e.a()).booleanValue();
    }
}
