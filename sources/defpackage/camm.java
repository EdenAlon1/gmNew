package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camm {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/rpc/IdentityBoundRealTachyonRegistrationRpc");
    public final awui a;
    public final ffbr b;
    public final ffsk c;
    private final fazb e;

    public camm(awui awuiVar, fazb fazbVar, ffbr ffbrVar, ffsk ffskVar) {
        fazbVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = awuiVar;
        this.e = fazbVar;
        this.b = ffbrVar;
        this.c = ffskVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[Catch: fedn -> 0x0029, TryCatch #0 {fedn -> 0x0029, blocks: (B:11:0x0025, B:12:0x0054, B:13:0x0079, B:15:0x007f, B:17:0x0089, B:19:0x008b, B:22:0x00a3, B:29:0x0037), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.chyf r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.camk
            if (r0 == 0) goto L13
            r0 = r8
            camk r0 = (defpackage.camk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            camk r0 = new camk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            chyf r7 = r0.d
            defpackage.ffci.b(r8)     // Catch: defpackage.fedn -> L29
            goto L54
        L29:
            r8 = move-exception
            goto Lae
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.ffci.b(r8)
            fazb r8 = r6.e     // Catch: defpackage.fedn -> L29
            java.lang.Object r8 = r8.b()     // Catch: defpackage.fedn -> L29
            chep r8 = (defpackage.chep) r8     // Catch: defpackage.fedn -> L29
            java.lang.String r2 = "Bugle.Etouffee.LookupRegistered"
            chis r2 = defpackage.chis.c(r2)     // Catch: defpackage.fedn -> L29
            elfl r8 = r8.b(r7, r2)     // Catch: defpackage.fedn -> L29
            r0.d = r7     // Catch: defpackage.fedn -> L29
            r0.c = r3     // Catch: defpackage.fedn -> L29
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)     // Catch: defpackage.fedn -> L29
            if (r8 != r1) goto L54
            return r1
        L54:
            fcaf r8 = (defpackage.fcaf) r8     // Catch: defpackage.fedn -> L29
            java.lang.String r0 = r7.a     // Catch: defpackage.fedn -> L29
            r8.getClass()     // Catch: defpackage.fedn -> L29
            eygr r8 = r8.c     // Catch: defpackage.fedn -> L29
            r8.getClass()     // Catch: defpackage.fedn -> L29
            r1 = 10
            int r1 = defpackage.ffdx.n(r8, r1)     // Catch: defpackage.fedn -> L29
            int r1 = defpackage.ffew.a(r1)     // Catch: defpackage.fedn -> L29
            r2 = 16
            int r1 = defpackage.ffmk.f(r1, r2)     // Catch: defpackage.fedn -> L29
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: defpackage.fedn -> L29
            r2.<init>(r1)     // Catch: defpackage.fedn -> L29
            java.util.Iterator r8 = r8.iterator()     // Catch: defpackage.fedn -> L29
        L79:
            boolean r1 = r8.hasNext()     // Catch: defpackage.fedn -> L29
            if (r1 == 0) goto La3
            java.lang.Object r1 = r8.next()     // Catch: defpackage.fedn -> L29
            fcgc r1 = (defpackage.fcgc) r1     // Catch: defpackage.fedn -> L29
            fcek r4 = r1.b     // Catch: defpackage.fedn -> L29
            if (r4 != 0) goto L8b
            fcek r4 = defpackage.fcek.a     // Catch: defpackage.fedn -> L29
        L8b:
            java.lang.String r4 = r4.c     // Catch: defpackage.fedn -> L29
            eygr r1 = r1.c     // Catch: defpackage.fedn -> L29
            r1.getClass()     // Catch: defpackage.fedn -> L29
            engw r1 = defpackage.engq.a(r1)     // Catch: defpackage.fedn -> L29
            ffcf r5 = new ffcf     // Catch: defpackage.fedn -> L29
            r5.<init>(r4, r1)     // Catch: defpackage.fedn -> L29
            java.lang.Object r1 = r5.a     // Catch: defpackage.fedn -> L29
            java.lang.Object r4 = r5.b     // Catch: defpackage.fedn -> L29
            r2.put(r1, r4)     // Catch: defpackage.fedn -> L29
            goto L79
        La3:
            enhk r8 = defpackage.engq.e(r2)     // Catch: defpackage.fedn -> L29
            camj r1 = new camj     // Catch: defpackage.fedn -> L29
            r2 = 0
            r1.<init>(r3, r0, r8, r2)     // Catch: defpackage.fedn -> L29
            return r1
        Lae:
            enru r0 = defpackage.camm.d
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleEtouffee"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensk r0 = r0.g(r8)
            java.lang.String r1 = "executeRpc"
            r2 = 74
            java.lang.String r3 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/rpc/IdentityBoundRealTachyonRegistrationRpc"
            java.lang.String r4 = "IdentityBoundRealTachyonRegistrationRpc.kt"
            ensk r0 = r0.h(r3, r1, r2, r4)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "Caught StatusRuntimeException, failed to retrieve registration Ids from tachyon"
            r0.q(r1)
            io.grpc.Status r8 = r8.a
            java.lang.String r7 = r7.a
            io.grpc.Status$Code r8 = r8.getCode()
            int r8 = r8.value()
            camj r0 = new camj
            r1 = 3
            enhk r2 = defpackage.enoz.a
            r0.<init>(r1, r7, r2, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.camm.a(chyf, ffgu):java.lang.Object");
    }
}
