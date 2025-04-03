package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdv extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;

    public djdv(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3) {
        super(fbbfVar2, new fbcd(djdv.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        djeb djebVar = (djeb) obj;
        dktn b = djdq.a.b("produceReceiveMessageResult");
        boolean isPresent = djebVar.b().isPresent();
        fbbm fbbmVar = this.c;
        if (!isPresent) {
            ListenableFuture d = fbbmVar.d();
            dkty.l(b, "producing standalone message, messageId: %s", djebVar.a().isPresent() ? ((dkjt) djebVar.a().get()).k : -1);
            return d;
        }
        if (djebVar.a().isPresent()) {
            ListenableFuture d2 = fbbmVar.d();
            dkty.l(b, "received in-session message, sessionId: %s, messageId: %s", ((dkha) djebVar.b().get()).k, ((dkjt) djebVar.a().get()).k);
            return d2;
        }
        ListenableFuture d3 = this.d.d();
        dkty.l(b, "producing initial message, sessionId: %s", ((dkha) djebVar.b().get()).k);
        return d3;
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
