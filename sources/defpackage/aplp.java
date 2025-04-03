package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aplp extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ aplx c;
    final /* synthetic */ Instant d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aplp(aplx aplxVar, Instant instant, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = aplxVar;
        this.d = instant;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aplp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        if (r9 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r9 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 == r2) goto L11
            defpackage.ffci.b(r9)
            r7 = r8
            goto L7b
        L11:
            java.lang.Object r1 = r8.a
            defpackage.ffci.b(r9)
            r4 = r1
            goto L4b
        L18:
            defpackage.ffci.b(r9)
            goto L32
        L1c:
            defpackage.ffci.b(r9)
            aplx r9 = r8.c
            aqge r9 = r9.d
            elfl r9 = r9.b()
            r9.getClass()
            r8.b = r3
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)
            if (r9 == r0) goto L91
        L32:
            aplx r1 = r8.c
            amfx r9 = (defpackage.amfx) r9
            aqge r1 = r1.e
            elfl r1 = r1.b()
            r1.getClass()
            r8.a = r9
            r8.b = r2
            java.lang.Object r1 = defpackage.fgfz.c(r1, r8)
            if (r1 == r0) goto L91
            r4 = r9
            r9 = r1
        L4b:
            aplx r1 = r8.c
            r5 = r9
            apfz r5 = (defpackage.apfz) r5
            apmn r9 = new apmn
            r5.getClass()
            r4.getClass()
            r9.<init>(r5, r4)
            java.util.concurrent.atomic.AtomicReference r1 = r1.i
            r1.set(r9)
            aplx r1 = r8.c
            j$.time.Instant r3 = r8.d
            cowy r2 = defpackage.cowy.ACTIVE
            r3.getClass()
            aqux r6 = r5.g()
            r9 = 0
            r8.a = r9
            r9 = 3
            r8.b = r9
            r7 = r8
            java.lang.Object r9 = r1.d(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L7b
            goto L92
        L7b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L88
            aplx r9 = r7.c
            r9.i()
        L88:
            aplx r9 = r7.c
            j$.time.Instant r0 = r7.d
            r9.f = r0
            ffcu r9 = defpackage.ffcu.a
            return r9
        L91:
            r7 = r8
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aplp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aplp(this.c, this.d, ffguVar);
    }
}
