package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzk extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ aqge d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzk(ffjm ffjmVar, aqge aqgeVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = ffjmVar;
        this.d = aqgeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r4 != r0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r4)
            return r4
        Ld:
            java.lang.Object r1 = r3.a
            defpackage.ffci.b(r4)
            goto L28
        L13:
            defpackage.ffci.b(r4)
            ffjm r1 = r3.c
            aqge r4 = r3.d
            elfl r4 = r4.b()
            r3.a = r1
            r3.b = r2
            java.lang.Object r4 = defpackage.fgfz.c(r4, r3)
            if (r4 == r0) goto L36
        L28:
            r2 = 0
            r3.a = r2
            r2 = 2
            r3.b = r2
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 != r0) goto L35
            goto L36
        L35:
            return r4
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new tzk(this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
