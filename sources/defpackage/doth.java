package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doth extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dotb b;
    final /* synthetic */ cyq c;
    final /* synthetic */ cyq d;
    final /* synthetic */ hho e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doth(dotb dotbVar, cyq cyqVar, cyq cyqVar2, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dotbVar;
        this.c = cyqVar;
        this.d = cyqVar2;
        this.e = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doth) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r10 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r10 == r0) goto L14;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 1
            defpackage.ffci.b(r10)
            if (r1 == 0) goto Lf
            if (r1 == r2) goto Ld
            goto L51
        Ld:
            r5 = r9
            goto L31
        Lf:
            dotb r10 = r9.b
            boolean r10 = r10.e
            if (r10 == 0) goto L34
            hho r10 = r9.e
            cxj r3 = defpackage.doti.a(r10)
            java.lang.Float r4 = new java.lang.Float
            r10 = 1048576000(0x3e800000, float:0.25)
            r4.<init>(r10)
            cyq r5 = r9.c
            r9.a = r2
            r6 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r10 = defpackage.cxj.j(r3, r4, r5, r6, r7, r8)
            r5 = r7
            if (r10 == r0) goto L50
        L31:
            cxr r10 = (defpackage.cxr) r10
            goto L53
        L34:
            r5 = r9
            hho r10 = r5.e
            cxj r1 = defpackage.doti.a(r10)
            java.lang.Float r2 = new java.lang.Float
            r10 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r10)
            cyq r3 = r5.d
            r10 = 2
            r5.a = r10
            r4 = 0
            r6 = 12
            java.lang.Object r10 = defpackage.cxj.j(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L51
        L50:
            return r0
        L51:
            cxr r10 = (defpackage.cxr) r10
        L53:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doth.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new doth(this.b, this.c, this.d, this.e, ffguVar);
    }
}
