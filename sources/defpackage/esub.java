package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esub extends ffhv implements ffji {
    int a;
    final /* synthetic */ esun b;
    final /* synthetic */ String c;
    final /* synthetic */ fcek d;
    final /* synthetic */ ests e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esub(esun esunVar, String str, fcek fcekVar, ests estsVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = esunVar;
        this.c = str;
        this.d = fcekVar;
        this.e = estsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        if (r7 == 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0074, code lost:
    
        if (r7 == 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0076, code lost:
    
        if (r7 == 3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        if (r7 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        r1 = r7 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (r1 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r1 == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (r1 == 2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r1 == 3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r7 != 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(java.lang.Integer.toString(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        r7 = defpackage.esut.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        r7 = defpackage.esut.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        r7 = defpackage.esut.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        r7 = defpackage.esut.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        r7 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0018, code lost:
    
        if (r7 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0068, code lost:
    
        if (r7 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006b, code lost:
    
        r7 = ((defpackage.fcky) r7).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        if (r7 == 0) goto L20;
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
            r2 = 2
            r3 = 1
            defpackage.ffci.b(r7)
            if (r1 == 0) goto Le
            if (r1 == r3) goto L1a
            goto L6b
        Le:
            esun r7 = r6.b
            java.lang.String r1 = r6.c
            r6.a = r3
            java.lang.Object r7 = defpackage.esun.l(r7, r1, r6)
            if (r7 == r0) goto Lb7
        L1a:
            fcek r1 = r6.d
            fcfo r7 = (defpackage.fcfo) r7
            fckw r4 = defpackage.fckw.a
            eyfq r4 = r4.createBuilder()
            fckv r4 = (defpackage.fckv) r4
            r4.getClass()
            r7.getClass()
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r4.instance
            fckw r5 = (defpackage.fckw) r5
            r5.c = r7
            int r7 = r5.b
            r7 = r7 | r3
            r5.b = r7
            r4.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r7 = r4.instance
            fckw r7 = (defpackage.fckw) r7
            r7.d = r1
            int r1 = r7.b
            r1 = r1 | r2
            r7.b = r1
            eyfy r7 = r4.build()
            r7.getClass()
            esun r1 = r6.b
            ests r4 = r6.e
            fckw r7 = (defpackage.fckw) r7
            esrg r1 = r1.b
            fatc r4 = r4.b()
            r1.a(r4)
            esun r1 = r6.b
            r6.a = r2
            essk r1 = r1.a
            java.lang.Object r7 = r1.g(r7, r6)
            if (r7 != r0) goto L6b
            goto Lb7
        L6b:
            fcky r7 = (defpackage.fcky) r7
            int r7 = r7.b
            r0 = 3
            if (r7 == 0) goto L80
            if (r7 == r3) goto L7e
            if (r7 == r2) goto L7c
            if (r7 == r0) goto L7a
            r7 = 0
            goto L81
        L7a:
            r7 = 5
            goto L81
        L7c:
            r7 = 4
            goto L81
        L7e:
            r7 = r0
            goto L81
        L80:
            r7 = r2
        L81:
            if (r7 != 0) goto L84
            r7 = r3
        L84:
            int r1 = r7 + (-2)
            if (r1 == 0) goto Lb1
            if (r1 == r3) goto Lae
            if (r1 == r2) goto Lab
            if (r1 == r0) goto La8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            if (r7 != r3) goto L9a
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't get the number of an unknown enum value."
            r7.<init>(r0)
            throw r7
        L9a:
            java.lang.String r7 = java.lang.Integer.toString(r1)
            java.lang.String r1 = "unknown enum value: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        La8:
            esut r7 = defpackage.esut.d
            goto Lb3
        Lab:
            esut r7 = defpackage.esut.c
            goto Lb3
        Lae:
            esut r7 = defpackage.esut.b
            goto Lb3
        Lb1:
            esut r7 = defpackage.esut.a
        Lb3:
            r7.getClass()
            return r7
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esub.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new esub(this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
