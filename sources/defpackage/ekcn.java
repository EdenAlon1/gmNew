package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekcn {
    public final emxc a;
    public final ekbo b;
    public final ekbo c;
    public final Map d;
    public final ekeu e;
    private final ScheduledExecutorService f;
    private final ecxc g;
    private final ecvo h;

    public ekcn(emxc emxcVar, ScheduledExecutorService scheduledExecutorService, ekbo ekboVar, ekbo ekboVar2, Map map, ecxc ecxcVar, ekeu ekeuVar, ecvo ecvoVar) {
        scheduledExecutorService.getClass();
        ekboVar.getClass();
        ekboVar2.getClass();
        map.getClass();
        ecxcVar.getClass();
        ecvoVar.getClass();
        this.a = emxcVar;
        this.f = scheduledExecutorService;
        this.b = ekboVar;
        this.c = ekboVar2;
        this.d = map;
        this.g = ecxcVar;
        this.e = ekeuVar;
        this.h = ecvoVar;
    }

    public final ListenableFuture a(final String str, boolean z) {
        str.getClass();
        ekzz g = eleg.g("Fetching experiments for device", elad.a);
        try {
            g = eleg.g("PhenotypeApi.getConfigurationSnapshot", elad.a);
            try {
                ListenableFuture c = this.g.c(str, "");
                if (z) {
                    c = eldx.a(c, 25L, TimeUnit.SECONDS, this.f);
                }
                g.b(c);
                ffig.a(g, null);
                final ListenableFuture g2 = erny.g(c, eldl.d(new eroh() { // from class: ekcf
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        ListenableFuture f;
                        ecww ecwwVar = (ecww) obj;
                        ekzz g3 = eleg.g("ConsistencyTierState.setNewValues", elad.a);
                        final ekcn ekcnVar = ekcn.this;
                        String str2 = str;
                        try {
                            ejzu ejzuVar = (ejzu) ekcnVar.d.get(str2);
                            if (ejzuVar != null) {
                                int ordinal = ejzuVar.ordinal();
                                if (ordinal == 0) {
                                    ekbo ekboVar = ekcnVar.c;
                                    ecwwVar.getClass();
                                    f = erny.f(ekboVar.b(str2, ecwwVar), eldl.a(new emwl() { // from class: ekcg
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            ekau ekauVar = (ekau) obj2;
                                            ekauVar.getClass();
                                            if (!ekauVar.a) {
                                                ekcn ekcnVar2 = ekcn.this;
                                                if (ekcnVar2.a.g()) {
                                                    ekcnVar2.e.a();
                                                    ((edav) ekcnVar2.a.c()).a();
                                                }
                                            }
                                            return ekauVar;
                                        }
                                    }), erpp.a);
                                } else if (ordinal == 2) {
                                    ekbo ekboVar2 = ekcnVar.b;
                                    ecwwVar.getClass();
                                    f = ekboVar2.b(str2, ecwwVar);
                                }
                                g3.b(f);
                                ffig.a(g3, null);
                                return f;
                            }
                            throw new UnsupportedOperationException();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ffig.a(g3, th);
                                throw th2;
                            }
                        }
                    }
                }), erpp.a);
                g.b(g2);
                ffig.a(g, null);
                ListenableFuture b = this.h.f.b();
                final ffji ffjiVar = new ffji() { // from class: ekcd
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dfrq dfrqVar = (dfrq) obj;
                        dfrqVar.getClass();
                        return Integer.valueOf(Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot. GMS Core version too old.", dfrqVar));
                    }
                };
                return erny.f(ekcu.a(ffdx.g(elfr.e(b, dfrq.class, new emwl() { // from class: ekce
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ffji.this.invoke(obj);
                    }
                }, erpp.a), g2)), eldl.a(new emwl() { // from class: ekcc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ((List) obj).getClass();
                        return (ekau) erqt.q(ListenableFuture.this);
                    }
                }), erpp.a);
            } finally {
            }
        } finally {
        }
    }
}
