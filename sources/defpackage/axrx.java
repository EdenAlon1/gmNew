package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axrx extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffjq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axrx(ffgu ffguVar, ffjq ffjqVar) {
        super(3, ffguVar);
        this.c = ffjqVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        axrx axrxVar = new axrx((ffgu) obj3, this.c);
        axrxVar.d = (ffxy) obj;
        axrxVar.b = (Object[]) obj2;
        return axrxVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r1.fQ(r12, r11) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r12 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ffxy] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Lf
            defpackage.ffci.b(r12)
            r10 = r11
            goto L43
        Lf:
            java.lang.Object r1 = r11.d
            defpackage.ffci.b(r12)
            r10 = r11
            goto L37
        L16:
            defpackage.ffci.b(r12)
            java.lang.Object r1 = r11.d
            java.lang.Object r12 = r11.b
            ffjq r4 = r11.c
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            r5 = 0
            r5 = r12[r5]
            r6 = r12[r3]
            r7 = r12[r2]
            r8 = 3
            r8 = r12[r8]
            r9 = 4
            r9 = r12[r9]
            r11.a = r3
            r10 = r11
            java.lang.Object r12 = r4.a(r5, r6, r7, r8, r9, r10)
            if (r12 == r0) goto L46
        L37:
            r3 = 0
            r10.d = r3
            r10.a = r2
            java.lang.Object r12 = r1.fQ(r12, r11)
            if (r12 != r0) goto L43
            goto L46
        L43:
            ffcu r12 = defpackage.ffcu.a
            return r12
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axrx.b(java.lang.Object):java.lang.Object");
    }
}
