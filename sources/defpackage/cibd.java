package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cibd implements ciab {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindSessionStateListener");
    public final chhm a;
    public final Object b;
    private final eisx d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public cibd(eisx eisxVar, chhm chhmVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.d = eisxVar;
        this.a = chhmVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.b = new Object();
    }

    @Override // defpackage.ciab
    public final void a() {
        this.a.b(this.b);
        this.a.d();
    }

    @Override // defpackage.ciab
    public final void b() {
        elfl c2;
        Object b = this.g.b();
        b.getClass();
        c2 = axol.c((ffsk) b, ffhe.a, ffsm.a, new cibc(this, null));
        axnw.i(c2, new Consumer() { // from class: ciba
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue()) {
                    cibd cibdVar = cibd.this;
                    cibdVar.a.g(null);
                    cibdVar.a.f(cibdVar.b);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, erpp.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:11:0x0026, B:12:0x004f, B:16:0x0069, B:19:0x0070, B:22:0x0085, B:24:0x0061, B:28:0x0035), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cibb
            if (r0 == 0) goto L13
            r0 = r6
            cibb r0 = (defpackage.cibb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cibb r0 = new cibb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            cibd r0 = r0.d
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L8a
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.ffci.b(r6)
            ffbr r6 = r5.e     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L8a
            eixo r6 = (defpackage.eixo) r6     // Catch: java.lang.Throwable -> L8a
            eisx r2 = r5.d     // Catch: java.lang.Throwable -> L8a
            com.google.common.util.concurrent.ListenableFuture r6 = r6.c(r2)     // Catch: java.lang.Throwable -> L8a
            r0.d = r5     // Catch: java.lang.Throwable -> L8a
            r0.c = r4     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)     // Catch: java.lang.Throwable -> L8a
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            eixn r6 = (defpackage.eixn) r6     // Catch: java.lang.Throwable -> L8a
            eixz r1 = r6.b()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = r1.k     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "pseudonymous"
            boolean r1 = defpackage.ffkj.e(r1, r2)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L61
            r6 = 0
            goto L67
        L61:
            eixz r6 = r6.b()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = r6.g     // Catch: java.lang.Throwable -> L8a
        L67:
            if (r6 == 0) goto L85
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L8a
            if (r1 != 0) goto L70
            goto L85
        L70:
            ffbr r0 = r0.f     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L8a
            bzgd r0 = (defpackage.bzgd) r0     // Catch: java.lang.Throwable -> L8a
            j$.util.Optional r6 = j$.util.Optional.of(r6)     // Catch: java.lang.Throwable -> L8a
            boolean r6 = r0.q(r6)     // Catch: java.lang.Throwable -> L8a
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L8a
            return r6
        L85:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L8a
            return r6
        L8a:
            r6 = move-exception
            enru r0 = defpackage.cibd.c
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleGDitto"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensk r6 = r0.g(r6)
            java.lang.String r0 = "checkIfGaiaPairingExists"
            r1 = 83
            java.lang.String r2 = "com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindSessionStateListener"
            java.lang.String r4 = "GaiaDittoBindSessionStateListener.kt"
            ensk r6 = r6.h(r2, r0, r1, r4)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r0 = "Not able to check if any active Gaia paired device"
            r6.q(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cibd.c(ffgu):java.lang.Object");
    }
}
