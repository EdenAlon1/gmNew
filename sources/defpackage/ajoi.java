package defpackage;

import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajoi implements ajof {
    static final cfva a = cfvl.e(cfvl.b, "setup_vendor_ims_delay_ms", 5000);
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final errm f;
    private final errm g;
    private final ffbr h;

    public ajoi(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, errm errmVar, errm errmVar2, ffbr ffbrVar5) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = errmVar;
        this.g = errmVar2;
        this.h = ffbrVar5;
    }

    @Override // defpackage.ajof
    public final elfl a(final ajoj ajojVar) {
        elfl e;
        ajnx ajnxVar = (ajnx) ajojVar;
        if (!((dkcp) this.c.b()).B(ajnxVar.a)) {
            dkty.q("[SR]: There's no valid configuration available. Skipping RcsEngine init.", new Object[0]);
            e = elfo.e(new RcsEngineLifecycleServiceResult(0));
        } else if (djak.t()) {
            dkty.k("[SR]: Called RcsEngineLifecycleManagerV2 to init RcsEngine in SR mode.", new Object[0]);
            ckly cklyVar = (ckly) this.h.b();
            final int i = ajnxVar.b;
            e = cklyVar.a(new cklx() { // from class: cklk
                @Override // defpackage.cklx
                public final RcsEngineLifecycleServiceResult a(RcsEngineLifecycleServiceV2 rcsEngineLifecycleServiceV2) {
                    return rcsEngineLifecycleServiceV2.initialize(i, 2);
                }
            }, true);
        } else {
            dkty.c("RcsSettings__enableRcsEngineInitializationByBugle is disabled. Skipping RcsEngine init.", new Object[0]);
            e = elfo.e(new RcsEngineLifecycleServiceResult(0));
        }
        return e.i(new eroh() { // from class: ajoh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ajoi ajoiVar = ajoi.this;
                ckge ckgeVar = (ckge) ((csjk) ajoiVar.d.b()).a();
                ajnx ajnxVar2 = (ajnx) ajojVar;
                ckgeVar.p(new djro(ajnxVar2.a), ckgb.SINGLE_REGISTRATION_PROVISIONING_EVENT);
                dkty.k("[SR]: Triggered RcsAvailability update.", new Object[0]);
                dkcp dkcpVar = (dkcp) ajoiVar.c.b();
                String str = ajnxVar2.a;
                ((dkay) ajoiVar.b.b()).t(str, dkcpVar.i(str));
                dkty.k("[SR]: Notified Provisioning API about configuration change.", new Object[0]);
                if (!ajnxVar2.c) {
                    return elfo.e(null);
                }
                dkty.k("[SR]: Triggering setupVendorIms in RCS process with %d ms delay.", ajoi.a.e());
                return elfl.g(ajoiVar.f.schedule(new Callable() { // from class: ajog
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ((cnjz) ajoi.this.e.b()).B();
                        return null;
                    }
                }, ((Integer) ajoi.a.e()).intValue(), TimeUnit.MILLISECONDS));
            }
        }, this.g);
    }
}
