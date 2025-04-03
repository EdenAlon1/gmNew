package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esuf extends ffhv implements ffji {
    int a;
    final /* synthetic */ esun b;
    final /* synthetic */ String c;
    final /* synthetic */ fcek d;
    final /* synthetic */ estj e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esuf(esun esunVar, String str, fcek fcekVar, int i, estj estjVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = esunVar;
        this.c = str;
        this.d = fcekVar;
        this.f = i;
        this.e = estjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
    
        if (r8 != r0) goto L8;
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
            r2 = 1
            defpackage.ffci.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            return r8
        Ld:
            esun r8 = r7.b
            java.lang.String r1 = r7.c
            r7.a = r2
            java.lang.Object r8 = defpackage.esun.l(r8, r1, r7)
            if (r8 == r0) goto La3
        L19:
            fcek r1 = r7.d
            int r3 = r7.f
            fcfo r8 = (defpackage.fcfo) r8
            fcal r4 = defpackage.fcal.a
            eyfq r4 = r4.createBuilder()
            fcak r4 = (defpackage.fcak) r4
            r4.getClass()
            r8.getClass()
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r4.instance
            fcal r5 = (defpackage.fcal) r5
            r5.c = r8
            int r8 = r5.b
            r8 = r8 | r2
            r5.b = r8
            eygr r8 = r5.d
            java.util.List r8 = j$.util.DesugarCollections.unmodifiableList(r8)
            r8.getClass()
            r1.getClass()
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r8 = r4.instance
            fcal r8 = (defpackage.fcal) r8
            eygr r5 = r8.d
            boolean r6 = r5.c()
            if (r6 != 0) goto L5c
            eygr r5 = defpackage.eyfy.mutableCopy(r5)
            r8.d = r5
        L5c:
            eygr r8 = r8.d
            r8.add(r1)
            int r8 = r3 + (-1)
            if (r3 == 0) goto La1
            if (r8 == 0) goto L72
            if (r8 != r2) goto L6c
            r8 = 10
            goto L73
        L6c:
            ffcd r8 = new ffcd
            r8.<init>()
            throw r8
        L72:
            r8 = 5
        L73:
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r4.instance
            fcal r1 = (defpackage.fcal) r1
            r1.e = r8
            eyfy r8 = r4.build()
            r8.getClass()
            esun r1 = r7.b
            estj r2 = r7.e
            fcal r8 = (defpackage.fcal) r8
            esrg r1 = r1.b
            fatc r2 = r2.b()
            r1.a(r2)
            esun r1 = r7.b
            r2 = 2
            r7.a = r2
            essk r1 = r1.a
            java.lang.Object r8 = r1.i(r8, r7)
            if (r8 != r0) goto La0
            goto La3
        La0:
            return r8
        La1:
            r8 = 0
            throw r8
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esuf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new esuf(this.b, this.c, this.d, this.f, this.e, (ffgu) obj).b(ffcu.a);
    }
}
