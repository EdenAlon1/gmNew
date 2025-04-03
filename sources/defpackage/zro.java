package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zro {
    public static final boolean a(alxr alxrVar) {
        if (alxrVar.y()) {
            return true;
        }
        apyd i = alxrVar.i();
        return i != null && i.d().size() > 0;
    }

    public static final boolean b(alxr alxrVar) {
        alya d = alxrVar.d();
        alxp alxpVar = d instanceof alxp ? (alxp) d : null;
        if (alxpVar == null) {
            return false;
        }
        return alxpVar.a().g().A();
    }

    public static final boolean c(alxr alxrVar, alxr alxrVar2) {
        alya d = alxrVar.d();
        boolean z = d instanceof alxp;
        alya d2 = alxrVar2.d();
        if (z && (d2 instanceof alxp) && ((alxp) d).a().equals(((alxp) d2).a())) {
            return true;
        }
        return (d instanceof alyn) && (d2 instanceof alyn) && ((alyn) d).c().equals(((alyn) d2).c());
    }
}
