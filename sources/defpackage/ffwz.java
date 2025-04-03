package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffwz extends ffwi {
    private final int g;
    private final int h;

    public ffwz(int i, int i2) {
        super(i);
        this.g = i;
        this.h = i2;
        if (i2 != 1) {
            if (i <= 0) {
                throw new IllegalArgumentException(a.f(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            }
            return;
        }
        int i3 = fflc.a;
        throw new IllegalArgumentException("This implementation does not support suspension for senders, use " + new ffkb(ffwi.class).c() + " instead");
    }

    private final Object E(Object obj) {
        ffwt ffwtVar;
        long j;
        ffwz ffwzVar;
        fgho fghoVar = ffwk.d;
        ffwt ffwtVar2 = (ffwt) this.c.a;
        while (true) {
            long b = this.a.b();
            long j2 = 1152921504606846975L & b;
            boolean A = super.A(b);
            long j3 = ffwk.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (ffwtVar2.b != j4) {
                ffwtVar = super.u(j4, ffwtVar2);
                if (ffwtVar != null) {
                    ffwzVar = this;
                    j = j2;
                } else if (A) {
                    return new ffwq(q());
                }
            } else {
                ffwtVar = ffwtVar2;
                j = j2;
                ffwzVar = this;
            }
            Object obj2 = obj;
            int c = super.c(ffwtVar, i, obj2, j, fghoVar, A);
            ffwtVar2 = ffwtVar;
            if (c == 0) {
                ffwtVar2.p();
                return ffcu.a;
            }
            if (c == 1) {
                return ffcu.a;
            }
            if (c == 2) {
                if (A) {
                    ffwtVar2.t();
                    return new ffwq(q());
                }
                v((ffwtVar2.b * ffwk.b) + i);
                return ffcu.a;
            }
            if (c == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (c == 4) {
                if (j < g()) {
                    ffwtVar2.p();
                }
                return new ffwq(q());
            }
            ffwtVar2.p();
            obj = obj2;
        }
    }

    @Override // defpackage.ffwi
    protected final boolean B() {
        return this.h == 2;
    }

    @Override // defpackage.ffwi, defpackage.ffxi
    public final Object a(Object obj, ffgu ffguVar) {
        Object E = E(obj);
        if (!(E instanceof ffwq)) {
            return ffcu.a;
        }
        ffws.b(E);
        throw q();
    }

    @Override // defpackage.ffwi, defpackage.ffxi
    public final Object b(Object obj) {
        return E(obj);
    }
}
