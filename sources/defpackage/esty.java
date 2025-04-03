package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esty extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ esun c;
    final /* synthetic */ String d;
    final /* synthetic */ esqu e;
    final /* synthetic */ estj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esty(esun esunVar, String str, esqu esquVar, estj estjVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = esunVar;
        this.d = str;
        this.e = esquVar;
        this.f = estjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r7 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
    
        if (r7 != r0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008b  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r2) goto L12
            java.lang.Object r0 = r6.a
            defpackage.ffci.b(r7)
            goto L85
        L12:
            defpackage.ffci.b(r7)
            goto L66
        L16:
            defpackage.ffci.b(r7)
            goto L29
        L1a:
            defpackage.ffci.b(r7)
            esun r7 = r6.c
            java.lang.String r1 = r6.d
            r6.b = r3
            java.lang.Object r7 = defpackage.esun.l(r7, r1, r6)
            if (r7 == r0) goto L97
        L29:
            esqu r1 = r6.e
            fcfo r7 = (defpackage.fcfo) r7
            r6.b = r2
            fchg r4 = defpackage.fchg.a
            eyfq r4 = r4.createBuilder()
            fchf r4 = (defpackage.fchf) r4
            r4.getClass()
            r7.getClass()
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r4.instance
            fchg r5 = (defpackage.fchg) r5
            r5.c = r7
            int r7 = r5.b
            r7 = r7 | r3
            r5.b = r7
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r7 = r4.instance
            fchg r7 = (defpackage.fchg) r7
            fcek r1 = r1.a
            r7.d = r1
            int r1 = r7.b
            r1 = r1 | r2
            r7.b = r1
            eyfy r7 = r4.build()
            r7.getClass()
            fchg r7 = (defpackage.fchg) r7
            if (r7 == r0) goto L97
        L66:
            esun r1 = r6.c
            estj r2 = r6.f
            esrg r1 = r1.b
            fchg r7 = (defpackage.fchg) r7
            fatc r2 = r2.b()
            r1.a(r2)
            esun r1 = r6.c
            r6.a = r1
            r2 = 3
            r6.b = r2
            essk r2 = r1.a
            java.lang.Object r7 = r2.e(r7, r6)
            if (r7 == r0) goto L97
            r0 = r1
        L85:
            fchi r7 = (defpackage.fchi) r7
            fcho r7 = r7.b
            if (r7 != 0) goto L8d
            fcho r7 = defpackage.fcho.a
        L8d:
            r7.getClass()
            esun r0 = (defpackage.esun) r0
            esqv r7 = defpackage.esun.o(r0, r7)
            return r7
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esty.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new esty(this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
