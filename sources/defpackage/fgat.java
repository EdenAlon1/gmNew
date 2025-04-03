package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgat extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgat(ffjm ffjmVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fgat fgatVar = new fgat(this.c, (ffgu) obj3);
        fgatVar.d = (ffxy) obj;
        fgatVar.b = obj2;
        return fgatVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r1.fQ(r5, r4) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r5 != r0) goto L9;
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
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L31
        Ld:
            java.lang.Object r1 = r4.d
            defpackage.ffci.b(r5)
            goto L24
        L13:
            defpackage.ffci.b(r5)
            java.lang.Object r1 = r4.d
            java.lang.Object r5 = r4.b
            ffjm r3 = r4.c
            r4.a = r2
            java.lang.Object r5 = r3.a(r5, r4)
            if (r5 == r0) goto L34
        L24:
            r2 = 0
            r4.d = r2
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r1.fQ(r5, r4)
            if (r5 != r0) goto L31
            goto L34
        L31:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgat.b(java.lang.Object):java.lang.Object");
    }
}
