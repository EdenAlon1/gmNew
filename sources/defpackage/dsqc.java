package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dsqc {
    public static List a(dsqq dsqqVar, irg irgVar, dspo dspoVar, long j, dsqr dsqrVar) {
        dsqrVar.getClass();
        if (!dsqqVar.g()) {
            j = jzk.m(j, 0, 0, 0, 0, 10);
        }
        long j2 = j;
        List a = irgVar.a(dsqqVar.d(), new hpw(-2123080928, true, new dsqp(dsqqVar, dspoVar, j2, dsqrVar)));
        ArrayList arrayList = new ArrayList(ffdx.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(((ipl) it.next()).e(j2));
        }
        if (dsqqVar.h()) {
            int b = jzk.b(j2);
            int a2 = jzk.a(j2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                iqk iqkVar = (iqk) arrayList.get(i3);
                i = ffmk.f(iqkVar.a, i);
                i2 = ffmk.f(iqkVar.b, i2);
                b = ffmk.g(dsqqVar.a(j2, iqkVar), b);
                a2 = ffmk.g(dsqqVar.b(j2, iqkVar), a2);
            }
            hho c = dsqqVar.c();
            dspn dspnVar = null;
            if (i > 0 && i2 > 0) {
                dspnVar = new dspn((i << 32) | (i2 & 4294967295L), (b << 32) | (a2 & 4294967295L));
            }
            c.b(dspnVar);
        }
        return arrayList;
    }

    public static void b(dsqq dsqqVar, iqj iqjVar, long j, iqk iqkVar) {
        iqkVar.getClass();
        iqj.m(iqjVar, iqkVar, dsqqVar.a(j, iqkVar), dsqqVar.b(j, iqkVar));
    }
}
