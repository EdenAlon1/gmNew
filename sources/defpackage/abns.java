package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abns extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abnt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abns(abnt abntVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abntVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abns) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r1.fQ(r5, r4) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r5 != r0) goto L9;
     */
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L3d
        Ld:
            java.lang.Object r1 = r4.c
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r5)
            goto L30
        L15:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            r1 = r5
            ffxy r1 = (defpackage.ffxy) r1
            abnt r5 = r4.b
            abnp r3 = new abnp
            r3.<init>()
            r4.c = r1
            r4.a = r2
            effy r5 = r5.b
            java.lang.Object r5 = defpackage.ctzl.a(r5, r3, r4)
            if (r5 == r0) goto L40
        L30:
            r2 = 0
            r4.c = r2
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r1.fQ(r5, r4)
            if (r5 != r0) goto L3d
            goto L40
        L3d:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abns.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        abns abnsVar = new abns(this.b, ffguVar);
        abnsVar.c = obj;
        return abnsVar;
    }
}
