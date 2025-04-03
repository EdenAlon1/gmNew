package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aorg {
    public static final boolean a(alxr alxrVar) {
        alxo a;
        int ordinal;
        alya d = alxrVar.d();
        if ((d instanceof alyn) && ((a = ((alyn) d).a()) == null || (ordinal = a.ordinal()) == 0 || ordinal == 4 || ordinal == 5)) {
            return false;
        }
        appj g = alxrVar.g();
        if (g instanceof appo) {
            appo appoVar = (appo) g;
            if (appoVar.a().isEmpty()) {
                return false;
            }
            engw a2 = appoVar.a();
            if (a2.isEmpty()) {
                return true;
            }
            enqv it = a2.iterator();
            while (it.hasNext()) {
                if (!b((apmq) it.next())) {
                    return false;
                }
            }
            return true;
        }
        if (!(g instanceof appz)) {
            if (g instanceof appw) {
                String c = ((appw) g).c();
                return (c == null || c.length() == 0) ? false : true;
            }
            if (g instanceof apmq) {
                return b((apmq) g);
            }
            return false;
        }
        appz appzVar = (appz) g;
        String d2 = appzVar.d();
        if (d2 != null && d2.length() != 0) {
            return true;
        }
        String c2 = appzVar.c();
        return (c2 == null || c2.length() == 0) ? false : true;
    }

    private static final boolean b(apmq apmqVar) {
        apmqVar.e();
        apra fk = apmqVar.fk();
        return fk == null || !fk.f();
    }
}
