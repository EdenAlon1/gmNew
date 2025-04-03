package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djeo extends dkji {
    public final SettableFuture a = SettableFuture.create();
    public final dkkj b;
    private final Conversation c;
    private final Message d;
    private final MessageClass e;
    private final Context f;
    private final djfw g;

    public djeo(Context context, djfw djfwVar, Conversation conversation, Message message, MessageClass messageClass, dkkj dkkjVar) {
        this.c = conversation;
        this.d = message;
        this.e = messageClass;
        this.b = dkkjVar;
        this.f = context;
        this.g = djfwVar;
    }

    @Override // defpackage.dkji, defpackage.dkjz
    public final void a(dkjt dkjtVar, int i) {
        this.b.aU(this);
        MessagingResult a = this.g.apply(this.b.S);
        eibu e = MessagingOperationResult.e();
        e.e(a);
        e.b(this.c);
        e.d(this.d.h());
        this.a.set(e.a());
    }

    @Override // defpackage.dkji, defpackage.dkjz
    public final void b(dkjt dkjtVar) {
        this.b.aU(this);
        eibu e = MessagingOperationResult.e();
        e.e(MessagingResult.d);
        e.b(this.c);
        e.d(this.d.h());
        e.c(false);
        this.a.set(e.a());
    }

    final ListenableFuture d(dkjt dkjtVar) {
        this.b.aF(this);
        try {
            this.b.aV(dkjtVar);
            return this.a;
        } catch (dkjy e) {
            this.b.aU(this);
            this.a.setException(e);
            return this.a;
        }
    }

    @Override // defpackage.dkji, defpackage.dkhd
    public final void h(int i, String str) {
        if (i == 404) {
            dkkj dkkjVar = this.b;
            if (dkkjVar.E) {
                return;
            }
            dkom dkomVar = new dkom();
            dkomVar.a = 30014;
            dkomVar.b = dkkjVar.z();
            ImsEvent a = dkomVar.a();
            Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
            intent.putExtra(RcsIntents.EXTRA_EVENT, a);
            dkuk.a(this.f, intent, dkuj.SEND_MESSAGE_PRODUCER_MODULE);
        }
    }

    final ListenableFuture q(eido eidoVar) {
        dkje dkjeVar;
        eido eidoVar2;
        ListenableFuture i;
        this.b.aF(this);
        try {
            boolean z = this.e.b() == eigp.USER;
            dkjeVar = new dkje();
            dkjeVar.a(true);
            dkjeVar.b = eidoVar;
            dkjeVar.a(z);
        } catch (InterruptedException unused) {
            dkty.r(djeq.c, "[%s] Interrupted while waiting for message send", this.d.h());
        } catch (ExecutionException e) {
            this.b.aU(this);
            this.a.setException(e);
        }
        if (dkjeVar.c == 1 && (eidoVar2 = dkjeVar.b) != null) {
            dkjf dkjfVar = new dkjf(dkjeVar.a, eidoVar2);
            dkkj dkkjVar = this.b;
            if (dkkjVar.bg()) {
                eido eidoVar3 = dkjfVar.b;
                eide eideVar = new eide(eidoVar3);
                Optional optional = ((djkv) ((djky) dkkjVar.T).b()).g;
                if (djac.n() && optional.isPresent()) {
                    String str = "NS" + ((int) (Math.random() * 100.0d));
                    eideVar.g(str, (String) djac.a().a.e.a());
                    eideVar.f(str, "P-Access-Network-Info", (String) optional.get());
                }
                String c = ((eidt) eidoVar3.g("Message-ID").get()).c();
                dkjt dkjtVar = new dkjt(dkjs.CPIM_MESSAGE);
                dkjtVar.b = dkkjVar.y();
                dkjtVar.c = dkkjVar.l.g;
                dkjtVar.k = c;
                dkjtVar.f("message/cpim", eideVar.a());
                dkjtVar.r = dkjfVar.a;
                dkty.w(13, 3, "Queueing message for sending %s with messageid=%s", dkjtVar, dkjtVar.k);
                dkkjVar.K.add(dkjtVar);
                i = erqt.i(new dkjg(Optional.empty()));
            } else {
                dkty.h(dkkj.B, "Unable to send message: %s, %d", dkkjVar.a.toString(), Integer.valueOf(dkkjVar.n));
                i = erqt.h(new dkjy());
            }
            i.get();
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        if (dkjeVar.c == 0) {
            sb.append(" requiresFailureReport");
        }
        if (dkjeVar.b == null) {
            sb.append(" message");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
