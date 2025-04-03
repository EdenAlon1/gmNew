package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axsb extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffjs c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axsb(ffgu ffguVar, ffjs ffjsVar) {
        super(3, ffguVar);
        this.c = ffjsVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        axsb axsbVar = new axsb((ffgu) obj3, this.c);
        axsbVar.d = (ffxy) obj;
        axsbVar.b = (Object[]) obj2;
        return axsbVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r1.fQ(r14, r13) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r14 != r0) goto L9;
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
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r13.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Lf
            defpackage.ffci.b(r14)
            r12 = r13
            goto L49
        Lf:
            java.lang.Object r1 = r13.d
            defpackage.ffci.b(r14)
            r12 = r13
            goto L3d
        L16:
            defpackage.ffci.b(r14)
            java.lang.Object r1 = r13.d
            java.lang.Object r14 = r13.b
            ffjs r4 = r13.c
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r5 = 0
            r5 = r14[r5]
            r6 = r14[r3]
            r7 = r14[r2]
            r8 = 3
            r8 = r14[r8]
            r9 = 4
            r9 = r14[r9]
            r10 = 5
            r10 = r14[r10]
            r11 = 6
            r11 = r14[r11]
            r13.a = r3
            r12 = r13
            java.lang.Object r14 = r4.k(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r14 == r0) goto L4c
        L3d:
            r3 = 0
            r12.d = r3
            r12.a = r2
            java.lang.Object r14 = r1.fQ(r14, r13)
            if (r14 != r0) goto L49
            goto L4c
        L49:
            ffcu r14 = defpackage.ffcu.a
            return r14
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axsb.b(java.lang.Object):java.lang.Object");
    }
}
