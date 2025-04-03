package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esuh extends ffhv implements ffji {
    int a;
    final /* synthetic */ esun b;
    final /* synthetic */ String c;
    final /* synthetic */ esqu d;
    final /* synthetic */ Iterable e;
    final /* synthetic */ estj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esuh(esun esunVar, String str, esqu esquVar, Iterable iterable, estj estjVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = esunVar;
        this.c = str;
        this.d = esquVar;
        this.e = iterable;
        this.f = estjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a6, code lost:
    
        return ((defpackage.fchx) r8).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
    
        if (r8 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        if (r8 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0085, code lost:
    
        r7.b.b.a(r7.f.b());
        r1 = r7.b;
        r7.a = 3;
        r8 = r1.a.j((defpackage.fchv) r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x009f, code lost:
    
        if (r8 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a7, code lost:
    
        return r0;
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
            if (r1 == 0) goto L11
            defpackage.ffci.b(r8)
            if (r1 == r3) goto L20
            if (r1 == r2) goto L85
            goto La2
        L11:
            defpackage.ffci.b(r8)
            esun r8 = r7.b
            java.lang.String r1 = r7.c
            r7.a = r3
            java.lang.Object r8 = defpackage.esun.l(r8, r1, r7)
            if (r8 == r0) goto La7
        L20:
            esqu r1 = r7.d
            java.lang.Iterable r4 = r7.e
            fcfo r8 = (defpackage.fcfo) r8
            r7.a = r2
            fchv r5 = defpackage.fchv.a
            eyfq r5 = r5.createBuilder()
            fchu r5 = (defpackage.fchu) r5
            r5.getClass()
            r8.getClass()
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r6 = r5.instance
            fchv r6 = (defpackage.fchv) r6
            r6.c = r8
            int r8 = r6.b
            r8 = r8 | r3
            r6.b = r8
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r8 = r5.instance
            fchv r8 = (defpackage.fchv) r8
            fcek r1 = r1.a
            r8.d = r1
            int r1 = r8.b
            r1 = r1 | r2
            r8.b = r1
            eygr r8 = r8.e
            java.util.List r8 = j$.util.DesugarCollections.unmodifiableList(r8)
            r8.getClass()
            r4.getClass()
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r8 = r5.instance
            fchv r8 = (defpackage.fchv) r8
            eygr r1 = r8.e
            boolean r2 = r1.c()
            if (r2 != 0) goto L75
            eygr r1 = defpackage.eyfy.mutableCopy(r1)
            r8.e = r1
        L75:
            eygr r8 = r8.e
            defpackage.eydl.addAll(r4, r8)
            eyfy r8 = r5.build()
            r8.getClass()
            fchv r8 = (defpackage.fchv) r8
            if (r8 == r0) goto La7
        L85:
            esun r1 = r7.b
            estj r2 = r7.f
            esrg r1 = r1.b
            fchv r8 = (defpackage.fchv) r8
            fatc r2 = r2.b()
            r1.a(r2)
            esun r1 = r7.b
            r2 = 3
            r7.a = r2
            essk r1 = r1.a
            java.lang.Object r8 = r1.j(r8, r7)
            if (r8 != r0) goto La2
            goto La7
        La2:
            fchx r8 = (defpackage.fchx) r8
            eygr r8 = r8.b
            return r8
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esuh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new esuh(this.b, this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
