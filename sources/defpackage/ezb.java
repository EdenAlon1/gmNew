package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ezf b;
    final /* synthetic */ fag c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(ezf ezfVar, fag fagVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ezfVar;
        this.c = fagVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ezb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (defpackage.fgct.g((defpackage.fgct) r4, r2, r3) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
    
        if (defpackage.hhj.b(r4, r3) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        throw new defpackage.ffbx();
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 != r2) goto L32
            goto L17
        Ld:
            eyz r4 = defpackage.eyz.a
            r3.a = r2
            java.lang.Object r4 = defpackage.hhj.b(r4, r3)
            if (r4 == r0) goto L3b
        L17:
            ezf r4 = r3.b
            fgcl r4 = r4.a()
            if (r4 == 0) goto L38
            fag r1 = r3.c
            eza r2 = new eza
            r2.<init>(r1)
            r1 = 2
            r3.a = r1
            fgct r4 = (defpackage.fgct) r4
            java.lang.Object r4 = defpackage.fgct.g(r4, r2, r3)
            if (r4 != r0) goto L32
            goto L3b
        L32:
            ffbx r4 = new ffbx
            r4.<init>()
            throw r4
        L38:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ezb(this.b, this.c, ffguVar);
    }
}
