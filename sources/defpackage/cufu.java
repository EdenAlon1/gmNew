package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufu {
    private static final cfup a = cfvl.i(cfvl.b, "enable_spam_clearcut_logging", true);
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final cqoh e;
    private final ffsk f;

    public cufu(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        cqohVar.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = cqohVar;
        this.f = ffskVar;
    }

    private final long c(long j) {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.erdl r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cuft
            if (r0 == 0) goto L13
            r0 = r7
            cuft r0 = (defpackage.cuft) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuft r0 = new cuft
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            erdl r6 = r0.e
            cufu r0 = r0.d
            defpackage.ffci.b(r7)
            goto L5a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            cfup r7 = defpackage.cufu.a
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto La1
            ffbr r7 = r5.d
            java.lang.Object r7 = r7.b()
            aleo r7 = (defpackage.aleo) r7
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            r0 = r5
        L5a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L63
            goto La1
        L63:
            ffbr r7 = r0.c
            java.lang.Object r7 = r7.b()
            dfld r7 = (defpackage.dfld) r7
            ffbr r1 = r0.b
            java.lang.Object r1 = r1.b()
            android.content.Context r1 = (android.content.Context) r1
            erdm r2 = new erdm
            r2.<init>()
            dfmh r1 = defpackage.dtql.b(r1, r2)
            dflc r6 = r7.j(r6, r1)
            cqoh r7 = r0.e
            j$.time.Instant r7 = r7.f()
            long r1 = r7.toEpochMilli()
            long r1 = r0.c(r1)
            cqoh r7 = r0.e
            long r3 = r7.a()
            long r3 = r0.c(r3)
            r6.j(r1, r3)
            r6.c()
            ffcu r6 = defpackage.ffcu.a
            return r6
        La1:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cufu.a(erdl, ffgu):java.lang.Object");
    }

    public final void b(erdl erdlVar) {
        axol.k(this.f, null, new cufs(this, erdlVar, null), 3);
    }
}
