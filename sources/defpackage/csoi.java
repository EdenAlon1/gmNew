package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class csoi implements Consumer {
    public final /* synthetic */ cson a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        cson csonVar = this.a;
        csoe csoeVar = (csoe) obj;
        csoe csoeVar2 = (csoe) csonVar.i.getAndSet(csoeVar);
        csonVar.j.set(csoeVar2);
        ((ensz) cson.a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "onNetworkStateChanged", 210, "NetworkStateMonitorLThroughRServiceState.java")).J("NetworkStateMonitorLThroughRServiceState onNetworkStateChanged for subId %d: %s to %s", Integer.valueOf(csonVar.f), csoeVar2, csoeVar);
        csonVar.d.accept(Integer.valueOf(csonVar.f));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
