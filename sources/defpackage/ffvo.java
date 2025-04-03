package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvo extends fghk {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    public ffvo(ffhd ffhdVar, ffgu ffguVar) {
        super(ffhdVar.get(ffvp.a) == null ? ffhdVar.plus(ffvp.a) : ffhdVar, ffguVar);
        this.b = new ThreadLocal();
        if (ffguVar.u().get(ffgw.k) instanceof ffsd) {
            return;
        }
        Object b = fghv.b(ffhdVar, null);
        fghv.c(ffhdVar, b);
        d(ffhdVar, b);
    }

    public final void d(ffhd ffhdVar, Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new ffcf(ffhdVar, obj));
    }

    public final boolean f() {
        boolean z = this.threadLocalIsSet && this.b.get() == null;
        this.b.remove();
        return !z;
    }

    @Override // defpackage.fghk, defpackage.ffqq
    protected final void hV(Object obj) {
        if (this.threadLocalIsSet) {
            ffcf ffcfVar = (ffcf) this.b.get();
            if (ffcfVar != null) {
                fghv.c((ffhd) ffcfVar.a, ffcfVar.b);
            }
            this.b.remove();
        }
        Object a = ffrv.a(obj, this.e);
        ffgu ffguVar = this.e;
        ffhd u = ffguVar.u();
        Object b = fghv.b(u, null);
        ffvo c = b != fghv.a ? ffsa.c(ffguVar, u, b) : null;
        try {
            this.e.w(a);
            if (c == null || c.f()) {
                fghv.c(u, b);
            }
        } catch (Throwable th) {
            if (c == null || c.f()) {
                fghv.c(u, b);
            }
            throw th;
        }
    }
}
