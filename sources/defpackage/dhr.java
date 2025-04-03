package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffud b;
    final /* synthetic */ dhw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhr(ffud ffudVar, dhw dhwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffudVar;
        this.c = dhwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0017, code lost:
    
        if (r5.o(r4) != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        return r0;
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
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L3a
        Ld:
            ffud r5 = r4.b
            if (r5 == 0) goto L19
            r4.a = r2
            java.lang.Object r5 = r5.o(r4)
            if (r5 == r0) goto L39
        L19:
            dhw r5 = r4.c
            r1 = 2
            r4.a = r1
            int r1 = r5.a
            if (r1 > 0) goto L25
            ffcu r5 = defpackage.ffcu.a
            goto L37
        L25:
            dfy r1 = defpackage.dfy.a
            dhu r2 = new dhu
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = defpackage.ffra.a(r1, r2, r4)
            ffhh r1 = defpackage.ffhh.a
            if (r5 == r1) goto L37
            ffcu r5 = defpackage.ffcu.a
        L37:
            if (r5 != r0) goto L3a
        L39:
            return r0
        L3a:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dhr(this.b, this.c, ffguVar);
    }
}
