package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esuj extends ffhv implements ffji {
    int a;
    final /* synthetic */ esun b;
    final /* synthetic */ String c;
    final /* synthetic */ esro d;
    final /* synthetic */ estr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esuj(esun esunVar, String str, esro esroVar, estr estrVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = esunVar;
        this.c = str;
        this.d = esroVar;
        this.e = estrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        if (r7 != r0) goto L8;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 1
            defpackage.ffci.b(r7)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            return r7
        Ld:
            esun r7 = r6.b
            java.lang.String r1 = r6.c
            r6.a = r2
            java.lang.Object r7 = defpackage.esun.l(r7, r1, r6)
            if (r7 == r0) goto L95
        L19:
            esro r1 = r6.d
            fcfo r7 = (defpackage.fcfo) r7
            fccd r3 = defpackage.fccd.a
            eyfq r3 = r3.createBuilder()
            fccc r3 = (defpackage.fccc) r3
            r3.getClass()
            r7.getClass()
            r3.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r4 = r3.instance
            fccd r4 = (defpackage.fccd) r4
            r4.c = r7
            int r7 = r4.b
            r7 = r7 | r2
            r4.b = r7
            r3.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r7 = r3.instance
            fccd r7 = (defpackage.fccd) r7
            fcek r2 = r1.c
            r7.e = r2
            int r2 = r7.b
            r4 = 2
            r2 = r2 | r4
            r7.b = r2
            eygr r7 = r7.d
            java.util.List r7 = j$.util.DesugarCollections.unmodifiableList(r7)
            r7.getClass()
            r3.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r7 = r3.instance
            fccd r7 = (defpackage.fccd) r7
            eygr r2 = r7.d
            boolean r5 = r2.c()
            if (r5 != 0) goto L68
            eygr r2 = defpackage.eyfy.mutableCopy(r2)
            r7.d = r2
        L68:
            java.lang.String r1 = r1.a
            eygr r7 = r7.d
            r7.add(r1)
            eyfy r7 = r3.build()
            r7.getClass()
            esun r1 = r6.b
            estr r2 = r6.e
            fccd r7 = (defpackage.fccd) r7
            esrg r1 = r1.b
            r3 = 11
            fatc r2 = defpackage.estr.d(r2, r3)
            r1.a(r2)
            esun r1 = r6.b
            r6.a = r4
            essk r1 = r1.a
            java.lang.Object r7 = r1.k(r7, r6)
            if (r7 != r0) goto L94
            goto L95
        L94:
            return r7
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esuj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new esuj(this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
