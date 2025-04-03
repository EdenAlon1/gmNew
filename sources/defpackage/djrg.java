package defpackage;

import android.content.Context;
import android.telephony.ims.ProvisioningManager;
import android.telephony.ims.RcsClientConfiguration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djrg implements djqv {
    private final djrd a;
    private final String b;
    private final int c;
    private final djqu d;
    private djrc e;
    private final dkcp f;

    public djrg(djrd djrdVar, djqu djquVar, dkcp dkcpVar, String str, int i) {
        this.a = djrdVar;
        this.d = djquVar;
        this.f = dkcpVar;
        this.b = str;
        this.c = i;
    }

    private final synchronized boolean d(String str) {
        if (this.e != null) {
            djtp f = this.f.f(str);
            if (f.m().C() && f.Z()) {
                dkty.k("[SR]: Callback is already registered and valid configuration exists for subId: %s", Integer.valueOf(this.c));
                return true;
            }
            djrc djrcVar = this.e;
            djrcVar.getClass();
            if (!djrcVar.d.get()) {
                dkty.k("[SR]: Callback is already registered, however the configuration was not received yet for subId: %s", Integer.valueOf(this.c));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.djqv
    public final synchronized void a() {
        djrc c = c(null);
        if (c == null) {
            dkty.k("[SR]: No active AOSP callback found for subId: %s", Integer.valueOf(this.c));
        } else {
            this.d.a(this.c).unregisterRcsProvisioningCallback(c);
            dkty.k("[SR]: Terminated AOSP callback for subId: %s", Integer.valueOf(this.c));
        }
    }

    @Override // defpackage.djqv
    public final synchronized void b(dium diumVar) {
        if (d(this.b)) {
            return;
        }
        djqu djquVar = this.d;
        int i = this.c;
        djrd djrdVar = this.a;
        String str = this.b;
        ffbr ffbrVar = djrdVar.a;
        ProvisioningManager a = djquVar.a(i);
        Context context = (Context) ffbrVar.b();
        dkcp dkcpVar = (dkcp) djrdVar.b.b();
        dkbt dkbtVar = (dkbt) djrdVar.c.b();
        djvk djvkVar = (djvk) djrdVar.d.b();
        djra djraVar = (djra) djrdVar.e.b();
        djraVar.getClass();
        djrc c = c(new djrc(context, dkcpVar, dkbtVar, djvkVar, diumVar, str, i, djraVar));
        if (c != null) {
            a.unregisterRcsProvisioningCallback(c);
        }
        dkty.k("[SR]: Initializing AOSP callback for subId: %s", Integer.valueOf(this.c));
        String t = dizg.t();
        String s = dizg.s();
        String q = dizg.q();
        String r = dizg.r();
        dkty.c("[SR]: RcsClientConfiguration: rcs_version[%s], rcs_profile[%s], client_vendor[%s], single_reg_client_version[%s]", t, s, q, r);
        a.setRcsClientConfiguration(new RcsClientConfiguration(t, s, q, r));
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        djrc djrcVar = this.e;
        djrcVar.getClass();
        a.registerRcsProvisioningCallback(newSingleThreadExecutor, djrcVar);
        dkty.k("[SR]: AOSP callback registered for subId: %s", Integer.valueOf(this.c));
    }

    final synchronized djrc c(djrc djrcVar) {
        djrc djrcVar2;
        djrcVar2 = this.e;
        this.e = djrcVar;
        return djrcVar2;
    }
}
