package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdl extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;
    private final fbbm f;
    private final fbbm g;
    private final fbbm h;
    private final fbbm i;

    public djdl(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4, fbbm fbbmVar5, fbbm fbbmVar6, fbbm fbbmVar7, fbbm fbbmVar8) {
        super(fbbfVar2, new fbcd(djdl.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
        this.f = fbbz.c(fbbmVar5);
        this.g = fbbz.c(fbbmVar6);
        this.h = fbbz.c(fbbmVar7);
        this.i = fbbz.c(fbbmVar8);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        Context context = (Context) list.get(0);
        Conversation conversation = (Conversation) list.get(1);
        fbbl fbblVar = (fbbl) list.get(2);
        Optional optional = (Optional) list.get(3);
        Optional optional2 = (Optional) list.get(4);
        djgk djgkVar = (djgk) list.get(5);
        fbbl fbblVar2 = (fbbl) list.get(6);
        TraceId traceId = (TraceId) list.get(7);
        djdd.a(fbblVar);
        if (optional2.isPresent()) {
            optional = Optional.empty();
        } else if (!optional.isEmpty()) {
            if (((Boolean) djdd.b.a()).booleanValue()) {
                djdd.a(fbblVar2);
            } else if (djgkVar.a(traceId, conversation, (Message) optional.get())) {
                Intent intent = new Intent("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action");
                intent.putExtra(RcsIntents.EXTRA_TRACE_ID, traceId.a());
                dkuk.b(context, intent, "com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver", dkuj.RECEIVE_MESSAGE_PRODUCER_MODULE2);
            }
        }
        return erqt.i(optional);
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.d;
        fbbm fbbmVar2 = this.c;
        ListenableFuture d = this.b.d();
        ListenableFuture d2 = fbbmVar2.d();
        ListenableFuture a = fbbz.a(fbbmVar.d());
        fbbm fbbmVar3 = this.h;
        fbbm fbbmVar4 = this.g;
        return erqt.f(d, d2, a, this.e.d(), this.f.d(), fbbmVar4.d(), fbbz.a(fbbmVar3.d()), this.i.d());
    }
}
