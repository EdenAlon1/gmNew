package defpackage;

import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acuz implements acus, ctbj {
    private static final enru c = enru.c("com/google/android/apps/messaging/dittosatellite/jsbridge/ReportSettledHandler");
    private static final cskc d = cskc.g("Bugle", "ReportSettledHandler");
    public final ffbr a;
    public final ctbl b;
    private final Optional e;
    private final errl f;
    private final ffbr g;
    private final acxa h;

    public acuz(Optional optional, acxa acxaVar, errl errlVar, ctbk ctbkVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.e = optional;
        this.h = acxaVar;
        this.f = errlVar;
        this.a = ffbrVar;
        this.g = ffbrVar2;
        this.b = ctbkVar.a(this);
    }

    @Override // defpackage.acus
    public final elfl a(esnk esnkVar, esnl esnlVar) {
        cskc cskcVar = d;
        cskcVar.p("Received ReportSettledRequest from Ditto");
        ekzz f = eleg.f("Received ReportSettledRequest Callback");
        try {
            this.b.b(null, f);
            f.close();
            String str = esnkVar.d;
            esnlVar.copyOnWrite();
            esnn esnnVar = (esnn) esnlVar.instance;
            esnn esnnVar2 = esnn.a;
            str.getClass();
            esnnVar.d = str;
            fagh faghVar = fagh.OK;
            esnlVar.copyOnWrite();
            ((esnn) esnlVar.instance).e = faghVar.a();
            eyex eyexVar = eyex.a;
            esnlVar.copyOnWrite();
            esnn esnnVar3 = (esnn) esnlVar.instance;
            eyexVar.getClass();
            esnnVar3.c = eyexVar;
            esnnVar3.b = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            final esnn build = esnlVar.build();
            if (!this.e.isPresent()) {
                return elfo.e(build);
            }
            if ((esnkVar.b == 101 ? (esnh) esnkVar.c : esnh.a).e) {
                ensk h = c.h();
                h.Y(ente.a, "DittoSatellite");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/dittosatellite/jsbridge/ReportSettledHandler", "handleRequest", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ReportSettledHandler.java")).q("Ditto is in Offline Mode");
                ((akzt) this.g.b()).c("Bugle.Satellite.OfflineMode.ReportSettled.Count");
                return elfo.e(build);
            }
            String str2 = (esnkVar.b == 101 ? (esnh) esnkVar.c : esnh.a).d;
            csjb a = cskcVar.a();
            a.A("New sourceId", str2);
            a.r();
            if (true == TextUtils.isEmpty(str2)) {
                str2 = "empty_source_id";
            }
            boolean z = (esnkVar.b == 101 ? (esnh) esnkVar.c : esnh.a).b;
            if (!z) {
                this.h.b();
            }
            aclb aclbVar = (aclb) this.e.get();
            char c2 = 3;
            ListenableFuture[] listenableFutureArr = new ListenableFuture[3];
            listenableFutureArr[0] = aclbVar.k(str2);
            listenableFutureArr[1] = aclbVar.g(Boolean.valueOf(z));
            int i = (esnkVar.b == 101 ? (esnh) esnkVar.c : esnh.a).c;
            if (i == 0) {
                c2 = 2;
            } else if (i != 1) {
                c2 = i != 2 ? i != 3 ? (char) 0 : (char) 5 : (char) 4;
            }
            listenableFutureArr[2] = this.e.isEmpty() ? elfo.e(null) : (z && (c2 != 0 ? c2 : (char) 1) == 5) ? ((aclb) this.e.get()).i(acky.PAIRED) : ((aclb) this.e.get()).i(acky.NOT_PAIRED);
            return elfo.m(listenableFutureArr).a(new Callable() { // from class: acuy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ((acip) acuz.this.a.b()).m();
                    return build;
                }
            }, this.f);
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ctbj
    public final /* synthetic */ void fN() {
    }

    @Override // defpackage.ctbj
    public final /* synthetic */ void fO() {
    }
}
