package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnqp b;
    final /* synthetic */ cntl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnqk(ffgu ffguVar, cnqp cnqpVar, cntl cntlVar) {
        super(2, ffguVar);
        this.b = cnqpVar;
        this.c = cntlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnqk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[Catch: all -> 0x000f, TryCatch #4 {all -> 0x000f, blocks: (B:5:0x000b, B:6:0x0034, B:13:0x0044, B:15:0x006d, B:16:0x006f), top: B:4:0x000b }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r0 = r8.d
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L12
            goto L34
        Lf:
            r9 = move-exception
            goto L8b
        L12:
            r9 = move-exception
            goto L44
        L14:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.d
            ffsk r9 = (defpackage.ffsk) r9
            java.lang.String r9 = "DatagramNotificationService.onReceiveDatagram"
            ekzz r9 = defpackage.eleg.f(r9)
            cnqp r1 = r8.b     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            cnng r1 = r1.b     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            cntl r3 = r8.c     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            r8.d = r9     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            r4 = 1
            r8.a = r4     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            java.lang.Object r1 = r1.a(r3, r8)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L40
            if (r1 == r0) goto L3a
            r0 = r9
            r9 = r1
        L34:
            cntn r9 = (defpackage.cntn) r9     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L12
            defpackage.ffig.a(r0, r2)
            goto L85
        L3a:
            return r0
        L3b:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L8b
        L40:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L44:
            enru r1 = defpackage.cnqp.a     // Catch: java.lang.Throwable -> Lf
            ensk r1 = r1.i()     // Catch: java.lang.Throwable -> Lf
            ensn r3 = defpackage.ente.a     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = "BugleSatellite"
            r1.Y(r3, r4)     // Catch: java.lang.Throwable -> Lf
            enrr r1 = (defpackage.enrr) r1     // Catch: java.lang.Throwable -> Lf
            ensk r1 = r1.g(r9)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "com/google/android/apps/messaging/shared/satelliteapi/incoming/datagramnotificationservice/DatagramNotificationServiceImpl$callOnReceiveSatelliteMessage-gIAlu-s$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "invokeSuspend"
            java.lang.String r5 = "DatagramNotificationServiceImpl.kt"
            r6 = 84
            ensk r1 = r1.h(r3, r4, r6, r5)     // Catch: java.lang.Throwable -> Lf
            enrr r1 = (defpackage.enrr) r1     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "Call IncomingSatelliteApi.onReceiveSatelliteMessage failed for datagram[id:%s]"
            cntl r4 = r8.c     // Catch: java.lang.Throwable -> Lf
            cnso r4 = r4.e     // Catch: java.lang.Throwable -> Lf
            if (r4 != 0) goto L6f
            cnso r4 = defpackage.cnso.a     // Catch: java.lang.Throwable -> Lf
        L6f:
            java.lang.String r4 = r4.c     // Catch: java.lang.Throwable -> Lf
            r1.t(r3, r4)     // Catch: java.lang.Throwable -> Lf
            io.grpc.Status r1 = io.grpc.Status.o     // Catch: java.lang.Throwable -> Lf
            io.grpc.Status r9 = r1.d(r9)     // Catch: java.lang.Throwable -> Lf
            io.grpc.StatusException r9 = r9.asException()     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r9 = defpackage.ffci.a(r9)     // Catch: java.lang.Throwable -> Lf
            defpackage.ffig.a(r0, r2)
        L85:
            ffch r0 = new ffch
            r0.<init>(r9)
            return r0
        L8b:
            throw r9     // Catch: java.lang.Throwable -> L8c
        L8c:
            r1 = move-exception
            defpackage.ffig.a(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnqk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnqk cnqkVar = new cnqk(ffguVar, this.b, this.c);
        cnqkVar.d = obj;
        return cnqkVar;
    }
}
