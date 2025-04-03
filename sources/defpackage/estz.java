package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class estz extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ esun c;
    final /* synthetic */ String d;
    final /* synthetic */ Iterable e;
    final /* synthetic */ estj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public estz(esun esunVar, String str, Iterable iterable, estj estjVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = esunVar;
        this.d = str;
        this.e = iterable;
        this.f = estjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r7 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002b, code lost:
    
        if (r7 != r0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d5 A[LOOP:0: B:7:0x00cf->B:9:0x00d5, LOOP_END] */
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
            r2 = 10
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L15
            java.lang.Object r0 = r6.a
            defpackage.ffci.b(r7)
            goto Lbb
        L15:
            defpackage.ffci.b(r7)
            goto L9c
        L1a:
            defpackage.ffci.b(r7)
            goto L2d
        L1e:
            defpackage.ffci.b(r7)
            esun r7 = r6.c
            java.lang.String r1 = r6.d
            r6.b = r4
            java.lang.Object r7 = defpackage.esun.l(r7, r1, r6)
            if (r7 == r0) goto Lea
        L2d:
            java.lang.Iterable r1 = r6.e
            fcfo r7 = (defpackage.fcfo) r7
            r6.b = r3
            fchk r3 = defpackage.fchk.a
            eyfq r3 = r3.createBuilder()
            fchj r3 = (defpackage.fchj) r3
            r3.getClass()
            r7.getClass()
            r3.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r3.instance
            fchk r5 = (defpackage.fchk) r5
            r5.c = r7
            int r7 = r5.b
            r7 = r7 | r4
            r5.b = r7
            eygr r7 = r5.d
            java.util.List r7 = j$.util.DesugarCollections.unmodifiableList(r7)
            r7.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            int r4 = defpackage.ffdx.n(r1, r2)
            r7.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L77
            java.lang.Object r4 = r1.next()
            esqu r4 = (defpackage.esqu) r4
            fcek r4 = r4.a
            r7.add(r4)
            goto L65
        L77:
            r3.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r3.instance
            fchk r1 = (defpackage.fchk) r1
            eygr r4 = r1.d
            boolean r5 = r4.c()
            if (r5 != 0) goto L8c
            eygr r4 = defpackage.eyfy.mutableCopy(r4)
            r1.d = r4
        L8c:
            eygr r1 = r1.d
            defpackage.eydl.addAll(r7, r1)
            eyfy r7 = r3.build()
            r7.getClass()
            fchk r7 = (defpackage.fchk) r7
            if (r7 == r0) goto Lea
        L9c:
            esun r1 = r6.c
            estj r3 = r6.f
            esrg r1 = r1.b
            fchk r7 = (defpackage.fchk) r7
            fatc r3 = r3.b()
            r1.a(r3)
            esun r1 = r6.c
            r6.a = r1
            r3 = 3
            r6.b = r3
            essk r3 = r1.a
            java.lang.Object r7 = r3.f(r7, r6)
            if (r7 == r0) goto Lea
            r0 = r1
        Lbb:
            fchm r7 = (defpackage.fchm) r7
            eygr r7 = r7.b
            r7.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.ffdx.n(r7, r2)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        Lcf:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Le9
            java.lang.Object r2 = r7.next()
            fcho r2 = (defpackage.fcho) r2
            r2.getClass()
            r3 = r0
            esun r3 = (defpackage.esun) r3
            esqv r2 = defpackage.esun.o(r3, r2)
            r1.add(r2)
            goto Lcf
        Le9:
            return r1
        Lea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.estz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new estz(this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
