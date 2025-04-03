package defpackage;

import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjak implements civr {
    final /* synthetic */ ffbr a;
    final /* synthetic */ cjcb b;
    final /* synthetic */ ffbr c;

    public cjak(ffbr ffbrVar, cjcb cjcbVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = cjcbVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.civr
    public final elfl a(List list) {
        if (list.isEmpty()) {
            ((ensz) ((ensz) cjal.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule$5", "onNotificationCanceled", 223, "IncomingMessageCallbacksModule.java")).q("No notification data when trying to cancel notification");
            return elfo.e(null);
        }
        ((cirp) this.c.b()).a(ciro.a);
        return this.b.a(((ciwd) list.get(0)).b());
    }

    @Override // defpackage.civr
    public final elfl b(List list) {
        if (!list.isEmpty()) {
            return this.b.a(((ciwd) list.get(0)).b());
        }
        ((ensz) ((ensz) cjal.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule$5", "onNotificationPosted", 263, "IncomingMessageCallbacksModule.java")).q("No notification data when trying to post notification");
        return elfo.e(null);
    }

    @Override // defpackage.civr
    public final elfl c(ciwd ciwdVar) {
        ((cipm) this.a.b()).e(5, Duration.ZERO);
        return this.b.a(((cisw) ciwdVar).a);
    }

    @Override // defpackage.civr
    public final elfl d(ciwd ciwdVar) {
        return this.b.a(((cisw) ciwdVar).a);
    }

    @Override // defpackage.civr
    public final elfl e(ciwd ciwdVar) {
        ((cipm) this.a.b()).e(5, Duration.ZERO);
        return this.b.a(((cisw) ciwdVar).a);
    }

    @Override // defpackage.civr
    public final elfl f(ciwd ciwdVar) {
        ((cirp) this.c.b()).a(ciro.a);
        return this.b.a(((cisw) ciwdVar).a);
    }
}
