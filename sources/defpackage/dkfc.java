package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.ims.rcs.engine.impl.RcsEngineImpl;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkfc extends Handler {
    private static final enhk a = enhk.p(0, "START_RCS_STACK", 1, "UPDATE_RCS_CONFIG", 2, "NOTIFY_UPTIME_IGNORE_STATE_CHANGED", 3, "SEND_SIM_EVENT_TO_PROVISIONING_ENGINE", 4, "STOP_RCS_STACK");
    private final dktn b;
    private final WeakReference c;
    private final WeakReference d;

    public dkfc(Looper looper, RcsEngineImpl rcsEngineImpl, djjc djjcVar) {
        super(looper);
        dktn dktnVar;
        dktnVar = rcsEngineImpl.m;
        this.b = dktnVar.b("Handler");
        this.c = new WeakReference(rcsEngineImpl);
        this.d = new WeakReference(djjcVar);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [dikz, java.lang.Object] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        dkty.l(this.b, "handleMessage processing message:[%s] with [%s]:RcsEngineImpl reference", a.get(Integer.valueOf(message.what)), this.c.get() == null ? "null" : "non-null");
        int i = message.what;
        if (i == 0) {
            RcsEngineImpl rcsEngineImpl = (RcsEngineImpl) this.c.get();
            if (rcsEngineImpl != null) {
                rcsEngineImpl.startRcsStackInternal();
                return;
            } else {
                dkty.h(this.b, "skipping doStartRcsStack, engine is null, this should not happen", new Object[0]);
                return;
            }
        }
        if (i == 1) {
            RcsEngineImpl rcsEngineImpl2 = (RcsEngineImpl) this.c.get();
            if (rcsEngineImpl2 != null) {
                rcsEngineImpl2.updateRcsConfig();
                return;
            } else {
                dkty.h(this.b, "skipping doUpdateRcsConfig, engine is null, this should not happen", new Object[0]);
                return;
            }
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    dkty.r(this.b, "Unexpected RCS engine handler message: %s", message);
                    return;
                }
                dkty.l(this.b, "RCS engine STOP RCS stack", new Object[0]);
                RcsEngineImpl rcsEngineImpl3 = (RcsEngineImpl) this.c.get();
                if (rcsEngineImpl3 != null) {
                    rcsEngineImpl3.stopRcsStackInternal();
                    return;
                } else {
                    dkty.h(this.b, "skipping doStopImsStack, engine is null, this should not happen", new Object[0]);
                    return;
                }
            }
            return;
        }
        djjc djjcVar = (djjc) this.d.get();
        if (djjcVar == null) {
            dkty.h(this.b, "skipping doNotifyUptimeIgnoreStateChanged, tracker is null, this should not happen", new Object[0]);
            return;
        }
        if (djjcVar.n()) {
            try {
                eytk c = djjcVar.c();
                if (djjc.o(c)) {
                    djjcVar.k(c);
                } else if (djjcVar.r.isPresent() && djjcVar.r.get().isRegistered()) {
                    djjcVar.l();
                } else {
                    djjcVar.m(dilc.UNKNOWN);
                }
            } catch (dkvd unused) {
                dkty.g("Missing permission to calculate uptime metric.", new Object[0]);
            }
        }
    }
}
