package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esum extends ffhv implements ffji {
    int a;
    final /* synthetic */ esun b;
    final /* synthetic */ String c;
    final /* synthetic */ esrc d;
    final /* synthetic */ esqu e;
    final /* synthetic */ estj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esum(esun esunVar, String str, esrc esrcVar, esqu esquVar, estj estjVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = esunVar;
        this.c = str;
        this.d = esrcVar;
        this.e = esquVar;
        this.f = estjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a8, code lost:
    
        if (r8 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r8 != r0) goto L10;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.ffci.b(r8)
            if (r1 == r3) goto L23
            if (r1 == r2) goto Laa
            return r8
        L10:
            defpackage.ffci.b(r8)
            esun r8 = r7.b
            java.lang.String r1 = r7.c
            esrc r4 = r7.d
            r7.a = r3
            esqd r4 = r4.c
            java.lang.Object r8 = r8.k(r1, r4, r7)
            if (r8 == r0) goto Lc8
        L23:
            esqu r1 = r7.e
            esrc r4 = r7.d
            fcfo r8 = (defpackage.fcfo) r8
            r7.a = r2
            fcgs r5 = defpackage.fcgs.a
            eyfq r5 = r5.createBuilder()
            fcgr r5 = (defpackage.fcgr) r5
            r5.getClass()
            r8.getClass()
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r6 = r5.instance
            fcgs r6 = (defpackage.fcgs) r6
            r6.c = r8
            int r8 = r6.b
            r8 = r8 | r3
            r6.b = r8
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r8 = r5.instance
            fcgs r8 = (defpackage.fcgs) r8
            fcek r1 = r1.a
            r8.d = r1
            int r1 = r8.b
            r1 = r1 | r2
            r8.b = r1
            fces r8 = defpackage.fces.a
            eyfq r8 = r8.createBuilder()
            fcer r8 = (defpackage.fcer) r8
            r8.getClass()
            fbpe r1 = new fbpe
            r1.<init>(r8)
            este r8 = new este
            r8.<init>()
            estf r2 = new estf
            r2.<init>()
            j$.util.Optional r8 = r4.a
            r8.ifPresent(r2)
            estg r8 = new estg
            r8.<init>()
            esth r2 = new esth
            r2.<init>()
            j$.util.Optional r8 = r4.b
            r8.ifPresent(r2)
            fcer r8 = r1.a
            eyfy r8 = r8.build()
            r8.getClass()
            fces r8 = (defpackage.fces) r8
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r5.instance
            fcgs r1 = (defpackage.fcgs) r1
            r1.e = r8
            int r8 = r1.b
            r8 = r8 | 8
            r1.b = r8
            eyfy r8 = r5.build()
            r8.getClass()
            fcgs r8 = (defpackage.fcgs) r8
            if (r8 == r0) goto Lc8
        Laa:
            esun r1 = r7.b
            estj r2 = r7.f
            esrg r1 = r1.b
            fcgs r8 = (defpackage.fcgs) r8
            fatc r2 = r2.b()
            r1.a(r2)
            esun r1 = r7.b
            r2 = 3
            r7.a = r2
            essk r1 = r1.a
            java.lang.Object r8 = r1.b(r8, r7)
            if (r8 != r0) goto Lc7
            goto Lc8
        Lc7:
            return r8
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esum.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new esum(this.b, this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
