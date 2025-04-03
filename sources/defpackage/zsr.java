package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsr {
    public static final long a(alxr alxrVar) {
        alxrVar.getClass();
        return alxrVar.n().toEpochMilli();
    }

    public static final dnor b(alxr alxrVar) {
        alxrVar.getClass();
        return r(alxrVar) ? dnor.c : dnor.a;
    }

    public static final Instant c(alxr alxrVar) {
        alxrVar.getClass();
        apxv A = alxrVar.A();
        if (A != null) {
            return ((btxp) ffdx.P(A.a)).m();
        }
        return null;
    }

    public static final String d(alxr alxrVar) {
        alxrVar.getClass();
        return alxrVar.b().a().toString();
    }

    public static final boolean e(alxr alxrVar) {
        if (!r(alxrVar)) {
            return false;
        }
        aqcm j = alxrVar.j();
        aqcl aqclVar = j instanceof aqcl ? (aqcl) j : null;
        return aqclVar != null && aqclVar.d;
    }

    public static final boolean f(alxr alxrVar) {
        if (!r(alxrVar)) {
            return false;
        }
        aqcm j = alxrVar.j();
        aqcl aqclVar = j instanceof aqcl ? (aqcl) j : null;
        return aqclVar != null && aqclVar.c;
    }

    public static final boolean g(alxr alxrVar) {
        if (!r(alxrVar)) {
            return false;
        }
        aqcm j = alxrVar.j();
        aqcl aqclVar = j instanceof aqcl ? (aqcl) j : null;
        return aqclVar != null && aqclVar.b;
    }

    public static final boolean h(alxr alxrVar) {
        alxrVar.getClass();
        if (!r(alxrVar)) {
            return false;
        }
        aqcm j = alxrVar.j();
        aqcl aqclVar = j instanceof aqcl ? (aqcl) j : null;
        return aqclVar != null && aqclVar.f;
    }

    public static final boolean i(alxr alxrVar) {
        alxrVar.getClass();
        aqcm j = alxrVar.j();
        aqcl aqclVar = j instanceof aqcl ? (aqcl) j : null;
        return aqclVar != null && aqclVar.g;
    }

    public static final boolean j(alxr alxrVar) {
        alxrVar.getClass();
        return e(alxrVar) || f(alxrVar) || g(alxrVar) || i(alxrVar);
    }

    public static final boolean k(alxr alxrVar) {
        alxrVar.getClass();
        aqcm j = alxrVar.j();
        return j != null && j.b() == 2;
    }

    public static final boolean l(alxr alxrVar) {
        aqrz I;
        alya d = alxrVar.d();
        alxp alxpVar = d instanceof alxp ? (alxp) d : null;
        if (alxpVar == null || (I = alxpVar.a().I()) == null) {
            return false;
        }
        return I.a();
    }

    public static final boolean m(alxr alxrVar) {
        aqrz I;
        alya d = alxrVar.d();
        Boolean bool = null;
        alxp alxpVar = d instanceof alxp ? (alxp) d : null;
        if (alxpVar != null && (I = alxpVar.a().I()) != null) {
            byzi D = I.a.D();
            if (D != null) {
                int ordinal = D.ordinal();
                if (ordinal == 1) {
                    bool = true;
                } else if (ordinal == 2) {
                    bool = false;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public static final boolean n(alxr alxrVar) {
        alya d = alxrVar.d();
        alxp alxpVar = d instanceof alxp ? (alxp) d : null;
        if (alxpVar != null) {
            return alxpVar.a().A();
        }
        return false;
    }

    public static final boolean o(alxr alxrVar) {
        alxrVar.getClass();
        if (!r(alxrVar) || (alxrVar instanceof alyv)) {
            return false;
        }
        alya d = alxrVar.d();
        d.getClass();
        return ((alyo) d).a() == alxo.DELIVERED;
    }

    public static final boolean p(alxr alxrVar) {
        alxrVar.getClass();
        return alxrVar.A() != null;
    }

    public static final boolean q(alxr alxrVar) {
        alxrVar.getClass();
        return alxrVar.d().d() == 1;
    }

    public static final boolean r(alxr alxrVar) {
        alxrVar.getClass();
        return alxrVar.d().d() == 2;
    }

    public static final boolean s(alxr alxrVar) {
        alxrVar.getClass();
        return alxrVar.a() == alxq.b;
    }

    public static final boolean t(alxr alxrVar) {
        return alxrVar.a() == alxq.b;
    }

    public static final boolean u(alxr alxrVar) {
        alxrVar.getClass();
        if (!r(alxrVar) || (alxrVar instanceof alyv)) {
            return false;
        }
        alya d = alxrVar.d();
        d.getClass();
        return ((alyo) d).a() == alxo.SENDING;
    }

    public static final boolean v(alxr alxrVar) {
        alxrVar.getClass();
        aqcm j = alxrVar.j();
        aqcl aqclVar = j instanceof aqcl ? (aqcl) j : null;
        return aqclVar != null && aqclVar.e;
    }

    public static final boolean w(alxr alxrVar) {
        alxrVar.getClass();
        if (!r(alxrVar) || (alxrVar instanceof alyv)) {
            return false;
        }
        alya d = alxrVar.d();
        d.getClass();
        return ((alyo) d).a() == alxo.SENT;
    }

    public static final boolean x(alxr alxrVar) {
        alxrVar.getClass();
        return alxrVar.a() == alxq.a;
    }

    public static final boolean y(alxr alxrVar) {
        aqpn H;
        alya d = alxrVar.d();
        alxp alxpVar = d instanceof alxp ? (alxp) d : null;
        if (alxpVar == null || (H = alxpVar.a().H()) == null) {
            return false;
        }
        return H.b();
    }

    public static final boolean z(alxr alxrVar) {
        aqpn H;
        alya d = alxrVar.d();
        alxp alxpVar = d instanceof alxp ? (alxp) d : null;
        if (alxpVar == null || (H = alxpVar.a().H()) == null) {
            return false;
        }
        return H.c();
    }
}
