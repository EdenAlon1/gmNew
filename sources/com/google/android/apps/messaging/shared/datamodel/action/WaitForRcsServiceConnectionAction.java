package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.axol;
import defpackage.bbaw;
import defpackage.bbax;
import defpackage.bbba;
import defpackage.bbbd;
import defpackage.bbbe;
import defpackage.bbbg;
import defpackage.bbbh;
import defpackage.cfva;
import defpackage.cfvl;
import defpackage.clwr;
import defpackage.clws;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.enrr;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eogt;
import defpackage.ffhe;
import defpackage.ffsm;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class WaitForRcsServiceConnectionAction extends Action<Boolean> {
    private final bbbd b;
    private final bbbg c;
    static final cfva a = cfvl.o(184294411);
    public static final Parcelable.Creator<Action<Boolean>> CREATOR = new bbaw();

    /* compiled from: PG */
    public interface a {
        bbax iw();
    }

    public WaitForRcsServiceConnectionAction(bbbe bbbeVar, bbbh bbbhVar) {
        super(eogt.WAIT_FOR_RCS_SERVICE_CONNECTION_ACTION);
        if (((Boolean) a.e()).booleanValue()) {
            this.b = bbbeVar.a();
            this.c = null;
        } else {
            this.b = null;
            this.c = bbbhVar.a();
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("WaitForRcsServiceConnectionAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        boolean z;
        clws clwsVar;
        if (((Boolean) a.e()).booleanValue()) {
            throw new UnsupportedOperationException("WaitForRcsServiceConnectionAsyncAction does not implement executeAction");
        }
        bbbg bbbgVar = this.c;
        bbbgVar.getClass();
        ekzz f = eleg.f("WaitForRcsServiceConnectionAction.executeAction");
        try {
            ensk g = bbbg.a.g();
            g.Y(ente.a, "Bugle");
            ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", 42, "WaitForRcsServiceConnectionBlockingAction.java")).q("Waiting for Rcs services connection");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            clwr clwrVar = new clwr() { // from class: bbbf
                @Override // defpackage.clwr
                public final void a() {
                    countDownLatch.countDown();
                }
            };
            bbbgVar.b.k(clwrVar);
            try {
                try {
                    if (countDownLatch.await(3000L, TimeUnit.MILLISECONDS)) {
                        ensk g2 = bbbg.a.g();
                        g2.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) g2).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", 48, "WaitForRcsServiceConnectionBlockingAction.java")).q("Done waiting for Rcs services connection");
                        z = true;
                        clwsVar = bbbgVar.b;
                    } else {
                        ensk g3 = bbbg.a.g();
                        g3.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) g3).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", 51, "WaitForRcsServiceConnectionBlockingAction.java")).q("Waiting for Rcs services connection timed out");
                        z = false;
                        clwsVar = bbbgVar.b;
                    }
                } catch (InterruptedException e) {
                    ensk j = bbbg.a.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/datamodel/action/WaitForRcsServiceConnectionBlockingAction", "executeAction", '7', "WaitForRcsServiceConnectionBlockingAction.java")).q("Thread interrupted while waiting for Rcs services Connection");
                    z = false;
                    clwsVar = bbbgVar.b;
                }
                clwsVar.l(clwrVar);
                f.close();
                return z;
            } catch (Throwable th) {
                bbbgVar.b.l(clwrVar);
                throw th;
            }
        } finally {
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.WaitForRcsServiceConnection.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        elfl c;
        if (!((Boolean) a.e()).booleanValue()) {
            return super.e();
        }
        bbbd bbbdVar = this.b;
        bbbdVar.getClass();
        c = axol.c(bbbdVar.b, ffhe.a, ffsm.a, new bbba(bbbdVar, null));
        return c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public WaitForRcsServiceConnectionAction(bbbe bbbeVar, bbbh bbbhVar, Parcel parcel) {
        super(parcel, eogt.WAIT_FOR_RCS_SERVICE_CONNECTION_ACTION);
        if (((Boolean) a.e()).booleanValue()) {
            this.b = bbbeVar.a();
            this.c = null;
        } else {
            this.b = null;
            this.c = bbbhVar.a();
        }
    }
}
