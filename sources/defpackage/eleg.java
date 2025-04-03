package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eleg {
    public static elaa a(elab elabVar) {
        elaa d = elaa.d(2);
        for (elat c = ekyf.c(); c != null; c = c.a()) {
            d = c.i(elabVar);
            if (d.c() - 1 == 0) {
                break;
            }
        }
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r2 = r0.i(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if ((r2.c() - 1) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r0 = r0.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.elaa b(defpackage.elab r5) {
        /*
            elat r0 = defpackage.ekyf.c()
            java.util.List r1 = defpackage.ekxh.c
            if (r0 != 0) goto Le
            r5 = 2
            elaa r5 = defpackage.elaa.d(r5)
            return r5
        Le:
            r2 = 3
            elaa r2 = defpackage.elaa.d(r2)
        L13:
            if (r0 == 0) goto L41
            java.util.Iterator r3 = r1.iterator()
        L19:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r3.next()
            elab r4 = (defpackage.elab) r4
            elaa r4 = r0.i(r4)
            boolean r4 = r4.b()
            if (r4 == 0) goto L19
            goto L41
        L30:
            elaa r2 = r0.i(r5)
            int r3 = r2.c()
            int r3 = r3 + (-1)
            if (r3 == 0) goto L41
            elat r0 = r0.a()
            goto L13
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eleg.b(elab):elaa");
    }

    public static String c() {
        elat c = ekyf.c();
        return c == null ? "<no trace>" : ekyf.o(c);
    }

    public static void d() {
        ekyf.z(false);
    }

    public static boolean e(elat elatVar) {
        return (elatVar == null || (elatVar instanceof ekxr) || (elatVar instanceof ekza) || (elatVar instanceof ekzt) || (elatVar instanceof ekzj)) ? false : true;
    }

    @ffbs
    public static ekzz f(String str) {
        return g(str, elad.a);
    }

    @ffbs
    public static ekzz g(String str, elae elaeVar) {
        return h(str, elaeVar, true);
    }

    @ffbs
    public static ekzz h(String str, elae elaeVar, boolean z) {
        boolean z2;
        elat elatVar;
        boolean z3;
        ekyy ekyyVar;
        elao b = ekyf.b();
        elat elatVar2 = b.c;
        if (elatVar2 == ekzt.a) {
            elatVar2 = null;
            ekyf.h(b, null);
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z2;
        if (elatVar2 == null) {
            UUID b2 = ekyj.a.b();
            if (elau.a()) {
                ekxp ekxpVar = new ekxp();
                ekyy.k();
                z3 = z;
                ekyyVar = new ekyy(b2, str, elaeVar, ekxpVar, z3, ekyf.u(ekxpVar), b);
            } else {
                z3 = z;
                ekxp ekxpVar2 = ekyw.a;
                ekyy.k();
                ekyyVar = new ekyy(b2, str, elaeVar, ekxpVar2, z3, false, b);
            }
            boolean z5 = ekyyVar.a;
            elatVar = ekyyVar;
            elatVar = ekyyVar;
            if (!z5 && z3) {
                ekyf.y();
                elatVar = ekyyVar;
            }
        } else {
            elatVar = elatVar2 instanceof ekxr ? ((ekxr) elatVar2).f(str, elaeVar, z, b) : elatVar2.m(str, elaeVar, b);
        }
        ekyf.h(b, elatVar);
        return new ekzz(elatVar, z4);
    }
}
