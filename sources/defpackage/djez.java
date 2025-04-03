package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djez extends fbbs {
    private final fbbm b;
    private final fbbm c;

    public djez(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2) {
        super(fbbfVar2, new fbcd(djez.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
    }

    @Override // defpackage.fbbs
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        TriggerGroupNotificationRequest triggerGroupNotificationRequest = (TriggerGroupNotificationRequest) list.get(0);
        djgw djgwVar = (djgw) list.get(1);
        if (djgwVar.d().isPresent()) {
            ehyt ehytVar = new ehyt();
            ehytVar.b(triggerGroupNotificationRequest.b());
            ehytVar.c(MessagingResult.e);
            return erqt.i(ehytVar.a());
        }
        ehyt ehytVar2 = new ehyt();
        ehytVar2.c(djhf.b(djgwVar));
        ehytVar2.b(triggerGroupNotificationRequest.b());
        return erqt.i(ehytVar2.a());
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        return erqt.f(this.b.d(), this.c.d());
    }
}
