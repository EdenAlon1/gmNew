package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qju {
    private static final qli a = qli.a("k", "x", "y");

    public static qhz a(qlk qlkVar, qci qciVar) {
        ArrayList arrayList = new ArrayList();
        if (qlkVar.q() == 1) {
            qlkVar.h();
            while (qlkVar.o()) {
                qlk qlkVar2 = qlkVar;
                qci qciVar2 = qciVar;
                arrayList.add(new qfa(qciVar2, qkn.a(qlkVar2, qciVar2, qlw.a(), qks.a, qlkVar.q() == 3, false)));
                qlkVar = qlkVar2;
                qciVar = qciVar2;
            }
            qlkVar.j();
            qko.b(arrayList);
        } else {
            arrayList.add(new qlx(qkm.c(qlkVar, qlw.a())));
        }
        return new qhz(arrayList);
    }

    static qih b(qlk qlkVar, qci qciVar) {
        qlkVar.i();
        boolean z = false;
        qhz qhzVar = null;
        qhw qhwVar = null;
        qhw qhwVar2 = null;
        while (qlkVar.q() != 4) {
            int c = qlkVar.c(a);
            if (c == 0) {
                qhzVar = a(qlkVar, qciVar);
            } else if (c != 1) {
                if (c != 2) {
                    qlkVar.m();
                    qlkVar.n();
                } else if (qlkVar.q() == 6) {
                    qlkVar.n();
                    z = true;
                } else {
                    qhwVar2 = qjx.b(qlkVar, qciVar);
                }
            } else if (qlkVar.q() == 6) {
                qlkVar.n();
                z = true;
            } else {
                qhwVar = qjx.b(qlkVar, qciVar);
            }
        }
        qlkVar.k();
        if (z) {
            qciVar.e("Lottie doesn't support expressions.");
        }
        return qhzVar != null ? qhzVar : new qid(qhwVar, qhwVar2);
    }
}
