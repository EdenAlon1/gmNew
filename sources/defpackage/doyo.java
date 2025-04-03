package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyo {
    public static final doyb a(doyi doyiVar) {
        if (c(doyiVar)) {
            return doya.a;
        }
        throw new IllegalArgumentException("Local attachment source wasn't set");
    }

    public static final doyi b(doyc doycVar) {
        doye doyeVar = (doye) doyi.a.createBuilder();
        doyeVar.getClass();
        String a = doycVar.b().a();
        a.getClass();
        doyeVar.copyOnWrite();
        doyi doyiVar = (doyi) doyeVar.instance;
        doyiVar.b |= 1;
        doyiVar.e = a;
        doyj.b(doycVar.f(), doyeVar);
        long a2 = doycVar.a();
        doyeVar.copyOnWrite();
        doyi doyiVar2 = (doyi) doyeVar.instance;
        doyiVar2.b |= 4;
        doyiVar2.g = a2;
        String d = doycVar.d();
        if (d != null) {
            doyeVar.copyOnWrite();
            doyi doyiVar3 = (doyi) doyeVar.instance;
            doyiVar3.b |= 8;
            doyiVar3.h = d;
        }
        eyja b = eykn.b(doycVar.c());
        doyeVar.copyOnWrite();
        doyi doyiVar4 = (doyi) doyeVar.instance;
        doyiVar4.i = b;
        doyiVar4.b |= 16;
        if (doycVar.fm() instanceof doya) {
            doyg doygVar = (doyg) doyh.a.createBuilder();
            doygVar.getClass();
            eyfy build = doygVar.build();
            build.getClass();
            doyeVar.copyOnWrite();
            doyi doyiVar5 = (doyi) doyeVar.instance;
            doyiVar5.d = (doyh) build;
            doyiVar5.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        return doyj.a(doyeVar);
    }

    public static final boolean c(doyi doyiVar) {
        int i = doyiVar.c;
        return (doyf.a(i) == 0 || doyf.a(i) == 1) ? false : true;
    }

    public static final void d(doyn doynVar, doyi doyiVar) {
        String str = doyiVar.e;
        str.getClass();
        drlx a = drlo.a(str);
        if (a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        doynVar.e(a);
        String str2 = doyiVar.f;
        str2.getClass();
        doynVar.u(str2);
        doynVar.r(doyiVar.g);
        doyi doyiVar2 = (doyiVar.b & 8) == 0 ? null : doyiVar;
        if (doyiVar2 != null) {
            String str3 = doyiVar2.h;
            str3.getClass();
            doynVar.d(str3);
        }
        eyja eyjaVar = doyiVar.i;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        eyjaVar.getClass();
        doynVar.c(eykn.d(eyjaVar));
    }
}
