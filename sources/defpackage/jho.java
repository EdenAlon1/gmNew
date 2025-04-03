package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jho {
    public static final boolean a(List list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = ffel.a;
        } else {
            ArrayList arrayList = new ArrayList();
            Object obj = list.get(0);
            int e = ffdx.e(list);
            int i = 0;
            while (i < e) {
                i++;
                Object obj2 = list.get(i);
                jjw jjwVar = (jjw) obj2;
                jjw jjwVar2 = (jjw) obj;
                arrayList.add(new iak((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (jjwVar2.b().a() >> 32)) - Float.intBitsToFloat((int) (jjwVar.b().a() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (jjwVar2.b().a() & 4294967295L)) - Float.intBitsToFloat((int) (jjwVar.b().a() & 4294967295L)))) & 4294967295L)));
                obj = obj2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            j = ((iak) ffdx.K(list2)).a;
        } else {
            if (list2.isEmpty()) {
                kau.c("Empty collection can't be reduced.");
            }
            Object K = ffdx.K(list2);
            int e2 = ffdx.e(list2);
            if (e2 > 0) {
                int i2 = 1;
                while (true) {
                    K = new iak(iak.f(((iak) K).a, ((iak) list2.get(i2)).a));
                    if (i2 == e2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((iak) K).a;
        }
        return Float.intBitsToFloat((int) (4294967295L & j)) < Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean b(jjw jjwVar) {
        jjn e = jjwVar.e();
        jku jkuVar = jkm.a;
        return (jjo.a(e, jkm.f) == null && jjo.a(jjwVar.e(), jkm.e) == null) ? false : true;
    }
}
