package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxr {
    public static final float a(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : kav.b(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static final cmp b(float f, List list, boolean z) {
        int i = cmq.a;
        cnt cntVar = new cnt(1);
        cntVar.b(0.0f);
        if (f != 0.0f && !list.isEmpty()) {
            ffmj q = ffmk.q(1, list.size());
            ArrayList arrayList = new ArrayList(ffdx.n(q, 10));
            ffev it = q.iterator();
            while (((ffmi) it).a) {
                int a = it.a();
                int i2 = a - 1;
                gxe gxeVar = (gxe) list.get(i2);
                gxe gxeVar2 = (gxe) list.get(a);
                cntVar.b(a == ffdx.e(list) ? 1.0f : cntVar.a(i2) + ((z ? ((gxd) ffdx.K(gxeVar2)).c - ((gxd) ffdx.K(gxeVar)).c : ((gxd) ffdx.P(gxeVar)).c - ((gxd) ffdx.P(gxeVar2)).c) / f));
                arrayList.add(true);
            }
        }
        return cntVar;
    }

    public static final gxe c(gxe gxeVar, float f, float f2, float f3, gxd gxdVar, int i) {
        ArrayList arrayList = new ArrayList(gxeVar.a());
        int a = gxeVar.a();
        for (int i2 = 0; i2 < a; i2++) {
            gxd gxdVar2 = gxeVar.get(i2);
            if (!gxdVar2.e) {
                arrayList.add(gxdVar2);
            }
        }
        float size = f3 / arrayList.size();
        gxe b = gxf.b(f, f2, i, (gxdVar.b - (size / 2.0f)) + f3, new gxp(gxeVar, size));
        ArrayList arrayList2 = new ArrayList(b.a());
        int a2 = b.a();
        for (int i3 = 0; i3 < a2; i3++) {
            gxd gxdVar3 = b.get(i3);
            arrayList2.add(new gxd(gxdVar3.a, gxdVar3.b, gxeVar.get(i3).c, gxdVar3.d, gxdVar3.e, gxdVar3.f, gxdVar3.g));
        }
        return new gxe(arrayList2);
    }

    public static final gxe d(gxe gxeVar, int i, int i2, float f, float f2) {
        float f3 = gxeVar.get(i).a - gxeVar.get(i).g;
        int i3 = i > i2 ? 1 : -1;
        int i4 = gxeVar.b;
        return gxf.b(f, f2, i4 + i3, gxeVar.get(i4).b + ((f3 + f2) * i3), new gxq(gxeVar, i, i2));
    }
}
