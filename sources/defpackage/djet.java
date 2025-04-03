package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djet extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;
    private final fbbm f;

    public djet(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4, fbbm fbbmVar5) {
        super(fbbfVar2, new fbcd(djet.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
        this.f = fbbz.c(fbbmVar5);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        dkkq dkkqVar;
        List list = (List) obj;
        SendMessageRequest sendMessageRequest = (SendMessageRequest) list.get(0);
        djfv djfvVar = (djfv) list.get(1);
        dkgw dkgwVar = (dkgw) list.get(2);
        djgy djgyVar = (djgy) list.get(3);
        djcn djcnVar = (djcn) list.get(4);
        diyy diyyVar = djeq.a;
        Message c = sendMessageRequest.c();
        Conversation b = sendMessageRequest.b();
        MessageClass d = sendMessageRequest.d();
        if (((Boolean) djeq.b.a()).booleanValue()) {
            dkkqVar = djeq.a(dkgwVar);
        } else {
            dkkqVar = (dkkq) dkgwVar.a(dkkq.class);
            dkkqVar.getClass();
        }
        dkjt b2 = djfvVar.b(b, c, Optional.of(d), sendMessageRequest.g());
        edzh edzhVar = b2.g;
        edzhVar.getClass();
        int i = dkkqVar.t.mSwitchoverSize;
        if (edzhVar.j() <= i) {
            dkty.d(djeq.c, "Sending SLM message [%s] in pager mode as message content is %s bytes, less than switchOverSize of %s bytes", c.h(), Long.valueOf(edzhVar.j()), Integer.valueOf(i));
            return new djep(dkkqVar, b, c, b2).d();
        }
        dkty.d(djeq.c, "Sending SLM message [%s] in new SLM session [%s]", c.h(), b);
        return djcnVar.a(b, b2, djgyVar.createOutgoingSlmSession(djhf.f(b.a()))).d(b2);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.f;
        fbbm fbbmVar2 = this.e;
        fbbm fbbmVar3 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar3.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
