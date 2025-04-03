package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djer extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;
    private final fbbm f;

    public djer(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4, fbbm fbbmVar5) {
        super(fbbfVar2, new fbcd(djer.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
        this.f = fbbz.c(fbbmVar5);
    }

    @Override // defpackage.fbbs
    public final /* synthetic */ ListenableFuture b(Object obj) {
        djhe a;
        List list = (List) obj;
        SendMessageRequest sendMessageRequest = (SendMessageRequest) list.get(0);
        djfv djfvVar = (djfv) list.get(1);
        djhc djhcVar = (djhc) list.get(2);
        djcq djcqVar = (djcq) list.get(3);
        djcr djcrVar = (djcr) list.get(4);
        diyy diyyVar = djeq.a;
        String h = sendMessageRequest.c().h();
        Conversation b = sendMessageRequest.b();
        String c = djhc.c(b);
        dkty.c("Using session key for outgoing session: %s", dktx.PHONE_NUMBER.c(c));
        synchronized (djhcVar.b) {
            dkty.c("Looking up session key: %s in  sessions: %s", dktx.PHONE_NUMBER.c(c), djhcVar.c.values());
            dkkj dkkjVar = (dkkj) djhcVar.c.get(c);
            djgn djgnVar = new djgn();
            if (dkkjVar == null) {
                dkkjVar = djhcVar.a.createOutgoingSession(djhf.f(b.a()));
                dkkjVar.aF(new djhb(djhcVar, c, dkkjVar));
                djhcVar.c.put(c, dkkjVar);
                djgnVar.a = 1;
            } else {
                djgnVar.a = 2;
            }
            djgnVar.b(dkkjVar);
            a = djgnVar.a();
        }
        djgo djgoVar = (djgo) a;
        dkkj dkkjVar2 = djgoVar.a;
        dkty.l(djeq.c.b("produceSendSessionCreationalOneToOneMessage"), "created new or get existing outgoing session via session store with result: %s", a);
        djeo a2 = djcrVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d(), dkkjVar2);
        int i = djgoVar.b - 1;
        if (i != 0) {
            if (i == 1) {
                dkty.d(djeq.c, "Sending message [%s] in existing session [%s]", h, sendMessageRequest.b());
                return djac.n() ? a2.q(djfvVar.c(sendMessageRequest.b(), sendMessageRequest.c(), Optional.of(sendMessageRequest.d()))) : a2.d(djfvVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d()));
            }
            eibw d = MessagingResult.d();
            d.c(16);
            MessagingResult e = d.e();
            eibu e2 = MessagingOperationResult.e();
            e2.e(e);
            e2.d(sendMessageRequest.c().h());
            e2.b(sendMessageRequest.b());
            return erqt.i(e2.a());
        }
        dkkjVar2.aF(djcqVar.a(dkkjVar2));
        dkjt a3 = djfvVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d());
        if (dkut.v(dkkjVar2.y())) {
            dkkjVar2.bl();
        }
        if (((Boolean) djak.a().b.x.a()).booleanValue()) {
            dkkjVar2.aX(MessageClass.i(sendMessageRequest.d()));
        } else if (((Boolean) djak.a().b.v.a()).booleanValue()) {
            dkkjVar2.aY(MessageClass.i(sendMessageRequest.d()));
        }
        dkty.d(djeq.c, "Sending message [%s] in new session [%s]", h, sendMessageRequest.b());
        a2.b.aF(a2);
        dkkj dkkjVar3 = a2.b;
        dkkjVar3.N = a3;
        dkkjVar3.j();
        return a2.a;
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.f;
        fbbm fbbmVar2 = this.e;
        fbbm fbbmVar3 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar3.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
