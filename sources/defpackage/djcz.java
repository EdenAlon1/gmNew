package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.rcs.client.messaging.data.AutoValue_GroupNotification;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcz extends fbbs {
    private final fbbm b;
    private final fbbm c;
    private final fbbm d;
    private final fbbm e;

    public djcz(fbbf fbbfVar, fbbf fbbfVar2, fbbm fbbmVar, fbbm fbbmVar2, fbbm fbbmVar3, fbbm fbbmVar4) {
        super(fbbfVar2, new fbcd(djcz.class), fbbfVar);
        this.b = fbbz.c(fbbmVar);
        this.c = fbbz.c(fbbmVar2);
        this.d = fbbz.c(fbbmVar3);
        this.e = fbbz.c(fbbmVar4);
    }

    @Override // defpackage.fbbs
    public final /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        djgb djgbVar = (djgb) list.get(0);
        Context context = (Context) list.get(1);
        djgj djgjVar = (djgj) list.get(2);
        clqg clqgVar = (clqg) list.get(3);
        if (((Boolean) djcx.a.a()).booleanValue()) {
            String b = ((AutoValue_GroupNotification) djgbVar.a()).a.b();
            clrh b2 = clrh.b((clqgVar.c == 3 ? (clqk) clqgVar.d : clqk.a).c);
            if (b2 == null) {
                b2 = clrh.RESPONSE_STATUS_UNKNOWN;
            }
            dkty.k("[%s] Group notification completed, result: %s", b, b2);
        } else {
            GroupNotification a = djgbVar.a();
            synchronized (djgjVar.a) {
                djgjVar.b.add(a);
                dkty.c("Group notifications queue: push operation, conversationId:{%s}, queueSize:{%s}.", ((AutoValue_GroupNotification) a).a.b(), Integer.valueOf(djgjVar.b.size()));
            }
            dkuk.b(context, new Intent("com.google.android.apps.messaging.shared.messaging.incoming_group_notification_action"), "com.google.android.apps.messaging.shared.rcs.messaging.MessagingServiceResponseReceiver", dkuj.RECEIVE_GROUP_NOTIFY_PRODUCER_MODULE);
        }
        return erqt.i(djgbVar.a());
    }

    @Override // defpackage.fbbs
    protected final ListenableFuture c() {
        fbbm fbbmVar = this.e;
        fbbm fbbmVar2 = this.d;
        return erqt.f(this.b.d(), this.c.d(), fbbmVar2.d(), fbbmVar.d());
    }
}
