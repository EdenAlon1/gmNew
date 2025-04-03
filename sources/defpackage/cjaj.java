package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjaj implements ciuu {
    final /* synthetic */ ciwj a;

    public cjaj(ciwj ciwjVar) {
        this.a = ciwjVar;
    }

    @Override // defpackage.ciuu
    public final elfl a(cniz cnizVar, Intent intent, Bundle bundle, ciwd ciwdVar) {
        ensz enszVar = (ensz) cjal.a.h();
        cisw ciswVar = (cisw) ciwdVar;
        enszVar.Y(cird.n, ciswVar.a);
        enszVar.Y(cird.d, (String) ciswVar.b.orElse(null));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageCallbacksModule$4", "onActionCalled", 167, "IncomingMessageCallbacksModule.java")).q("Cancel IM notification from copy OTP callback");
        cjaf.b(this.a, ciwdVar);
        return elfo.e(null);
    }
}
