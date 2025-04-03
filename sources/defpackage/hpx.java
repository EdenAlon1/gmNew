package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpx {
    public static final int a(int i, int i2) {
        return i << ((i2 * 3) + 1);
    }

    public static final int b(int i) {
        return a(2, i);
    }

    public static final int c(int i) {
        return a(1, i);
    }

    public static final hpn d(int i, Object obj, hfd hfdVar) {
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = new hpw(i, true, obj);
            hfdVar.y(f);
        }
        hpw hpwVar = (hpw) f;
        if (!ffkj.e(hpwVar.b, obj)) {
            Object obj2 = hpwVar.b;
            hpwVar.b = obj;
            if (obj2 != null && hpwVar.a) {
                hio hioVar = hpwVar.d;
                if (hioVar != null) {
                    hioVar.a();
                    hpwVar.d = null;
                }
                List list = hpwVar.c;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((hio) list.get(i2)).a();
                    }
                    list.clear();
                }
            }
        }
        return hpwVar;
    }

    public static final boolean e(hio hioVar, hio hioVar2) {
        return hioVar == null || !hioVar.l() || ffkj.e(hioVar, hioVar2) || ffkj.e(hioVar.c, hioVar2.c);
    }
}
