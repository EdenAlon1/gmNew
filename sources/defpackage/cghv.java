package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cghv extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final cggu e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ecrj j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ejvp n;
    private final fazb o;

    public cghv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cggu cgguVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ejvp ejvpVar, ffbr ffbrVar10, ecrj ecrjVar, fazb fazbVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        cgguVar.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ejvpVar.getClass();
        ffbrVar10.getClass();
        ecrjVar.getClass();
        fazbVar.getClass();
        this.k = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = cgguVar;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.l = ffbrVar7;
        this.m = ffbrVar8;
        this.h = ffbrVar9;
        this.n = ejvpVar;
        this.i = ffbrVar10;
        this.j = ecrjVar;
        this.o = fazbVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        ffbr ffbrVar = this.m;
        cetx l = cety.l();
        Object b = ffbrVar.b();
        b.getClass();
        l.g(((Number) b).longValue());
        l.b(cevc.WORKMANAGER_ONLY);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("ParentAllowlistUpdateHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cggw.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cggw cggwVar = (cggw) eyhsVar;
        cggwVar.getClass();
        Object b = this.k.b();
        b.getClass();
        c = axol.c((ffsk) b, ffhe.a, ffsm.a, new cghs(this, cggwVar, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008e -> B:11:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.util.Set r8, java.util.Set r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cghr
            if (r0 == 0) goto L13
            r0 = r10
            cghr r0 = (defpackage.cghr) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            cghr r0 = new cghr
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.c
            java.lang.Object r9 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.ffci.b(r10)
            goto L55
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.d
            java.lang.Object r9 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r10)
            goto L79
        L44:
            defpackage.ffci.b(r10)
            fazb r10 = r7.o
            java.lang.Object r10 = r10.b()
            java.util.Set r10 = (java.util.Set) r10
            java.util.Iterator r10 = r10.iterator()
            r2 = r8
            r8 = r10
        L55:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L93
            java.lang.Object r10 = r8.next()
            cghx r10 = (defpackage.cghx) r10
            defpackage.ffdx.ak(r9)
            r0.a = r2
            r0.b = r9
            r0.c = r8
            r0.d = r10
            r0.g = r4
            java.lang.Object r5 = r10.a()
            if (r5 != r1) goto L75
            goto L92
        L75:
            r5 = r2
            r2 = r9
            r9 = r8
            r8 = r10
        L79:
            java.util.List r10 = defpackage.ffdx.ak(r5)
            r0.a = r5
            r0.b = r2
            r0.c = r9
            r6 = 0
            r0.d = r6
            r0.g = r3
            java.lang.Object r8 = r8.b(r10)
            if (r8 == r1) goto L92
            r8 = r9
            r9 = r2
            r2 = r5
            goto L55
        L92:
            return r1
        L93:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cghv.k(java.util.Set, java.util.Set, ffgu):java.lang.Object");
    }

    public final void l(ecri ecriVar, ecda ecdaVar, ecrh ecrhVar) {
        this.j.f(ecriVar, ecdaVar, null, ecrhVar);
    }

    public final void m() {
        ((cbgf) this.l.b()).c();
        elfl e = elfo.e(null);
        ejui ejuiVar = cghk.a;
        this.n.a(e, cghk.a);
    }
}
