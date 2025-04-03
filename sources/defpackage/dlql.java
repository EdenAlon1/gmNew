package defpackage;

import android.content.Context;
import com.google.android.libraries.communications.mobileconfiguration.sync.CleanupWorker;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlql implements dlqm {
    public static final enru a = enru.c("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi");
    public final errl b;
    public final errl c;
    public final dlrm d;
    public final dlsd e;
    public final cgtm f;
    private final Context g;
    private final dlqp h;

    public dlql(Context context, errl errlVar, errl errlVar2, dlrm dlrmVar, dlqp dlqpVar, cgtm cgtmVar, dlsd dlsdVar) {
        this.g = context;
        this.b = errlVar;
        this.c = errlVar2;
        this.d = dlrmVar;
        this.h = dlqpVar;
        this.f = cgtmVar;
        this.e = dlsdVar;
    }

    @Override // defpackage.dlqm
    public final Optional a(String str) {
        return this.h.a(str);
    }

    @Override // defpackage.dlqm
    public final void b() {
        ((enrr) ((enrr) a.h()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "forceSyncConfigurations", 148, "MobileConfigurationApi.java")).q("MobileConfigurationApi: force sync mobile configuration");
        if (!fdqx.c(this.g)) {
            this.e.a();
            return;
        }
        errl errlVar = this.b;
        final dlrm dlrmVar = this.d;
        dlrmVar.getClass();
        ListenableFuture g = erny.g(errlVar.submit(new Callable() { // from class: dlqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dlrm.this.c();
            }
        }), new eroh() { // from class: dlqe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    ((enrr) ((enrr) dlql.a.j()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "resetAllConfigValidities", 172, "MobileConfigurationApi.java")).q("MobileConfigurationApi: force sync aborted because failed to get parameters");
                    return erre.a;
                }
                enhk enhkVar = (enhk) optional.get();
                if (enhkVar.isEmpty()) {
                    ((enrr) ((enrr) dlql.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "resetAllConfigValidities", 178, "MobileConfigurationApi.java")).q("MobileConfigurationApi: force sync aborted because no parameters are stored");
                    return erre.a;
                }
                int i = engw.d;
                engr engrVar = new engr();
                enqu listIterator = enhkVar.entrySet().listIterator();
                while (true) {
                    final dlql dlqlVar = dlql.this;
                    if (!listIterator.hasNext()) {
                        return erqt.a(engrVar.g()).a(new Callable() { // from class: dlqh
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }, dlqlVar.c);
                    }
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    final String str = (String) entry.getKey();
                    dlro dlroVar = (dlro) entry.getValue();
                    ewgw ewgwVar = dlroVar.d;
                    if (ewgwVar == null) {
                        ewgwVar = ewgw.a;
                    }
                    dlrn dlrnVar = (dlrn) dlroVar.toBuilder();
                    ewgv ewgvVar = (ewgv) ewgwVar.toBuilder();
                    eyev eyevVar = eyki.a;
                    ewgvVar.copyOnWrite();
                    ewgw ewgwVar2 = (ewgw) ewgvVar.instance;
                    eyevVar.getClass();
                    ewgwVar2.f = eyevVar;
                    ewgwVar2.b |= 1;
                    dlrnVar.copyOnWrite();
                    dlro dlroVar2 = (dlro) dlrnVar.instance;
                    ewgw ewgwVar3 = (ewgw) ewgvVar.build();
                    ewgwVar3.getClass();
                    dlroVar2.d = ewgwVar3;
                    dlroVar2.b |= 2;
                    final dlro dlroVar3 = (dlro) dlrnVar.build();
                    ListenableFuture submit = dlqlVar.b.submit(new Callable() { // from class: dlqg
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            dlql.this.d.e(str, dlroVar3);
                            return null;
                        }
                    });
                    engrVar.h(submit);
                    dlqlVar.c(submit, "MobileConfigurationApi: force sync failed to store configs");
                }
            }
        }, this.b);
        c(g, "MobileConfigurationApi: force sync failed to reset config validities");
        final dlsd dlsdVar = this.e;
        g.b(new Runnable() { // from class: dlqf
            @Override // java.lang.Runnable
            public final void run() {
                dlsd.this.a();
            }
        }, this.c);
    }

    public final void c(ListenableFuture listenableFuture, String str) {
        erqt.r(listenableFuture, new dlqk(str), this.c);
    }

    @Override // defpackage.dlqm
    public final void d(final enhk enhkVar) {
        erqt.r(erqc.o(this.b.submit(new Callable() { // from class: dlqi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dlql dlqlVar = dlql.this;
                enhk enhkVar2 = enhkVar;
                if (enhkVar2.isEmpty()) {
                    ((enrr) ((enrr) dlql.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "logRegisterParametersSuccessNoParameters", 134, "MobileConfigurationApi.java")).q("registerParameters called with no parameters");
                    dlqlVar.f.a(dlqq.a(0, 3));
                    return null;
                }
                try {
                    enip a2 = dlqlVar.d.a(enhkVar2);
                    int i = ((enoz) enhkVar2).d;
                    ((enrr) ((enrr) dlql.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "logRegisterParametersSuccessWithParameters", 121, "MobileConfigurationApi.java")).r("registerParameters successfully stored %d parameters", i);
                    dlqlVar.f.a(dlqq.a(i, 4));
                    if (!a2.isEmpty()) {
                        dlqlVar.e.b(ppa.REPLACE);
                        return null;
                    }
                } catch (dlqr e) {
                    int i2 = ((enoz) enhkVar2).d;
                    ((enrr) ((enrr) ((enrr) dlql.a.j()).g(e)).h("com/google/android/libraries/communications/mobileconfiguration/api/MobileConfigurationApi", "logRegisterParametersFailure", (char) 128, "MobileConfigurationApi.java")).q("registerParameters failed to store parameters");
                    dlqlVar.f.a(dlqq.a(i2, 5));
                }
                dlqlVar.e.b(ppa.KEEP);
                return null;
            }
        })), new dlqj(), this.c);
        Context context = this.g;
        pqs a2 = pqr.a(context);
        if (!fdqx.a.get().h(context)) {
            a2.a("CLEANUP");
            return;
        }
        poh pohVar = new poh();
        pohVar.a = true;
        poj a3 = pohVar.a();
        pqh pqhVar = new pqh(CleanupWorker.class, fdqx.a.get().b(context), TimeUnit.SECONDS);
        pqhVar.g(a3);
        pqhVar.f(poa.LINEAR, fdqx.a.get().d(context), TimeUnit.SECONDS);
        pqhVar.d("CLEANUP");
        a2.f("CLEANUP", poz.KEEP, (pqi) pqhVar.b());
    }
}
