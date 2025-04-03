package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwdi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwdp b;
    final /* synthetic */ aoku c;
    final /* synthetic */ aqux d;
    final /* synthetic */ ffjn e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwdi(ffgu ffguVar, cwdp cwdpVar, aoku aokuVar, aqux aquxVar, ffjn ffjnVar) {
        super(2, ffguVar);
        this.b = cwdpVar;
        this.c = aokuVar;
        this.d = aquxVar;
        this.e = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwdi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        if (r2.e(r9, r3, r8) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r9 != r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L20
            if (r1 == r2) goto L18
            java.lang.Object r0 = r8.f
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L15
            goto Lbc
        L15:
            r9 = move-exception
            goto Lc8
        L18:
            java.lang.Object r1 = r8.f
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L28
            goto L6a
        L20:
            java.lang.Object r1 = r8.f
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L28
            goto L50
        L28:
            r9 = move-exception
            r0 = r1
            goto Lc8
        L2c:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.f
            ffsk r9 = (defpackage.ffsk) r9
            java.lang.String r9 = "ChatStarterImpl.startChat"
            ekzz r9 = defpackage.eleg.f(r9)
            cwdp r1 = r8.b     // Catch: java.lang.Throwable -> Lc4
            cwdu r1 = r1.f     // Catch: java.lang.Throwable -> Lc4
            aoku r4 = r8.c     // Catch: java.lang.Throwable -> Lc4
            aqux r5 = r8.d     // Catch: java.lang.Throwable -> Lc4
            ffjn r6 = r8.e     // Catch: java.lang.Throwable -> Lc4
            r8.f = r9     // Catch: java.lang.Throwable -> Lc4
            r8.a = r3     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r1 = r1.a(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> Lc4
            if (r1 == r0) goto Lc3
            r7 = r1
            r1 = r9
            r9 = r7
        L50:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L28
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L28
            if (r9 == 0) goto L5a
        L58:
            r0 = r1
            goto Lbc
        L5a:
            cwdp r9 = r8.b     // Catch: java.lang.Throwable -> L28
            aoku r3 = r8.c     // Catch: java.lang.Throwable -> L28
            aqux r4 = r8.d     // Catch: java.lang.Throwable -> L28
            r8.f = r1     // Catch: java.lang.Throwable -> L28
            r8.a = r2     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = r9.d(r3, r4, r8)     // Catch: java.lang.Throwable -> L28
            if (r9 == r0) goto Lc3
        L6a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L28
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L28
            if (r9 == 0) goto L73
            goto Lbb
        L73:
            enru r9 = defpackage.cwdp.a     // Catch: java.lang.Throwable -> L28
            ensk r9 = r9.h()     // Catch: java.lang.Throwable -> L28
            ensn r2 = defpackage.ente.a     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "BugleContacts"
            r9.Y(r2, r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$startChatInternal$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "ChatStarterImpl.kt"
            r5 = 111(0x6f, float:1.56E-43)
            ensk r9 = r9.h(r2, r3, r5, r4)     // Catch: java.lang.Throwable -> L28
            enrr r9 = (defpackage.enrr) r9     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "Starting 1-1 chat: %s"
            aoku r3 = r8.c     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = defpackage.cskt.c(r3)     // Catch: java.lang.Throwable -> L28
            r9.t(r2, r3)     // Catch: java.lang.Throwable -> L28
            cwdp r9 = r8.b     // Catch: java.lang.Throwable -> L28
            cwds r9 = r9.i     // Catch: java.lang.Throwable -> L28
            aoku r2 = r8.c     // Catch: java.lang.Throwable -> L28
            cwdd r9 = r9.b(r2)     // Catch: java.lang.Throwable -> L28
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r9 = r9.a     // Catch: java.lang.Throwable -> L28
            engw r9 = defpackage.engw.r(r9)     // Catch: java.lang.Throwable -> L28
            cwdp r2 = r8.b     // Catch: java.lang.Throwable -> L28
            r9.getClass()     // Catch: java.lang.Throwable -> L28
            aqux r3 = r8.d     // Catch: java.lang.Throwable -> L28
            r8.f = r1     // Catch: java.lang.Throwable -> L28
            r4 = 3
            r8.a = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = r2.e(r9, r3, r8)     // Catch: java.lang.Throwable -> L28
            if (r9 == r0) goto Lc3
        Lbb:
            goto L58
        Lbc:
            r9 = 0
            defpackage.ffig.a(r0, r9)
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lc3:
            return r0
        Lc4:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        Lc8:
            throw r9     // Catch: java.lang.Throwable -> Lc9
        Lc9:
            r1 = move-exception
            defpackage.ffig.a(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwdi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cwdi cwdiVar = new cwdi(ffguVar, this.b, this.c, this.d, this.e);
        cwdiVar.f = obj;
        return cwdiVar;
    }
}
