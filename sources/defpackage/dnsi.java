package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsi {
    public static final float a(dnsh dnshVar, boolean z) {
        dnry dnryVar = dnshVar.g;
        float f = (dnryVar == dnry.b || dnryVar == dnry.c) ? 1.0f : 8.0f;
        if (z) {
            return 0.0f;
        }
        return f;
    }

    public static final float b(dnsh dnshVar) {
        return true != dnshVar.x ? 8.0f : 4.0f;
    }

    public static final float c(dnsh dnshVar) {
        dnto dntoVar = dnshVar.k;
        if ((dntoVar != null ? ((dnsl) dntoVar).c : null) != null) {
            return 0.0f;
        }
        dnry dnryVar = dnshVar.g;
        return (dnryVar == dnry.c || dnryVar == dnry.d) ? 1.0f : 8.0f;
    }

    public static final hun d(dnsh dnshVar) {
        int ordinal = dnshVar.f.ordinal();
        if (ordinal == 0) {
            int i = huo.a;
            return hum.j;
        }
        if (ordinal == 1) {
            int i2 = huo.a;
            return hum.k;
        }
        if (ordinal != 2) {
            throw new ffcd();
        }
        int i3 = huo.a;
        return hum.l;
    }

    public static final huo e(dnsh dnshVar) {
        int ordinal = dnshVar.f.ordinal();
        if (ordinal == 0) {
            int i = huo.a;
            return hum.d;
        }
        if (ordinal == 1) {
            int i2 = huo.a;
            return hum.e;
        }
        if (ordinal != 2) {
            throw new ffcd();
        }
        int i3 = huo.a;
        return hum.f;
    }

    public static final boolean f(dnsh dnshVar) {
        return dnshVar.x && dnshVar.f == dnor.a;
    }

    public static /* synthetic */ eql g(dnsh dnshVar) {
        if (dnshVar.B.d) {
            return eqm.b(20.0f);
        }
        if (dnshVar.f == dnor.c) {
            int ordinal = dnshVar.g.ordinal();
            if (ordinal == 0) {
                return eqm.b(20.0f);
            }
            if (ordinal == 1) {
                return eqm.c(20.0f, 20.0f, 4.0f, 20.0f);
            }
            if (ordinal == 2) {
                return eqm.c(20.0f, 4.0f, 4.0f, 20.0f);
            }
            if (ordinal == 3) {
                return eqm.c(20.0f, 4.0f, 20.0f, 20.0f);
            }
            throw new ffcd();
        }
        int ordinal2 = dnshVar.g.ordinal();
        if (ordinal2 == 0) {
            return eqm.b(20.0f);
        }
        if (ordinal2 == 1) {
            return eqm.c(20.0f, 20.0f, 20.0f, 4.0f);
        }
        if (ordinal2 == 2) {
            return eqm.c(4.0f, 20.0f, 20.0f, 4.0f);
        }
        if (ordinal2 == 3) {
            return eqm.c(4.0f, 20.0f, 20.0f, 20.0f);
        }
        throw new ffcd();
    }
}
