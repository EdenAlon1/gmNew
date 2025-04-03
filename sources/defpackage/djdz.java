package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdz extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;

    public djdz(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4) {
        super(fbbfVar2, new fbcd(djdz.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        boolean z = false;
        Optional optional = (Optional) list.get(0);
        Conversation conversation = (Conversation) list.get(1);
        dipa dipaVar = (dipa) list.get(2);
        Context context = (Context) list.get(3);
        if (!((Boolean) djdq.c.a()).booleanValue() || conversation.c() == 1) {
            if (!((Boolean) djdq.b.a()).booleanValue()) {
                z = dipaVar.l((String) optional.orElse(null));
            } else if (!optional.isEmpty()) {
                dkom dkomVar = new dkom();
                dkomVar.a = 30015;
                dkomVar.b = (String) optional.get();
                ImsEvent a = dkomVar.a();
                Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
                intent.putExtra(RcsIntents.EXTRA_EVENT, a);
                dkuk.a(context, intent, dkuj.RECEIVE_MESSAGE_PRODUCER_MODULE);
                z = true;
            }
        }
        return erqt.i(Boolean.valueOf(z));
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.e;
        fbbm fbbmVar2 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
