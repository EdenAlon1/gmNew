package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxkg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxkk b;
    final /* synthetic */ akue c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxkg(cxkk cxkkVar, akue akueVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxkkVar;
        this.c = akueVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxkg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r5 != r0) goto L8;
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
            if (r1 == r2) goto L17
            return r5
        Ld:
            cxkk r5 = r4.b
            r4.a = r2
            java.lang.Object r5 = r5.d(r4)
            if (r5 == r0) goto L28
        L17:
            cxkk r1 = r4.b
            akue r2 = r4.c
            cxkc r5 = (defpackage.cxkc) r5
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r1.e(r5, r2, r4)
            if (r5 != r0) goto L27
            goto L28
        L27:
            return r5
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxkg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cxkg(this.b, this.c, ffguVar);
    }
}
