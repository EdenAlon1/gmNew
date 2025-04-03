package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djev extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;

    public djev(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3) {
        super(fbbfVar2, new fbcd(djev.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
        diyy diyyVar = djeq.a;
        if (sendMessageRequest.b().c() == 2) {
            ListenableFuture d = this.d.d();
            dkty.l(djeq.c, "sending message in group conversation, messageId: %s, conversationId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
            return d;
        }
        ListenableFuture d2 = this.c.d();
        dkty.l(djeq.c, "sending message in 1:1 conversation, messageId: %s, conversationId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
        return d2;
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
