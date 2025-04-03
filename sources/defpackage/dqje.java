package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqje extends ffhv implements ffji {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ dqji f;
    final /* synthetic */ Iterable g;
    final /* synthetic */ Instant h;
    final /* synthetic */ dqgm i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqje(dqji dqjiVar, Iterable iterable, Instant instant, dqgm dqgmVar, int i, ffgu ffguVar) {
        super(1, ffguVar);
        this.f = dqjiVar;
        this.g = iterable;
        this.h = instant;
        this.i = dqgmVar;
        this.j = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        if (r10 == false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:5:0x0063, B:7:0x0067, B:9:0x006b, B:11:0x0073, B:13:0x007f, B:14:0x0085, B:19:0x006f), top: B:4:0x0063 }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.e
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/libraries/compose/core/data/usage/FrecencyProcessor$computeFrecent$2"
            java.lang.String r4 = "FrecencyProcessor.kt"
            r5 = 0
            if (r1 == 0) goto L19
            int r0 = r9.d
            java.lang.Object r1 = r9.c
            java.lang.Object r6 = r9.b
            java.lang.Object r7 = r9.a
            defpackage.ffci.b(r10)
            goto L63
        L19:
            defpackage.ffci.b(r10)
            dqji r10 = r9.f
            java.lang.Iterable r1 = r9.g
            j$.time.Instant r6 = r9.h
            dqgm r7 = r9.i
            dqjc r8 = new dqjc
            r8.<init>()
            dqkk r10 = r10.c
            java.lang.String r1 = "FrecencyProcessor#computeFrecencyScores"
            java.lang.Object r10 = r10.e(r1, r8)
            r7 = r10
            java.util.Map r7 = (java.util.Map) r7
            enru r10 = defpackage.dqji.a
            ensk r10 = r10.f()
            r1 = 55
            ensk r10 = r10.h(r3, r2, r1, r4)
            enrr r10 = (defpackage.enrr) r10
            int r1 = r7.size()
            java.lang.String r6 = "Number of scores: %x"
            r10.r(r6, r1)
            dqji r1 = r9.f
            int r10 = r9.j
            r9.a = r7
            fgjb r6 = r1.e
            r9.b = r6
            r9.c = r1
            r9.d = r10
            r8 = 1
            r9.e = r8
            java.lang.Object r8 = r6.a(r5, r9)
            if (r8 == r0) goto Lb3
            r0 = r10
        L63:
            boolean r10 = r7 instanceof java.util.Map     // Catch: java.lang.Throwable -> Lae
            if (r10 == 0) goto L6f
            boolean r10 = r7 instanceof defpackage.fflg     // Catch: java.lang.Throwable -> Lae
            if (r10 == 0) goto L73
            boolean r10 = r7 instanceof defpackage.fflk     // Catch: java.lang.Throwable -> Lae
            if (r10 != 0) goto L73
        L6f:
            java.util.Map r7 = defpackage.ffew.m(r7)     // Catch: java.lang.Throwable -> Lae
        L73:
            r10 = r1
            dqji r10 = (defpackage.dqji) r10     // Catch: java.lang.Throwable -> Lae
            r10.f = r7     // Catch: java.lang.Throwable -> Lae
            r10 = r1
            dqji r10 = (defpackage.dqji) r10     // Catch: java.lang.Throwable -> Lae
            java.util.Map r10 = r10.f     // Catch: java.lang.Throwable -> Lae
            if (r10 != 0) goto L85
            java.lang.String r10 = "scores"
            defpackage.ffkj.c(r10)     // Catch: java.lang.Throwable -> Lae
            r10 = r5
        L85:
            dqji r1 = (defpackage.dqji) r1     // Catch: java.lang.Throwable -> Lae
            ffnl r10 = r1.e(r10, r0)     // Catch: java.lang.Throwable -> Lae
            r6.b(r5)
            enru r0 = defpackage.dqji.a
            ensk r0 = r0.f()
            r1 = 62
            ensk r0 = r0.h(r3, r2, r1, r4)
            enrr r0 = (defpackage.enrr) r0
            java.util.Iterator r1 = r10.a()
            boolean r1 = r1.hasNext()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "Has computed frecents: %b"
            r0.t(r2, r1)
            return r10
        Lae:
            r10 = move-exception
            r6.b(r5)
            throw r10
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqje.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqje(this.f, this.g, this.h, this.i, this.j, (ffgu) obj).b(ffcu.a);
    }
}
