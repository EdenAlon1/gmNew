package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cze extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ hho c;
    final /* synthetic */ czg d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cze(hho hhoVar, czg czgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = hhoVar;
        this.d = czgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cze) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        if (defpackage.fgbj.b(r8, r4, r7) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (defpackage.cyy.a(r8, r7) != r0) goto L10;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006a -> B:5:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x004e -> B:5:0x002e). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L13
            java.lang.Object r1 = r7.a
            java.lang.Object r3 = r7.e
            ffsk r3 = (defpackage.ffsk) r3
            defpackage.ffci.b(r8)
            goto L2e
        L13:
            java.lang.Object r1 = r7.a
            java.lang.Object r3 = r7.e
            ffsk r3 = (defpackage.ffsk) r3
            defpackage.ffci.b(r8)
            goto L46
        L1d:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.e
            r3 = r8
            ffsk r3 = (defpackage.ffsk) r3
            ffky r1 = new ffky
            r1.<init>()
            r8 = 1065353216(0x3f800000, float:1.0)
            r1.a = r8
        L2e:
            czb r8 = new czb
            czg r4 = r7.d
            r5 = r1
            ffky r5 = (defpackage.ffky) r5
            hho r6 = r7.c
            r8.<init>(r6, r4, r5, r3)
            r7.e = r3
            r7.a = r1
            r7.b = r2
            java.lang.Object r8 = defpackage.cyy.a(r8, r7)
            if (r8 == r0) goto L6c
        L46:
            r8 = r1
            ffky r8 = (defpackage.ffky) r8
            float r8 = r8.a
            r4 = 0
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L2e
            czc r8 = new czc
            r8.<init>(r3)
            ffxx r8 = defpackage.hkt.a(r8)
            czd r4 = new czd
            r5 = 0
            r4.<init>(r5)
            r7.e = r3
            r7.a = r1
            r5 = 2
            r7.b = r5
            java.lang.Object r8 = defpackage.fgbj.b(r8, r4, r7)
            if (r8 != r0) goto L2e
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cze.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cze czeVar = new cze(this.c, this.d, ffguVar);
        czeVar.e = obj;
        return czeVar;
    }
}
