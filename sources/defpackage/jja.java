package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jja {
    public static final ffjm a(jjw jjwVar) {
        jku jkuVar = jjl.a;
        return (ffjm) jjo.a(jjwVar.c, jjl.e);
    }

    public static final void b(jjw jjwVar, int i, ffji ffjiVar) {
        jjw jjwVar2;
        hne hneVar = new hne(new jjw[16]);
        List c = c(jjwVar);
        int i2 = hneVar.b;
        while (true) {
            hneVar.p(i2, c);
            while (true) {
                int i3 = hneVar.b;
                if (i3 == 0) {
                    return;
                }
                jjwVar2 = (jjw) hneVar.c(i3 - 1);
                if (!jfu.f(jjwVar2)) {
                    jjn jjnVar = jjwVar2.c;
                    jku jkuVar = jkm.a;
                    if (jjnVar.f(jkm.i)) {
                        continue;
                    } else {
                        iwi d = jjwVar2.d();
                        if (d == null) {
                            imn.a("Expected semantics node to have a coordinator.");
                            throw new ffbx();
                        }
                        kac b = kad.b(iod.e(d));
                        if (b.b < b.d && b.c < b.e) {
                            ffjm a = a(jjwVar2);
                            jjk jjkVar = (jjk) jjo.a(jjwVar2.c, jkm.t);
                            if (a != null && jjkVar != null && ((Number) jjkVar.b.invoke()).floatValue() > 0.0f) {
                                int i4 = i + 1;
                                ffjiVar.invoke(new jiz(jjwVar2, i4, b, d));
                                b(jjwVar2, i4, ffjiVar);
                            }
                        }
                    }
                }
            }
            c = c(jjwVar2);
            i2 = hneVar.b;
        }
    }

    private static final List c(jjw jjwVar) {
        return jjwVar.k(false, false);
    }
}
