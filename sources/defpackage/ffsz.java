package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffsz extends fgii {
    public int e;

    public ffsz(int i) {
        super(0L, false);
        this.e = i;
    }

    public final void K(Throwable th) {
        ffsf.b(t().u(), new ffsn(a.i(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    public abstract Object p();

    /* JADX WARN: Type inference failed for: r1v0, types: [ffgu, ffhs] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = ffso.a;
        try {
            fggk fggkVar = (fggk) t();
            ?? r1 = fggkVar.b;
            Object obj = fggkVar.d;
            ffhd u = r1.u();
            Object b = fghv.b(u, obj);
            ffud ffudVar = null;
            ffvo c = b != fghv.a ? ffsa.c(r1, u, b) : null;
            try {
                ffhd u2 = r1.u();
                Object p = p();
                Throwable s = s(p);
                if (s == null && ffta.b(this.e)) {
                    ffudVar = (ffud) u2.get(ffud.c);
                }
                if (ffudVar != null && !ffudVar.v()) {
                    Throwable p2 = ffudVar.p();
                    H(p2);
                    if (ffso.b) {
                        p2 = fghn.a(p2, r1);
                    }
                    r1.w(ffci.a(p2));
                } else if (s != null) {
                    r1.w(ffci.a(s));
                } else {
                    r1.w(o(p));
                }
                if (c != null && !c.f()) {
                    return;
                }
                fghv.c(u, b);
            } catch (Throwable th) {
                if (c == null || c.f()) {
                    fghv.c(u, b);
                }
                throw th;
            }
        } catch (Throwable th2) {
            K(th2);
        }
    }

    public Throwable s(Object obj) {
        ffrt ffrtVar = obj instanceof ffrt ? (ffrt) obj : null;
        if (ffrtVar != null) {
            return ffrtVar.b;
        }
        return null;
    }

    public abstract ffgu t();

    public void H(Throwable th) {
    }

    public Object o(Object obj) {
        return obj;
    }
}
