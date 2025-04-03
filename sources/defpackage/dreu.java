package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dreu {
    public static final drek a(drer drerVar) {
        if (drerVar.c == 200) {
            return drej.a;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final drer b(dren drenVar) {
        dreo dreoVar = (dreo) drer.a.createBuilder();
        dreoVar.getClass();
        String e = drenVar.e();
        dreoVar.copyOnWrite();
        drer drerVar = (drer) dreoVar.instance;
        drerVar.b |= 1;
        drerVar.e = e;
        String d = drenVar.d();
        dreoVar.copyOnWrite();
        drer drerVar2 = (drer) dreoVar.instance;
        drerVar2.b |= 2;
        drerVar2.f = d;
        String f = drenVar.f();
        dreoVar.copyOnWrite();
        drer drerVar3 = (drer) dreoVar.instance;
        drerVar3.b |= 4;
        drerVar3.g = f;
        Iterable c = drenVar.c();
        ArrayList arrayList = new ArrayList(ffdx.n(c, 10));
        Iterator it = c.iterator();
        while (it.hasNext()) {
            arrayList.add(drqw.a((drlh) it.next()));
        }
        drqs e2 = drqt.e(arrayList);
        dreoVar.copyOnWrite();
        drer drerVar4 = (drer) dreoVar.instance;
        drerVar4.h = e2;
        drerVar4.b |= 8;
        if (drenVar.a() instanceof drej) {
            drep drepVar = (drep) dreq.a.createBuilder();
            drepVar.getClass();
            eyfy build = drepVar.build();
            build.getClass();
            dreoVar.copyOnWrite();
            drer drerVar5 = (drer) dreoVar.instance;
            drerVar5.d = (dreq) build;
            drerVar5.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        eyfy build2 = dreoVar.build();
        build2.getClass();
        return (drer) build2;
    }

    public static final void c(final dres dresVar, drer drerVar) {
        String str = drerVar.e;
        str.getClass();
        dresVar.d(str);
        String str2 = drerVar.f;
        str2.getClass();
        dresVar.c(str2);
        String str3 = drerVar.g;
        str3.getClass();
        dresVar.f(str3);
        drqs drqsVar = drerVar.h;
        if (drqsVar == null) {
            drqsVar = drqs.a;
        }
        drqsVar.getClass();
        ffji ffjiVar = new ffji() { // from class: dret
            /* JADX WARN: Type inference failed for: r9v0, types: [doxr, drek, java.lang.Object] */
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                drqr drqrVar = (drqr) obj;
                drqrVar.getClass();
                ?? a = dres.this.a();
                a.getClass();
                drqq b = drqq.b(drqrVar.c);
                if (b == null) {
                    b = drqq.UNRECOGNIZED;
                }
                b.getClass();
                drme a2 = drqt.a(b);
                String str4 = drqrVar.d;
                str4.getClass();
                drld drldVar = (drld) drjz.d(str4);
                String str5 = drqrVar.e;
                str5.getClass();
                return new drem(a2, drldVar, str5, drqrVar.g, drqrVar.h, drqrVar.i, a);
            }
        };
        eygr<drqr> eygrVar = drqsVar.b;
        eygrVar.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(eygrVar, 10));
        for (drqr drqrVar : eygrVar) {
            drqrVar.getClass();
            arrayList.add(ffjiVar.invoke(drqrVar));
        }
        dresVar.e(arrayList);
    }
}
