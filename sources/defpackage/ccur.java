package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccur extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ccvj c;
    final /* synthetic */ engw d;
    final /* synthetic */ Optional e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccur(ccvj ccvjVar, engw engwVar, Optional optional, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ccvjVar;
        this.d = engwVar;
        this.e = optional;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccur) c((akzw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r1.h(r6, 3, r9, r8) != r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a5 A[LOOP:0: B:8:0x009f->B:10:0x00a5, LOOP_END] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.b
            r2 = 10
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1d
            if (r1 == r4) goto L16
            java.lang.Object r0 = r8.a
            defpackage.ffci.b(r9)
            goto L84
        L16:
            java.lang.Object r1 = r8.a
            defpackage.ffci.b(r9)
            r9 = r1
            goto L6b
        L1d:
            defpackage.ffci.b(r9)     // Catch: java.lang.Exception -> L21
            goto L35
        L21:
            r9 = move-exception
            goto L38
        L23:
            defpackage.ffci.b(r9)
            ccvj r9 = r8.c     // Catch: java.lang.Exception -> L21
            engw r1 = r8.d     // Catch: java.lang.Exception -> L21
            j$.util.Optional r6 = r8.e     // Catch: java.lang.Exception -> L21
            r8.b = r5     // Catch: java.lang.Exception -> L21
            java.lang.Object r9 = r9.f(r1, r6, r8)     // Catch: java.lang.Exception -> L21
            if (r9 != r0) goto L35
            goto L82
        L35:
            ccam r9 = (defpackage.ccam) r9     // Catch: java.lang.Exception -> L21
            return r9
        L38:
            ccvj r1 = r8.c
            engw r5 = r8.d
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = defpackage.ffdx.n(r5, r2)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5e
            java.lang.Object r7 = r5.next()
            ccce r7 = (defpackage.ccce) r7
            java.lang.String r7 = r7.e
            r7.getClass()
            r6.add(r7)
            goto L49
        L5e:
            cdaf r1 = r1.h
            r8.a = r9
            r8.b = r4
            java.lang.Object r1 = r1.h(r6, r3, r9, r8)
            if (r1 != r0) goto L6b
            goto L82
        L6b:
            ccvj r1 = r8.c
            ccvl r4 = r1.e()
            cdat r5 = defpackage.cdat.d
            r8.a = r9
            r8.b = r3
            cdaq r1 = r1.i
            r3 = r9
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r1 = r1.a(r3, r5, r4, r8)
            if (r1 != r0) goto L83
        L82:
            return r0
        L83:
            r0 = r9
        L84:
            ccvj r9 = r8.c
            engw r1 = r8.d
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            int r2 = defpackage.ffdx.n(r1, r2)
            int r2 = defpackage.ffew.a(r2)
            r4 = 16
            int r2 = defpackage.ffmk.f(r2, r4)
            r3.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L9f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r1.next()
            r4 = r2
            ccce r4 = (defpackage.ccce) r4
            ccke r4 = new ccke
            r5 = r0
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r4.<init>(r5)
            r3.put(r2, r4)
            goto L9f
        Lb8:
            int r9 = r9.g
            ccam r0 = new ccam
            r0.<init>(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccur.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccur(this.c, this.d, this.e, ffguVar);
    }
}
