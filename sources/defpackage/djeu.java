package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djeu extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;

    public djeu(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4) {
        super(fbbfVar2, new fbcd(djeu.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        SendMessageRequest sendMessageRequest = (SendMessageRequest) list.get(0);
        djgw djgwVar = (djgw) list.get(1);
        djfv djfvVar = (djfv) list.get(2);
        djcr djcrVar = (djcr) list.get(3);
        diyy diyyVar = djeq.a;
        if (djgwVar.d().isPresent()) {
            Object obj2 = djgwVar.d().get();
            dkjt a = djfvVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d());
            dkty.l(djeq.c, "send message in group session, messageId: %s, sessionId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
            return djcrVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d(), (dkkj) obj2).d(a);
        }
        if (MessageClass.g(sendMessageRequest.d())) {
            eibu e = MessagingOperationResult.e();
            e.b(sendMessageRequest.b());
            e.d(sendMessageRequest.c().h());
            e.e(djhf.b(djgwVar));
            return erqt.i(e.a());
        }
        eibw d = MessagingResult.d();
        d.c(16);
        d.b(6);
        MessagingResult e2 = d.e();
        eibu e3 = MessagingOperationResult.e();
        e3.b(sendMessageRequest.b());
        e3.c(false);
        e3.d(sendMessageRequest.c().h());
        e3.e(e2);
        return erqt.i(e3.a());
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.e;
        fbbm fbbmVar2 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
