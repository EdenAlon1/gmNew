package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeww {
    private static volatile eewp b;
    public static final eexh a = new eexh("debug.poke");
    private static final List c = new ArrayList();

    private eeww() {
    }

    public static eewl a(eewm eewmVar, String str) {
        if (eewmVar instanceof eewo) {
            return ((eewo) eewmVar).a(str);
        }
        List<eewl> d = eewmVar.d();
        if (d == null) {
            return null;
        }
        for (eewl eewlVar : d) {
            if (eewlVar.b().equals(str)) {
                return eewlVar;
            }
        }
        return null;
    }

    public static eewm b(eewm eewmVar, String str) {
        if (eewmVar instanceof eewo) {
            return ((eewo) eewmVar).b(str);
        }
        List<eewm> e = eewmVar.e();
        if (e == null) {
            return null;
        }
        for (eewm eewmVar2 : e) {
            if (eewmVar2.c().equals(str)) {
                return eewmVar2;
            }
        }
        return null;
    }

    public static eewp c() {
        eewp eewpVar;
        eewp eewpVar2 = b;
        if (eewpVar2 != null) {
            return eewpVar2;
        }
        synchronized (eeww.class) {
            eewpVar = b;
            if (eewpVar == null) {
                if (eewu.b) {
                    eewpVar = new eewn("[poke]");
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        ((eewt) it.next()).a(eewpVar);
                    }
                    c.clear();
                } else {
                    eewpVar = new eews();
                }
                b = eewpVar;
            }
        }
        return eewpVar;
    }

    public static eewv d() {
        if (!eewu.b || eewu.a == null) {
            return null;
        }
        try {
            return (eewv) eewu.a.newInstance();
        } catch (ClassCastException | IllegalAccessException | InstantiationException unused) {
            return null;
        }
    }

    public static void e(eewt eewtVar) {
        if (eewu.b) {
            synchronized (eeww.class) {
                if (b != null) {
                    eewtVar.a(b);
                } else {
                    c.add(eewtVar);
                }
            }
        }
    }
}
