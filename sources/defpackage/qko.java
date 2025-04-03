package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qko {
    static final qli a = qli.a("k");

    static List a(qlk qlkVar, qci qciVar, float f, qlf qlfVar, boolean z) {
        qlk qlkVar2;
        qci qciVar2;
        float f2;
        qlf qlfVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (qlkVar.q() == 6) {
            qciVar.e("Lottie doesn't support expressions.");
            return arrayList;
        }
        qlkVar.i();
        while (qlkVar.o()) {
            if (qlkVar.c(a) != 0) {
                qlkVar.n();
            } else if (qlkVar.q() == 1) {
                qlkVar.h();
                if (qlkVar.q() != 7) {
                    while (qlkVar.o()) {
                        qlk qlkVar3 = qlkVar;
                        qci qciVar3 = qciVar;
                        float f3 = f;
                        qlf qlfVar3 = qlfVar;
                        boolean z3 = z;
                        arrayList.add(qkn.a(qlkVar3, qciVar3, f3, qlfVar3, true, z3));
                        qlkVar = qlkVar3;
                        qciVar = qciVar3;
                        f = f3;
                        qlfVar = qlfVar3;
                        z = z3;
                    }
                    qlkVar2 = qlkVar;
                    qciVar2 = qciVar;
                    f2 = f;
                    qlfVar2 = qlfVar;
                    z2 = z;
                } else {
                    qlkVar2 = qlkVar;
                    qciVar2 = qciVar;
                    f2 = f;
                    qlfVar2 = qlfVar;
                    z2 = z;
                    arrayList.add(qkn.a(qlkVar2, qciVar2, f2, qlfVar2, false, z2));
                }
                qlkVar2.j();
                qlkVar = qlkVar2;
                qciVar = qciVar2;
                f = f2;
                qlfVar = qlfVar2;
                z = z2;
            } else {
                qlk qlkVar4 = qlkVar;
                arrayList.add(qkn.a(qlkVar4, qciVar, f, qlfVar, false, z));
                qlkVar = qlkVar4;
            }
        }
        qlkVar.k();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            qlx qlxVar = (qlx) list.get(i2);
            i2++;
            qlx qlxVar2 = (qlx) list.get(i2);
            qlxVar.h = Float.valueOf(qlxVar2.g);
            if (qlxVar.c == null && (obj = qlxVar2.b) != null) {
                qlxVar.c = obj;
                if (qlxVar instanceof qfa) {
                    ((qfa) qlxVar).a();
                }
            }
        }
        qlx qlxVar3 = (qlx) list.get(i);
        if ((qlxVar3.b == null || qlxVar3.c == null) && list.size() > 1) {
            list.remove(qlxVar3);
        }
    }
}
