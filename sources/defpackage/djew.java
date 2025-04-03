package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djew extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;

    public djew(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4) {
        super(fbbfVar2, new fbcd(djew.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
        diyy diyyVar = djeq.a;
        if (dizg.E() && eigz.MESSAGING_METHOD_SLM.equals(sendMessageRequest.g())) {
            fbbm fbbmVar = this.e;
            dkty.l(djeq.c, "sending SLM Message, messageId: %s", sendMessageRequest.c().h());
            return fbbmVar.d();
        }
        if (MessageClass.h(sendMessageRequest.d())) {
            fbbm fbbmVar2 = this.c;
            dkty.l(djeq.c, "sending 1:1 message in new session, messageId: %s, sessionId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
            return fbbmVar2.d();
        }
        fbbm fbbmVar3 = this.d;
        dkty.l(djeq.c, "sending 1:1 message in existing session, messageId: %s, sessionId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
        return fbbmVar3.d();
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
