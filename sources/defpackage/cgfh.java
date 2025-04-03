package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgfh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgfj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgfh(ffgu ffguVar, cgfj cgfjVar) {
        super(2, ffguVar);
        this.b = cgfjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgfh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r0.a(r5, r2, r4, true, r3, r14, r7, r15) == r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0031, code lost:
    
        if (r0 != r9) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r16) {
        /*
            r15 = this;
            ffhh r9 = defpackage.ffhh.a
            int r0 = r15.a
            r1 = 1
            if (r0 == 0) goto L14
            if (r0 == r1) goto Le
            defpackage.ffci.b(r16)
            goto Lb0
        Le:
            defpackage.ffci.b(r16)
            r0 = r16
            goto L33
        L14:
            defpackage.ffci.b(r16)
            java.lang.Object r0 = r15.c
            ffsk r0 = (defpackage.ffsk) r0
            cgfj r0 = r15.b
            ffbr r0 = r0.d
            java.lang.Object r0 = r0.b()
            cgfd r0 = (defpackage.cgfd) r0
            comc r0 = r0.c
            elfl r0 = r0.h()
            r15.a = r1
            java.lang.Object r0 = defpackage.fgfz.c(r0, r15)
            if (r0 == r9) goto Lb3
        L33:
            cgea r0 = (defpackage.cgea) r0
            j$.time.Instant r2 = j$.time.Instant.EPOCH
            j$.time.Instant r3 = j$.time.Instant.EPOCH
            j$.time.Instant r4 = j$.time.Instant.EPOCH
            boolean r5 = r0.e
            r6 = 2
            if (r1 == r5) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = r6
        L43:
            long r10 = r0.d
            r12 = 0
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r14 = 0
            if (r7 <= 0) goto L81
            j$.time.Instant r2 = j$.time.Instant.ofEpochMilli(r10)
            boolean r7 = r0.e
            if (r7 == 0) goto L5b
            long r10 = r0.d
            j$.time.Instant r3 = j$.time.Instant.ofEpochMilli(r10)
            goto L81
        L5b:
            eyja r4 = r0.g
            if (r4 != 0) goto L61
            eyja r4 = defpackage.eyja.a
        L61:
            long r10 = r4.b
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L74
            eyja r3 = r0.g
            if (r3 != 0) goto L6d
            eyja r3 = defpackage.eyja.a
        L6d:
            long r3 = r3.b
            j$.time.Instant r3 = j$.time.Instant.ofEpochSecond(r3)
            r5 = r6
        L74:
            long r10 = r0.d
            j$.time.Instant r4 = j$.time.Instant.ofEpochMilli(r10)
            r7 = 4
            r14 = r7
            r7 = r4
            r4 = r5
            r5 = r14
            r14 = r1
            goto L83
        L81:
            r7 = r4
            r4 = r5
        L83:
            boolean r10 = r0.f
            if (r10 == 0) goto L94
            eyja r0 = r0.g
            if (r0 != 0) goto L8d
            eyja r0 = defpackage.eyja.a
        L8d:
            long r3 = r0.b
            j$.time.Instant r3 = j$.time.Instant.ofEpochSecond(r3)
            r4 = 3
        L94:
            if (r5 == r1) goto Lb0
            cgfj r0 = r15.b
            r2.getClass()
            r3.getClass()
            r7.getClass()
            r15.a = r6
            r1 = r5
            r5 = r3
            r3 = r4
            r4 = 1
            r8 = r15
            r6 = r14
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto Lb0
            goto Lb3
        Lb0:
            ffcu r0 = defpackage.ffcu.a
            return r0
        Lb3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgfh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cgfh cgfhVar = new cgfh(ffguVar, this.b);
        cgfhVar.c = obj;
        return cgfhVar;
    }
}
