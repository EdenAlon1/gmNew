package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apik extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ apim d;
    final /* synthetic */ apyz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apik(apim apimVar, apyz apyzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = apimVar;
        this.e = apyzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apik) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        if (r10 == r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r10)
            goto L65
        Ld:
            java.lang.Object r1 = r9.b
            java.lang.Object r2 = r9.a
            defpackage.ffci.b(r10)
            goto L35
        L15:
            defpackage.ffci.b(r10)
            apim r10 = r9.d
            apyz r1 = r9.e
            apsb r3 = r10.p()
            aqge r10 = r10.c()
            elfl r10 = r10.b()
            r9.a = r3
            r9.b = r1
            r9.c = r2
            java.lang.Object r10 = defpackage.fgfz.c(r10, r9)
            if (r10 == r0) goto L69
            r2 = r3
        L35:
            apim r3 = r9.d
            r4 = r10
            alxg r4 = (defpackage.alxg) r4
            cqoh r10 = r3.b
            j$.time.Instant r10 = r10.f()
            long r5 = r10.toEpochMilli()
            apim r10 = r9.d
            cqoh r10 = r10.b
            long r7 = r10.a()
            r3 = r1
            apyz r3 = (defpackage.apyz) r3
            elfl r10 = r2.a(r3, r4, r5, r7)
            r10.getClass()
            r1 = 0
            r9.a = r1
            r9.b = r1
            r1 = 2
            r9.c = r1
            java.lang.Object r10 = defpackage.fgfz.c(r10, r9)
            if (r10 != r0) goto L65
            goto L69
        L65:
            r10.getClass()
            return r10
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apik.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apik(this.d, this.e, ffguVar);
    }
}
