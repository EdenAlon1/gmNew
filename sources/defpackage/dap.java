package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dap {
    public static final float a(ffhd ffhdVar) {
        hvl hvlVar = (hvl) ffhdVar.get(hvl.b);
        float a = hvlVar != null ? hvlVar.a() : 1.0f;
        if (a < 0.0f) {
            czx.b("negative scale factor");
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6 A[Catch: CancellationException -> 0x0038, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0038, blocks: (B:12:0x0033, B:14:0x00c9, B:16:0x00d6, B:21:0x00f9), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r26v1, types: [ffji] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.cxv r21, defpackage.cxq r22, long r23, defpackage.ffji r25, defpackage.ffgu r26) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dap.b(cxv, cxq, long, ffji, ffgu):java.lang.Object");
    }

    public static final Object c(float f, float f2, float f3, cxt cxtVar, ffjm ffjmVar, ffgu ffguVar) {
        dbv dbvVar = dcp.a;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        dbw dbwVar = (dbw) dbvVar;
        cyb cybVar = (cyb) dbwVar.a.invoke(new Float(f3));
        if (cybVar == null) {
            cybVar = ((cyb) dbwVar.a.invoke(f4)).c();
        }
        cyb cybVar2 = cybVar;
        Object b = b(new cxv(dbvVar, f4, cybVar2, 56), new daq(cxtVar, dbvVar, f4, f5, cybVar2), Long.MIN_VALUE, new dah(ffjmVar, dbvVar), ffguVar);
        ffhh ffhhVar = ffhh.a;
        if (b != ffhhVar) {
            b = ffcu.a;
        }
        return b == ffhhVar ? b : ffcu.a;
    }

    public static final Object d(cxv cxvVar, Object obj, cxt cxtVar, boolean z, ffji ffjiVar, ffgu ffguVar) {
        Object b = b(cxvVar, new daq(cxtVar, cxvVar.a, cxvVar.a(), obj, cxvVar.b), z ? cxvVar.c : Long.MIN_VALUE, ffjiVar, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    public static final void e(cxs cxsVar, long j, float f, cxq cxqVar, cxv cxvVar, ffji ffjiVar) {
        long a = f == 0.0f ? cxqVar.a() : (long) ((j - cxsVar.a) / f);
        cxsVar.d = j;
        cxsVar.b.b(cxqVar.d(a));
        cxsVar.c = cxqVar.b(a);
        if (cxqVar.e(a)) {
            cxsVar.e = cxsVar.d;
            cxsVar.e();
        }
        f(cxsVar, cxvVar);
        ffjiVar.invoke(cxsVar);
    }

    public static final void f(cxs cxsVar, cxv cxvVar) {
        cxvVar.c(cxsVar.a());
        cyb cybVar = cxvVar.b;
        cyb cybVar2 = cxsVar.c;
        int b = cybVar.b();
        for (int i = 0; i < b; i++) {
            cybVar.e(i, cybVar2.a(i));
        }
        cxvVar.d = cxsVar.e;
        cxvVar.c = cxsVar.d;
        cxvVar.e = cxsVar.d();
    }

    public static final Object g(cxv cxvVar, cyj cyjVar, boolean z, ffji ffjiVar, ffgu ffguVar) {
        Object b = b(cxvVar, new cyi(cyjVar, cxvVar.a, cxvVar.a(), cxvVar.b), z ? cxvVar.c : Long.MIN_VALUE, ffjiVar, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }

    public static /* synthetic */ Object h(float f, float f2, cxt cxtVar, ffjm ffjmVar, ffgu ffguVar, int i) {
        if ((i & 8) != 0) {
            cxtVar = cxu.b(0.0f, 0.0f, null, 7);
        }
        return c(f, f2, 0.0f, cxtVar, ffjmVar, ffguVar);
    }

    public static /* synthetic */ Object j(cxv cxvVar, Object obj, cxt cxtVar, boolean z, ffji ffjiVar, ffgu ffguVar, int i) {
        if ((i & 2) != 0) {
            cxtVar = cxu.b(0.0f, 0.0f, null, 7);
        }
        cxt cxtVar2 = cxtVar;
        boolean z2 = ((i & 4) == 0) & z;
        if ((i & 8) != 0) {
            ffjiVar = dan.a;
        }
        return d(cxvVar, obj, cxtVar2, z2, ffjiVar, ffguVar);
    }

    private static final Object k(cxq cxqVar, ffji ffjiVar, ffgu ffguVar) {
        return cxqVar.f() ? cyy.a(ffjiVar, ffguVar) : hhj.c(new dao(ffjiVar), ffguVar);
    }
}
