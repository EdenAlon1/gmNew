package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eanj implements ealb {
    public static final entd a = entd.c("GnpSdk");
    public final eapp b;
    public final eamg c;
    private final eama d;
    private final ffhd e;
    private final eans f;
    private final ears g;
    private final Context h;
    private final eanv i;
    private final ealr j;
    private final ealz k;
    private final ealf l;
    private final ealb m;
    private final eagn n;
    private final String o;
    private final eann p;
    private final eanl q;

    public eanj(eama eamaVar, eapp eappVar, ffhd ffhdVar, eann eannVar, eanl eanlVar, eans eansVar, ears earsVar, Context context, eanv eanvVar, ealr ealrVar, ealz ealzVar, ealf ealfVar, ealb ealbVar, eagn eagnVar, eamg eamgVar) {
        eamaVar.getClass();
        eappVar.getClass();
        ffhdVar.getClass();
        eannVar.getClass();
        earsVar.getClass();
        context.getClass();
        ealrVar.getClass();
        ealzVar.getClass();
        ealfVar.getClass();
        this.d = eamaVar;
        this.b = eappVar;
        this.e = ffhdVar;
        this.p = eannVar;
        this.q = eanlVar;
        this.f = eansVar;
        this.g = earsVar;
        this.h = context;
        this.i = eanvVar;
        this.j = ealrVar;
        this.k = ealzVar;
        this.l = ealfVar;
        this.m = ealbVar;
        this.n = eagnVar;
        this.c = eamgVar;
        this.o = "GNP_REGISTRATION";
    }

    @Override // defpackage.ealb
    public final int a() {
        return 15;
    }

    @Override // defpackage.ealb
    public final long b() {
        return 0L;
    }

    @Override // defpackage.ealb
    public final Long c() {
        return null;
    }

    @Override // defpackage.ealb
    public final Object d(Bundle bundle, ffgu ffguVar) {
        return ffra.a(this.e, new eand(this, bundle, null), ffguVar);
    }

    @Override // defpackage.ealb
    public final String e() {
        return this.o;
    }

    @Override // defpackage.ealb
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ealb
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ealb
    public final int h() {
        return 2;
    }

    @Override // defpackage.ealb
    public final int i() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r8.a(r10, r12, r11, r0) != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.eafl r8, java.util.List r9, java.util.Map r10, defpackage.eagp r11, defpackage.ffgu r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.eane
            if (r0 == 0) goto L13
            r0 = r12
            eane r0 = (defpackage.eane) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            eane r0 = new eane
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r12)
            goto L8c
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            eagp r11 = r0.g
            java.lang.Object r10 = r0.b
            java.lang.Object r9 = r0.a
            eanj r8 = r0.f
            defpackage.ffci.b(r12)
            goto L73
        L3e:
            defpackage.ffci.b(r12)
            ears r12 = r7.g
            android.content.Context r2 = r7.h
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r5 = "FAILURE"
            r12.c(r2, r5)
            ears r12 = r7.g
            int r2 = r9.size()
            android.content.Context r6 = r7.h
            java.lang.String r6 = r6.getPackageName()
            r12.d(r2, r6, r5)
            r8.getClass()
            eafh r8 = (defpackage.eafh) r8
            r0.f = r7
            r0.a = r9
            r0.b = r10
            r0.g = r11
            r0.e = r4
            java.lang.Object r8 = r7.m(r0)
            if (r8 == r1) goto L8f
            r8 = r7
        L73:
            eann r8 = r8.p
            eanf r12 = new eanf
            r12.<init>(r9)
            r9 = 0
            r0.f = r9
            r0.a = r9
            r0.b = r9
            r0.g = r9
            r0.e = r3
            java.lang.Object r8 = r8.a(r10, r12, r11, r0)
            if (r8 != r1) goto L8c
            goto L8f
        L8c:
            ffcu r8 = defpackage.ffcu.a
            return r8
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.j(eafl, java.util.List, java.util.Map, eagp, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x023a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [eama] */
    /* JADX WARN: Type inference failed for: r19v2, types: [eanj] */
    /* JADX WARN: Type inference failed for: r1v14, types: [eafl] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v14, types: [eama] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [eafl] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.List r19, java.util.Map r20, defpackage.exyd r21, defpackage.eagp r22, defpackage.eamb r23, defpackage.ffgu r24) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.k(java.util.List, java.util.Map, exyd, eagp, eamb, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r10 != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r8 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.eafl r8, java.util.List r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.eani
            if (r0 == 0) goto L13
            r0 = r10
            eani r0 = (defpackage.eani) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eani r0 = new eani
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.ffci.b(r10)
            goto L7b
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.ffci.b(r10)
            goto L8b
        L37:
            defpackage.ffci.b(r10)
            eagn r10 = r7.n
            eagl r10 = (defpackage.eagl) r10
            int r10 = r10.g
            if (r10 == 0) goto L7e
            boolean r10 = r8.g()
            if (r10 == 0) goto L4f
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L4f
            goto L7e
        L4f:
            boolean r8 = r8.g()
            if (r8 == 0) goto L8b
            eagn r8 = r7.n
            eagl r8 = (defpackage.eagl) r8
            int r8 = r8.g
            if (r8 <= 0) goto L8b
            ealf r1 = r7.l
            r8 = r2
            ealb r2 = r7.m
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            ealb r9 = r7.m
            eamr r9 = (defpackage.eamr) r9
            long r9 = r9.a
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r9)
            r6.c = r8
            r3 = 0
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6)
            if (r10 == r0) goto L8a
        L7b:
            eafl r10 = (defpackage.eafl) r10
            goto L8b
        L7e:
            ealf r8 = r7.l
            r6.c = r3
            r9 = 17
            java.lang.Object r8 = defpackage.eale.a(r8, r9, r6)
            if (r8 != r0) goto L8b
        L8a:
            return r0
        L8b:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.l(eafl, java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.eanh
            if (r0 == 0) goto L13
            r0 = r5
            eanh r0 = (defpackage.eanh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eanh r0 = new eanh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r0 = r0.c
            if (r0 == 0) goto L3a
            r1 = 1
            if (r0 != r1) goto L32
            defpackage.ffci.b(r5)     // Catch: java.lang.Exception -> L25
            goto L3d
        L25:
            r5 = move-exception
            entd r0 = defpackage.eanj.a
            ensk r0 = r0.j()
            java.lang.String r1 = "Failed to report registration results"
            defpackage.a.K(r0, r1, r5)
            goto L3d
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L3a:
            defpackage.ffci.b(r5)
        L3d:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanj.m(ffgu):java.lang.Object");
    }
}
