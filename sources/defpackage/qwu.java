package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qwu implements qwv, rkn {
    private static final kst a = rkp.a(20, new qwt());
    private final rkr b = new rkq();
    private qwv c;
    private boolean d;
    private boolean e;

    static qwu d(qwv qwvVar) {
        qwu qwuVar = (qwu) a.a();
        rkf.f(qwuVar);
        qwuVar.e = false;
        qwuVar.d = true;
        qwuVar.c = qwvVar;
        return qwuVar;
    }

    @Override // defpackage.qwv
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.qwv
    public final Class b() {
        return this.c.b();
    }

    @Override // defpackage.qwv
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.qwv
    public final synchronized void e() {
        this.b.a();
        this.e = true;
        if (this.d) {
            return;
        }
        this.c.e();
        this.c = null;
        a.b(this);
    }

    @Override // defpackage.rkn
    public final rkr eW() {
        return this.b;
    }

    final synchronized void f() {
        this.b.a();
        if (!this.d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.d = false;
        if (this.e) {
            e();
        }
    }
}
