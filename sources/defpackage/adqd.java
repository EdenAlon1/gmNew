package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adqd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adqe b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqd(adqe adqeVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adqeVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adqd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r4 = (defpackage.fbpu) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r4 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        return r0;
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
            if (r1 == r2) goto L21
            goto L37
        Ld:
            adqe r4 = r3.b
            ffbr r4 = r4.h
            java.lang.Object r4 = r4.b()
            cjeo r4 = (defpackage.cjeo) r4
            eisx r1 = r3.c
            r3.a = r2
            java.lang.Object r4 = r4.h(r1, r3)
            if (r4 == r0) goto L3c
        L21:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L39
            adqe r4 = r3.b
            r1 = 2
            r3.a = r1
            cjgc r4 = r4.j
            java.lang.Object r4 = r4.g(r3)
            if (r4 != r0) goto L37
            goto L3c
        L37:
            fbpu r4 = (defpackage.fbpu) r4
        L39:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adqd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adqd(this.b, this.c, ffguVar);
    }
}
