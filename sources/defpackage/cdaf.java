package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdaf {
    private static final cskc j = cskc.g("BugleCms", "CmsBatchInsertionController");
    public final dtuu a;
    public final ffhd b;
    public final asjs c;
    public final ccum d;
    public final ccun e;
    public final ccuq f;
    public final ccvq g;
    public final ffbr h;
    public final ffbr i;
    private final ashv k;
    private final String l;
    private final entd m = entd.c("BugleCms");

    public cdaf(dtuu dtuuVar, ffhd ffhdVar, ashv ashvVar, asjs asjsVar, String str, ccum ccumVar, ccun ccunVar, ccuq ccuqVar, ccvq ccvqVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = dtuuVar;
        this.b = ffhdVar;
        this.k = ashvVar;
        this.c = asjsVar;
        this.l = str;
        this.d = ccumVar;
        this.e = ccunVar;
        this.f = ccuqVar;
        this.g = ccvqVar;
        this.h = ffbrVar;
        this.i = ffbrVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r11, defpackage.bqvj r12, final defpackage.ccvl r13, j$.util.Optional r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdaf.a(java.util.Map, bqvj, ccvl, j$.util.Optional, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1 A[LOOP:0: B:12:0x00bb->B:14:0x00c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0115 A[LOOP:1: B:17:0x010f->B:19:0x0115, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Map r9, defpackage.bqvj r10, defpackage.ccvl r11, j$.util.Optional r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdaf.b(java.util.Map, bqvj, ccvl, j$.util.Optional, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Map r7, defpackage.bqvj r8, defpackage.ccvl r9, defpackage.ffgu r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.cdab
            if (r0 == 0) goto L13
            r0 = r10
            cdab r0 = (defpackage.cdab) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdab r0 = new cdab
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r10)
            goto L73
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.ffci.b(r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            int r2 = r7.size()
            int r2 = defpackage.ffew.a(r2)
            r10.<init>(r2)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L47:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            ffch r5 = new ffch
            r5.<init>(r2)
            r10.put(r4, r5)
            goto L47
        L64:
            cdad r7 = new cdad
            r2 = 0
            r7.<init>(r6, r8, r9, r2)
            r0.c = r3
            java.lang.Object r10 = defpackage.ccyx.c(r10, r7, r0)
            if (r10 != r1) goto L73
            return r1
        L73:
            java.util.Map r10 = (java.util.Map) r10
            cczb r7 = new cczb
            r7.<init>()
            java.util.Map r7 = defpackage.ccyx.b(r10, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdaf.c(java.util.Map, bqvj, ccvl, ffgu):java.lang.Object");
    }

    public final Object d(String str, ffix ffixVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new cdae(null, this, str, ffixVar), ffguVar);
    }

    public final void e(Object obj, String str) {
        csgg a = this.f.a(obj);
        if (a.a()) {
            ensz enszVar = (ensz) this.m.j();
            enszVar.Y(cdii.c, str);
            enszVar.Y(cdii.f, a);
            enszVar.q("Inserted item has already been backed up. Skipping.");
            throw new ccyy(this.l, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r0 == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.Collection r11, int r12, defpackage.bqvj r13, defpackage.ccvl r14, j$.util.Optional r15, defpackage.ffgu r16) {
        /*
            r10 = this;
            r0 = r16
            boolean r1 = r0 instanceof defpackage.cczt
            if (r1 == 0) goto L15
            r1 = r0
            cczt r1 = (defpackage.cczt) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            cczt r1 = new cczt
            r1.<init>(r10, r0)
        L1a:
            r8 = r1
            java.lang.Object r0 = r8.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r8.d
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 == r3) goto L35
            if (r2 != r9) goto L2d
            defpackage.ffci.b(r0)
            goto L7a
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            int r12 = r8.f
            java.lang.Object r11 = r8.a
            cdaf r13 = r8.e
            defpackage.ffci.b(r0)     // Catch: java.lang.Throwable -> L3f
            goto L5b
        L3f:
            r0 = move-exception
            r14 = r0
            goto L62
        L42:
            defpackage.ffci.b(r0)
            r8.e = r10     // Catch: java.lang.Throwable -> L5e
            r8.a = r11     // Catch: java.lang.Throwable -> L5e
            r8.f = r12     // Catch: java.lang.Throwable -> L5e
            r8.d = r3     // Catch: java.lang.Throwable -> L5e
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            java.lang.Object r0 = r2.g(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r1) goto L5a
            goto L79
        L5a:
            r13 = r10
        L5b:
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L3f
            return r0
        L5e:
            r0 = move-exception
            r13 = r0
            r14 = r13
            r13 = r10
        L62:
            cskc r15 = defpackage.cdaf.j
            java.lang.String r0 = "Unexpected exception during batch create"
            r15.o(r0, r14)
            r15 = 0
            r8.e = r15
            r8.a = r15
            r15 = 0
            r8.f = r15
            r8.d = r9
            java.lang.Object r0 = r13.h(r11, r12, r14, r8)
            if (r0 != r1) goto L7a
        L79:
            return r1
        L7a:
            java.util.Map r0 = (java.util.Map) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdaf.f(java.util.Collection, int, bqvj, ccvl, j$.util.Optional, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fc, code lost:
    
        if (r3 != r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.Collection r14, int r15, defpackage.bqvj r16, defpackage.ccvl r17, j$.util.Optional r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdaf.g(java.util.Collection, int, bqvj, ccvl, j$.util.Optional, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[LOOP:0: B:11:0x0062->B:13:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(final java.util.Collection r5, final int r6, java.lang.Throwable r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.cdaa
            if (r0 == 0) goto L13
            r0 = r8
            cdaa r0 = (defpackage.cdaa) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cdaa r0 = new cdaa
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r8)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r8)
            ccza r8 = new ccza
            r8.<init>()
            r0.a = r5
            r0.b = r7
            r0.e = r3
            java.lang.String r6 = "Mark all batch insertion rows as failed"
            java.lang.Object r6 = r4.d(r6, r8, r0)
            if (r6 == r1) goto L80
        L49:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r8 = 10
            int r8 = defpackage.ffdx.n(r5, r8)
            int r8 = defpackage.ffew.a(r8)
            r0 = 16
            int r8 = defpackage.ffmk.f(r8, r0)
            r6.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L62:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r5.next()
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            r0 = r7
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r0 = defpackage.ffci.a(r0)
            ffch r1 = new ffch
            r1.<init>(r0)
            r6.put(r8, r1)
            goto L62
        L7f:
            return r6
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdaf.h(java.util.Collection, int, java.lang.Throwable, ffgu):java.lang.Object");
    }

    public final void i(Collection collection, int i, int i2) {
        try {
            ccun ccunVar = this.e;
            csgg c = csgg.c(i, i2);
            c.getClass();
            ccunVar.b(collection, c);
        } catch (csgp e) {
            cskc cskcVar = j;
            StringBuilder sb = new StringBuilder("Could not save ");
            sb.append((Object) (i2 != 2 ? i2 != 3 ? "FAILED" : "SUCCEED" : "EXECUTING"));
            sb.append(" status to all ids");
            cskcVar.s(sb.toString(), e);
        }
    }
}
