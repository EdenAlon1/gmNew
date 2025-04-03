package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alpy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alqf b;
    final /* synthetic */ boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpy(ffgu ffguVar, alqf alqfVar, boolean z) {
        super(2, ffguVar);
        this.b = alqfVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alpy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r1.d(r5, r2, r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
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
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L38
        Ld:
            defpackage.ffci.b(r5)
            goto L22
        L11:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.d
            ffsk r5 = (defpackage.ffsk) r5
            alqf r5 = r4.b
            r4.a = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 == r0) goto L3b
        L22:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L38
            alqf r1 = r4.b
            boolean r2 = r4.c
            int r5 = r5.intValue()
            r3 = 2
            r4.a = r3
            java.lang.Object r5 = r1.d(r5, r2, r4)
            if (r5 != r0) goto L38
            goto L3b
        L38:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alpy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        alpy alpyVar = new alpy(ffguVar, this.b, this.c);
        alpyVar.d = obj;
        return alpyVar;
    }
}
