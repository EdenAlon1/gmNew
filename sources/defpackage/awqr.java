package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awqr {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/incoming/MultiPartIncomingChatMessageProcessor");
    public final awrh b;
    public final avtx c;
    public final awov d;
    public final errl e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    private final ffbr j;

    public awqr(errl errlVar, awrh awrhVar, avtx avtxVar, awov awovVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.b = awrhVar;
        this.c = avtxVar;
        this.d = awovVar;
        this.e = errlVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.j = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
    }

    public static eqxi b(int i) {
        eqxh eqxhVar = (eqxh) eqxi.a.createBuilder();
        eqxj eqxjVar = (eqxj) eqxk.a.createBuilder();
        eqwy eqwyVar = eqwy.CHAT_API_FAILED_PERMANENTLY;
        eqxjVar.copyOnWrite();
        eqxk eqxkVar = (eqxk) eqxjVar.instance;
        eqxkVar.g = eqwyVar.f;
        eqxkVar.b |= 16;
        eqxjVar.copyOnWrite();
        eqxk eqxkVar2 = (eqxk) eqxjVar.instance;
        eqxkVar2.h = i - 1;
        eqxkVar2.b |= 32;
        eqxhVar.copyOnWrite();
        eqxi eqxiVar = (eqxi) eqxhVar.instance;
        eqxk eqxkVar3 = (eqxk) eqxjVar.build();
        eqxkVar3.getClass();
        eqxiVar.c = eqxkVar3;
        eqxiVar.b |= 1;
        return (eqxi) eqxhVar.build();
    }

    final elfl a(final awxo awxoVar) {
        ekzz f = eleg.f("MultiPartIncomingChatMessageProcessor#process");
        try {
            ekzz f2 = eleg.f("MultiPartIncomingChatMessageProcessor#ensureProvisioningEngineIsInitialized");
            try {
                elfl g = elfl.g(((djrv) this.j.b()).h());
                f2.b(g);
                f2.close();
                elfl i = g.i(new eroh() { // from class: awqq
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0260  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x0291  */
                    @Override // defpackage.eroh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r19) {
                        /*
                            Method dump skipped, instructions count: 1265
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.awqq.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                    }
                }, this.e);
                f.b(i);
                f.close();
                return i;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
