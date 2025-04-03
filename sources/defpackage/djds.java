package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.AutoValue_Message;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djds extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;
    private final fbbm f;
    private final fbbm g;

    public djds(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4, fbbm fbbmVar5, fbbm fbbmVar6) {
        super(fbbfVar2, new fbcd(djds.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
        this.f = fbbz.c(fbbmVar5);
        this.g = fbbz.c(fbbmVar6);
    }

    @Override // defpackage.fbbs
    public final /* synthetic */ ListenableFuture b(Object obj) {
        Optional of;
        List list = (List) obj;
        djeb djebVar = (djeb) list.get(0);
        Context context = (Context) list.get(1);
        Optional optional = (Optional) list.get(2);
        djgk djgkVar = (djgk) list.get(3);
        djfv djfvVar = (djfv) list.get(4);
        TraceId traceId = (TraceId) list.get(5);
        dktn dktnVar = djdq.a;
        if (djebVar.b().isEmpty()) {
            of = Optional.empty();
        } else if (optional.isPresent()) {
            of = Optional.empty();
        } else {
            dkjt dkjtVar = ((dkkj) djebVar.b().get()).N;
            if (dkjtVar == null) {
                of = Optional.empty();
            } else {
                Conversation d = djhf.d((dkkj) djebVar.b().get());
                try {
                    Message d2 = djfvVar.d(d, dkjtVar);
                    if (djgkVar.a(traceId, d, d2)) {
                        Intent intent = new Intent("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action");
                        intent.putExtra(RcsIntents.EXTRA_TRACE_ID, traceId.a());
                        dkty.d(djdq.a.b("produceHandleInitialMessageResult"), "sending an intent for initial incoming message: rcsMessageId{id:%s}", ((AutoValue_Message) d2).a);
                        dkuk.b(context, intent, "com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver", dkuj.RECEIVE_MESSAGE_PRODUCER_MODULE);
                    }
                    of = Optional.of(d2);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Error converting InstantMessage to Message", e);
                }
            }
        }
        return erqt.i(of);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.g;
        fbbm fbbmVar2 = this.f;
        fbbm fbbmVar3 = this.e;
        fbbm fbbmVar4 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar4.d(), fbbmVar3.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
