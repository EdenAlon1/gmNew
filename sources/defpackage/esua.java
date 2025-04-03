package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esua extends ffhv implements ffji {
    int a;
    final /* synthetic */ esun b;
    final /* synthetic */ String c;
    final /* synthetic */ estj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esua(esun esunVar, String str, estj estjVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = esunVar;
        this.c = str;
        this.d = estjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        r5 = ((defpackage.fche) r5).b;
        r5.getClass();
        r0 = new java.util.ArrayList(defpackage.ffdx.n(r5, 10));
        r5 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if (r5.hasNext() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        r1 = (defpackage.fcek) r5.next();
        r2 = new defpackage.esqg();
        r1.getClass();
        r2.c(r1);
        r0.add(r2.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r5 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001d, code lost:
    
        if (r5 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004a, code lost:
    
        r4.b.b.a(r4.d.b());
        r1 = r4.b;
        r4.a = 3;
        r5 = r1.a.d((defpackage.fchc) r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0064, code lost:
    
        if (r5 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009c, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ffhh] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.Collection] */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.ffci.b(r5)
            if (r1 == r3) goto L1f
            if (r1 == r2) goto L4a
            goto L67
        L10:
            defpackage.ffci.b(r5)
            esun r5 = r4.b
            java.lang.String r1 = r4.c
            r4.a = r3
            java.lang.Object r5 = defpackage.esun.l(r5, r1, r4)
            if (r5 == r0) goto L9c
        L1f:
            fcfo r5 = (defpackage.fcfo) r5
            r4.a = r2
            fchc r1 = defpackage.fchc.a
            eyfq r1 = r1.createBuilder()
            fchb r1 = (defpackage.fchb) r1
            r1.getClass()
            r5.getClass()
            r1.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r2 = r1.instance
            fchc r2 = (defpackage.fchc) r2
            r2.c = r5
            int r5 = r2.b
            r5 = r5 | r3
            r2.b = r5
            eyfy r5 = r1.build()
            r5.getClass()
            fchc r5 = (defpackage.fchc) r5
            if (r5 == r0) goto L9c
        L4a:
            esun r1 = r4.b
            estj r2 = r4.d
            esrg r1 = r1.b
            fchc r5 = (defpackage.fchc) r5
            fatc r2 = r2.b()
            r1.a(r2)
            esun r1 = r4.b
            r2 = 3
            r4.a = r2
            essk r1 = r1.a
            java.lang.Object r5 = r1.d(r5, r4)
            if (r5 != r0) goto L67
            goto L9c
        L67:
            fche r5 = (defpackage.fche) r5
            eygr r5 = r5.b
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ffdx.n(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L7d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L9c
            java.lang.Object r1 = r5.next()
            fcek r1 = (defpackage.fcek) r1
            esqg r2 = new esqg
            r2.<init>()
            r1.getClass()
            r2.c(r1)
            esqu r1 = r2.a()
            r0.add(r1)
            goto L7d
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esua.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new esua(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
