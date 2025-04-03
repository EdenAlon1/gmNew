package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fggk extends ffsz implements ffhs, ffgu {
    public final ffsd a;
    public final ffgu b;
    public Object c;
    public final Object d;
    public final ffqn f;

    public fggk(ffsd ffsdVar, ffgu ffguVar) {
        super(-1);
        this.a = ffsdVar;
        this.b = ffguVar;
        this.c = fggl.a;
        this.d = fghv.a(u());
        this.f = new ffqn(null, ffqo.a);
    }

    public final void a(ffhd ffhdVar, Object obj) {
        this.c = obj;
        this.e = 1;
        this.a.h(ffhdVar, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ffgu, ffhs] */
    @Override // defpackage.ffhs
    public final ffhs dI() {
        return this.b;
    }

    @Override // defpackage.ffsz
    public final Object p() {
        Object obj = this.c;
        boolean z = ffso.a;
        this.c = fggl.a;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.a + ", " + ffsp.c(this.b) + "]";
    }

    @Override // defpackage.ffgu
    public final ffhd u() {
        return this.b.u();
    }

    @Override // defpackage.ffgu
    public final void w(Object obj) {
        Object b = ffrv.b(obj);
        if (this.a.ex(u())) {
            this.c = b;
            this.e = 0;
            this.a.a(u(), this);
            return;
        }
        boolean z = ffso.a;
        ThreadLocal threadLocal = ffvi.a;
        ffti a = ffvi.a();
        if (a.q()) {
            this.c = b;
            this.e = 0;
            a.o(this);
            return;
        }
        a.p(true);
        try {
            ffhd u = u();
            Object b2 = fghv.b(u, this.d);
            try {
                this.b.w(obj);
                while (a.s()) {
                }
            } finally {
                fghv.c(u, b2);
            }
        } catch (Throwable th) {
            try {
                K(th);
            } finally {
                a.n(true);
            }
        }
    }

    @Override // defpackage.ffhs
    public final void dJ() {
    }

    @Override // defpackage.ffsz
    public final ffgu t() {
        return this;
    }
}
