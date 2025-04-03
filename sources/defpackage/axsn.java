package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axsn extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffjn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axsn(ffgu ffguVar, ffjn ffjnVar) {
        super(3, ffguVar);
        this.c = ffjnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        axsn axsnVar = new axsn((ffgu) obj3, this.c);
        axsnVar.d = (ffxy) obj;
        axsnVar.b = (Object[]) obj2;
        return axsnVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r1.fQ(r6, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r6 != r0) goto L9;
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
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)
            goto L38
        Ld:
            java.lang.Object r1 = r5.d
            defpackage.ffci.b(r6)
            goto L2b
        L13:
            defpackage.ffci.b(r6)
            java.lang.Object r1 = r5.d
            java.lang.Object r6 = r5.b
            ffjn r3 = r5.c
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r4 = 0
            r4 = r6[r4]
            r6 = r6[r2]
            r5.a = r2
            java.lang.Object r6 = r3.a(r4, r6, r5)
            if (r6 == r0) goto L3b
        L2b:
            r2 = 0
            r5.d = r2
            r2 = 2
            r5.a = r2
            java.lang.Object r6 = r1.fQ(r6, r5)
            if (r6 != r0) goto L38
            goto L3b
        L38:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axsn.b(java.lang.Object):java.lang.Object");
    }
}
