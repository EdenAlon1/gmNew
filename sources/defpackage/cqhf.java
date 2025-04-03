package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqhf {
    public static final cqjb a(cqfu cqfuVar, cqfd cqfdVar, Instant instant, UUID uuid) {
        Instant instant2;
        cqgj cqgjVar = cqfuVar.c;
        if (cqgjVar == null) {
            cqgjVar = cqgj.a;
        }
        cqgjVar.getClass();
        if (cqjd.a(cqgjVar) == 3) {
            cqgj cqgjVar2 = cqfuVar.c;
            if (cqgjVar2 == null) {
                cqgjVar2 = cqgj.a;
            }
            cqgjVar2.getClass();
            Collection<cqgj> a = cqjg.a(cqgjVar2);
            ArrayList arrayList = new ArrayList(ffdx.n(a, 10));
            for (cqgj cqgjVar3 : a) {
                arrayList.add(Uri.parse((cqgjVar3.c == 5 ? (cqgd) cqgjVar3.d : cqgd.a).c));
            }
            Set ar = ffdx.ar(arrayList);
            int b = b(cqfdVar);
            cqgj cqgjVar4 = cqfuVar.c;
            if (cqgjVar4 == null) {
                cqgjVar4 = cqgj.a;
            }
            eyee eyeeVar = cqgjVar4.e;
            eyeeVar.getClass();
            return new cqja(ar, b, cqjf.b(eyeeVar), uuid);
        }
        cqgj cqgjVar5 = cqfuVar.c;
        if (cqgjVar5 == null) {
            cqgjVar5 = cqgj.a;
        }
        cqgjVar5.getClass();
        int a2 = cqjd.a(cqgjVar5) - 1;
        if (a2 == 0) {
            instant2 = Instant.EPOCH;
            instant2.getClass();
        } else {
            if (a2 != 1) {
                cqgj cqgjVar6 = cqfuVar.c;
                if (cqgjVar6 == null) {
                    cqgjVar6 = cqgj.a;
                }
                cqgjVar6.getClass();
                throw new IllegalStateException("Unexpected SyncType [" + ((Object) cqjc.a(cqjd.a(cqgjVar6))) + "]");
            }
            cqgj cqgjVar7 = cqfuVar.c;
            if (cqgjVar7 == null) {
                cqgjVar7 = cqgj.a;
            }
            eyja eyjaVar = (cqgjVar7.c == 4 ? (cqgb) cqgjVar7.d : cqgb.a).c;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            instant2 = eykj.d(eyjaVar);
            instant2.getClass();
        }
        Instant instant3 = instant2;
        if ((cqfuVar.b & 4) != 0) {
            eyja eyjaVar2 = cqfuVar.e;
            if (eyjaVar2 == null) {
                eyjaVar2 = eyja.a;
            }
            instant = eykj.d(eyjaVar2).plusMillis(1L);
            instant.getClass();
        } else {
            cqgj cqgjVar8 = cqfuVar.c;
            if (cqgjVar8 == null) {
                cqgjVar8 = cqgj.a;
            }
            cqgjVar8.getClass();
            int a3 = cqjd.a(cqgjVar8) - 1;
            if (a3 != 0 && a3 != 1) {
                cqgj cqgjVar9 = cqfuVar.c;
                if (cqgjVar9 == null) {
                    cqgjVar9 = cqgj.a;
                }
                cqgjVar9.getClass();
                throw new IllegalStateException("Unexpected SyncType [" + ((Object) cqjc.a(cqjd.a(cqgjVar9))) + "]");
            }
        }
        Instant instant4 = instant;
        int b2 = b(cqfdVar);
        cqgj cqgjVar10 = cqfuVar.c;
        if (cqgjVar10 == null) {
            cqgjVar10 = cqgj.a;
        }
        eyee eyeeVar2 = cqgjVar10.e;
        eyeeVar2.getClass();
        return new cqiz(instant4, instant3, b2, cqjf.b(eyeeVar2), uuid);
    }

    private static final int b(cqfd cqfdVar) {
        int i;
        Long l = (Long) cpze.c.e();
        Object e = cpze.g.e();
        e.getClass();
        int f = ffmk.f(((Number) e).intValue(), 1);
        Object e2 = cpze.f.e();
        e2.getClass();
        int f2 = ffmk.f(((Number) e2).intValue(), f + 1);
        if (cqfdVar != null) {
            i = (int) (cqfdVar.e * (l.longValue() / cqfdVar.f.toMillis()));
        } else {
            i = f;
        }
        return ffmk.i(i, f, f2);
    }
}
