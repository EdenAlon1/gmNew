package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class denx extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ deny c;
    final /* synthetic */ cjtw d;
    final /* synthetic */ cvjl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public denx(deny denyVar, cjtw cjtwVar, cvjl cvjlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = denyVar;
        this.d = cjtwVar;
        this.e = cvjlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((denx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d9, code lost:
    
        if (r8 == r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00db, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0069, code lost:
    
        if (r8.b(r4, r7) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0043, code lost:
    
        if (r8 != r0) goto L13;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L11
            defpackage.ffci.b(r8)
            goto Ldc
        L11:
            java.lang.Object r1 = r7.a
            defpackage.ffci.b(r8)
            goto L6b
        L17:
            defpackage.ffci.b(r8)
            goto L45
        L1b:
            defpackage.ffci.b(r8)
            deny r8 = r7.c
            ffbr r8 = r8.g
            java.lang.Object r8 = r8.b()
            demu r8 = (defpackage.demu) r8
            cjtw r1 = r7.d
            r8.a(r1)
            cvjl r8 = r7.e
            cvjl r1 = defpackage.cvjl.WELCOME_FLOW_SETTINGS
            if (r8 != r1) goto Ldc
            deny r8 = r7.c
            ffbr r8 = r8.h
            java.lang.Object r8 = r8.b()
            cjtu r8 = (defpackage.cjtu) r8
            r7.b = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto Ldb
        L45:
            cjtq r8 = (defpackage.cjtq) r8
            int r8 = r8.c
            cjtw r8 = defpackage.cjtw.b(r8)
            if (r8 != 0) goto L51
            cjtw r8 = defpackage.cjtw.SHARE_TO_UNKNOWN
        L51:
            r1 = r8
            r1.getClass()
            deny r8 = r7.c
            ffbr r8 = r8.h
            java.lang.Object r8 = r8.b()
            cjtu r8 = (defpackage.cjtu) r8
            cjtw r4 = r7.d
            r7.a = r1
            r7.b = r2
            java.lang.Object r8 = r8.b(r4, r7)
            if (r8 == r0) goto Ldb
        L6b:
            deny r8 = r7.c
            cjtw r4 = r7.d
            r5 = 0
            r7.a = r5
            r5 = 3
            r7.b = r5
            j$.util.Optional r6 = r8.i
            boolean r6 = r6.isPresent()
            if (r6 != 0) goto L80
            ffcu r8 = defpackage.ffcu.a
            goto Ld9
        L80:
            cjtw r1 = (defpackage.cjtw) r1
            int r1 = r1.ordinal()
            if (r1 == r2) goto L91
            if (r1 == r5) goto L8b
            goto L96
        L8b:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.q
            r1.set(r3)
            goto L96
        L91:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.r
            r1.set(r3)
        L96:
            int r1 = r4.ordinal()
            if (r1 == r2) goto Lac
            if (r1 == r5) goto La1
            ffcu r8 = defpackage.ffcu.a
            goto Ld9
        La1:
            java.lang.Object r8 = r8.b(r7)
            ffhh r1 = defpackage.ffhh.a
            if (r8 == r1) goto Ld9
            ffcu r8 = defpackage.ffcu.a
            goto Ld9
        Lac:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.r
            boolean r1 = r1.getAndSet(r3)
            if (r1 != 0) goto Ld7
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.q
            boolean r1 = r1.get()
            if (r1 == 0) goto Lbd
            goto Ld7
        Lbd:
            ffbr r8 = r8.j
            java.lang.Object r8 = r8.b()
            aqkp r8 = (defpackage.aqkp) r8
            elfl r8 = r8.p()
            r8.getClass()
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)
            ffhh r1 = defpackage.ffhh.a
            if (r8 == r1) goto Ld9
            ffcu r8 = defpackage.ffcu.a
            goto Ld9
        Ld7:
            ffcu r8 = defpackage.ffcu.a
        Ld9:
            if (r8 != r0) goto Ldc
        Ldb:
            return r0
        Ldc:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.denx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new denx(this.c, this.d, this.e, ffguVar);
    }
}
