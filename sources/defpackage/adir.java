package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adir implements ahrc {
    public final Optional a;
    public final ffbr b;
    public final ejvb c;
    public final atxw d;
    private final ffsk e;
    private eisx f;

    public adir(ffsk ffskVar, Optional optional, ffbr ffbrVar, ejvb ejvbVar, atxw atxwVar) {
        ffskVar.getClass();
        optional.getClass();
        ffbrVar.getClass();
        ejvbVar.getClass();
        this.e = ffskVar;
        this.a = optional;
        this.b = ffbrVar;
        this.c = ejvbVar;
        this.d = atxwVar;
    }

    @Override // defpackage.ahrc
    public final void a(eisx eisxVar) {
        if (this.a.isEmpty() || ffkj.e(eisxVar, this.f)) {
            return;
        }
        this.f = eisxVar;
        axol.k(this.e, null, new adip(this, eisxVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:11:0x0026, B:12:0x0057, B:13:0x0060, B:15:0x0066, B:19:0x0079, B:29:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.eisx r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.adiq
            if (r0 == 0) goto L13
            r0 = r8
            adiq r0 = (defpackage.adiq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            adiq r0 = new adiq
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.Object r7 = r0.a
            defpackage.ffci.b(r8)     // Catch: java.lang.Exception -> L7c
            goto L57
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.ffci.b(r8)
            ejvb r8 = r6.c     // Catch: java.lang.Exception -> L7c
            ffbr r2 = r6.b     // Catch: java.lang.Exception -> L7c
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Exception -> L7c
            eixo r2 = (defpackage.eixo) r2     // Catch: java.lang.Exception -> L7c
            ejuh r2 = r2.b()     // Catch: java.lang.Exception -> L7c
            ejwa r5 = defpackage.ejwa.DONT_CARE     // Catch: java.lang.Exception -> L7c
            com.google.common.util.concurrent.ListenableFuture r8 = r8.b(r2, r5)     // Catch: java.lang.Exception -> L7c
            r8.getClass()     // Catch: java.lang.Exception -> L7c
            r0.a = r7     // Catch: java.lang.Exception -> L7c
            r0.d = r4     // Catch: java.lang.Exception -> L7c
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)     // Catch: java.lang.Exception -> L7c
            if (r8 != r1) goto L57
            return r1
        L57:
            r8.getClass()     // Catch: java.lang.Exception -> L7c
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Exception -> L7c
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L7c
        L60:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L78
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Exception -> L7c
            r1 = r0
            eixn r1 = (defpackage.eixn) r1     // Catch: java.lang.Exception -> L7c
            eisx r1 = r1.a()     // Catch: java.lang.Exception -> L7c
            boolean r1 = defpackage.ffkj.e(r1, r7)     // Catch: java.lang.Exception -> L7c
            if (r1 == 0) goto L60
            goto L79
        L78:
            r0 = r3
        L79:
            eixn r0 = (defpackage.eixn) r0     // Catch: java.lang.Exception -> L7c
            return r0
        L7c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adir.b(eisx, ffgu):java.lang.Object");
    }
}
