package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import androidx.work.WorkerParameters;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmml implements ejny {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleRcsWorker");
    private final Context c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final errl j;
    private final ffbr k;
    private final ffbr l;
    private final asvd m;
    private final ffbr n;
    private final ffbr o;

    public cmml(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, errl errlVar, ffbr ffbrVar7, ffbr ffbrVar8, asvd asvdVar, ffbr ffbrVar9, ffbr ffbrVar10) {
        this.c = context;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = errlVar;
        this.k = ffbrVar7;
        this.l = ffbrVar8;
        this.m = asvdVar;
        this.n = ffbrVar9;
        this.o = ffbrVar10;
    }

    private final ppq d(dkbn dkbnVar, eqwf eqwfVar, String str, boolean z) {
        ppq ppoVar;
        ppn ppnVar = new ppn();
        ((dikl) this.k.b()).j(this.c, dkbnVar, ((dkbc) dkbnVar).a, new djro(str));
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                TrafficStats.setThreadStatsTag(8961);
                httpURLConnection = ((djxx) this.i.b()).a(dkbnVar);
                emyg c = emyg.c(emtt.a);
                int responseCode = httpURLConnection.getResponseCode();
                long a2 = c.a(TimeUnit.MILLISECONDS);
                String str2 = ((dkbc) dkbnVar).a;
                String str3 = ((dkbc) dkbnVar).b;
                djro djroVar = new djro(str);
                dkbp f = dkbq.f(3, str2, str3);
                eyze b2 = f.b();
                b2.copyOnWrite();
                eyzf eyzfVar = (eyzf) b2.instance;
                eyzf eyzfVar2 = eyzf.a;
                eyzfVar.b |= 1;
                eyzfVar.c = responseCode;
                int min = (int) Math.min(2147483647L, a2);
                b2.copyOnWrite();
                eyzf eyzfVar3 = (eyzf) b2.instance;
                eyzfVar3.b |= 2;
                eyzfVar3.d = min;
                ((dikl) this.k.b()).k(this.c, f.a(), djroVar);
                ppoVar = responseCode == 200 ? new ppp() : responseCode == 503 ? new ppo() : new ppn();
            } catch (SocketTimeoutException unused) {
                ((ensz) ((ensz) b.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "sendDisableRequest", 288, "DisableRcsWorker.java")).q("Timed out while connecting to server");
                ppoVar = new ppo();
            } catch (IOException unused2) {
                ((ensz) ((ensz) b.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "sendDisableRequest", 291, "DisableRcsWorker.java")).q("Get HTTP error while connecting with retry");
                ppoVar = new ppo();
            }
            if (httpURLConnection != null) {
                f(httpURLConnection);
            }
            if (!new ppo().equals(ppoVar) && i(eqwfVar)) {
                g(str);
            }
            TrafficStats.clearThreadStatsTag();
            h(str, z, ppoVar);
            return ppoVar;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                f(httpURLConnection);
            }
            if (!new ppo().equals(ppnVar) && i(eqwfVar)) {
                g(str);
            }
            TrafficStats.clearThreadStatsTag();
            h(str, z, ppnVar);
            throw th;
        }
    }

    private final djtp e(String str) {
        djtp f = ((dkcp) this.d.b()).f(str);
        f.F(-4);
        f.K(0);
        f.G(true);
        ((dkcp) this.d.b()).t(str, f);
        return f;
    }

    private final void f(HttpURLConnection httpURLConnection) {
        ((djvo) this.g.b()).a(httpURLConnection, null, "DisableRcsWorker");
    }

    private final void g(String str) {
        ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "clearConfig", 369, "DisableRcsWorker.java")).t("Clearing local RCS Configuration for simId: %s.", str);
        ((dkcp) this.d.b()).t(str, new Configuration());
    }

    private final void h(String str, boolean z, ppq ppqVar) {
        ((ensz) ((ensz) b.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "scheduleReprovisioningIfNeeded", 308, "DisableRcsWorker.java")).H("scheduleReprovisioningIfNeeded with forceDisableThenReprovision = %s, result = %s", z, ppqVar);
        if (!z || new ppo().equals(ppqVar)) {
            return;
        }
        ((cmfj) this.o.b()).i(new djro(str), false);
        ((cmnf) this.l.b()).e(new djro(str), eyxa.TRIGGER_PHENOTYPE_FLAG_UPDATE, eqws.REPROVISIONING_CAMPAIGN);
    }

    private static boolean i(eqwf eqwfVar) {
        return eqwfVar == eqwf.DISABLED_VIA_FLAGS || eqwfVar == eqwf.DISABLED_BY_EMM;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        return elfo.g(new Callable() { // from class: cmmk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkerParameters workerParameters2 = workerParameters;
                return cmml.this.c(workerParameters2.b.h("force_disable_then_reprovision"), emxe.b(workerParameters2.b.d("sim_id")));
            }
        }, this.j);
    }

    public final ppq c(boolean z, String str) {
        entd entdVar = b;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 124, "DisableRcsWorker.java")).E("disableRcsRequestWork for simId: %s, forceDisableThenReprovision: %s", str, z);
        djtp f = ((dkcp) this.d.b()).f(str);
        if (!z && (!f.O() || !f.Z())) {
            ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 132, "DisableRcsWorker.java")).I("Wrong configuration, hasToken: %s, isValidAndUpdated: %s", f.O(), f.Z());
            return new ppn();
        }
        if (z) {
            f = e(str);
        }
        eqwf w = ((ckge) ((csjk) this.h.b()).a()).w(new djro(str));
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 146, "DisableRcsWorker.java")).t("Current availability is %s", w);
        if (!z ? w == eqwf.DISABLED_FROM_PREFERENCES || (djai.V() && i(w)) : !this.m.a() ? !djai.U() : !(djai.U() || ((cguo) this.n.b()).c(str).R)) {
            if (i(w)) {
                g(str);
            }
            ((ensz) ((ensz) entdVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 205, "DisableRcsWorker.java")).q("Cannot send disable request due to availability mismatch");
            h(str, z, new ppn());
            return new ppn();
        }
        if (!z) {
            try {
                f = e(str);
            } catch (RuntimeException e) {
                e.printStackTrace();
                h(str, z, new ppn());
                return new ppn();
            } catch (MalformedURLException unused) {
                ((ensz) ((ensz) b.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 194, "DisableRcsWorker.java")).q("malformed URL has occurred");
                h(str, z, new ppn());
                return new ppn();
            }
        }
        djtp djtpVar = f;
        String f2 = z ? ((dkcp) this.d.b()).d(str).d : (djai.z() && djai.ab()) ? ((dked) this.e.b()).f(str) : ((dked) this.e.b()).e();
        int b2 = (djai.z() && djai.ab()) ? ((dked) this.e.b()).b(str) : ((dked) this.e.b()).a();
        String str2 = djtpVar.k().mValue;
        dkbm m = dkbn.m(3);
        ((djxv) this.f.b()).d(this.c, f2, djtpVar, "", str2, b2, null, str, m);
        return d(m.j(), w, str, z);
    }
}
