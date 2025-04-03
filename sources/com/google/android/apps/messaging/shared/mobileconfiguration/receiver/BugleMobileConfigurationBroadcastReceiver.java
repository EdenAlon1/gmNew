package com.google.android.apps.messaging.shared.mobileconfiguration.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.cgua;
import defpackage.cguc;
import defpackage.cgun;
import defpackage.cguo;
import defpackage.cgvc;
import defpackage.ekzm;
import defpackage.ekzz;
import defpackage.elbx;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emxf;
import defpackage.enct;
import defpackage.engr;
import defpackage.engw;
import defpackage.enqu;
import defpackage.enrr;
import defpackage.ensk;
import defpackage.ente;
import defpackage.erpp;
import defpackage.ewgz;
import defpackage.fazb;
import defpackage.ffbr;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class BugleMobileConfigurationBroadcastReceiver extends cgvc {
    public fazb a;
    public fazb b;
    public fazb c;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.a.b()).b("BugleMobileConfigurationBroadcastReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.BugleMobileConfiguration.Latency";
    }

    @Override // defpackage.cnhy
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.BugleMobileConfiguration.Latency";
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cnhy
    public final elfl j(Context context, Intent intent) {
        elfl e;
        ekzz f = eleg.f("onMobileConfigurationUpdated");
        try {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("config_data_ids_of_updated_configs");
            if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                engw n = engw.n(stringArrayListExtra);
                ((cguo) this.c.b()).g(n);
                cguc cgucVar = (cguc) this.b.b();
                enct enctVar = new enct();
                int size = n.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) n.get(i);
                    try {
                        String[] split = str.split("\\.", 2);
                        emxf.f(split.length == 2, "Invalid configParameterId: %s", str);
                        String str2 = split[0];
                        emxf.f(!str2.isEmpty(), "Invalid configParameterId: %s", str);
                        cgua cguaVar = new cgua(str2, (ewgz) Enum.valueOf(ewgz.class, split[1]));
                        enctVar.t(cguaVar.a, cguaVar);
                    } catch (IllegalArgumentException unused) {
                        ensk j = cguc.a.j();
                        j.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "onConfigUpdated", 155, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: Invalid configuration id: %s", str);
                    }
                }
                if (enctVar.A()) {
                    e = elfo.e(null);
                } else {
                    engr engrVar = new engr();
                    enqu listIterator = cgucVar.b.keySet().listIterator();
                    while (listIterator.hasNext()) {
                        ewgz ewgzVar = (ewgz) listIterator.next();
                        engw n2 = engw.n(enctVar.c(ewgzVar));
                        ffbr ffbrVar = (ffbr) cgucVar.b.get(ewgzVar);
                        if (!n2.isEmpty() && ffbrVar != null) {
                            engrVar.h(((cgun) ffbrVar.b()).a(n2));
                        }
                    }
                    e = elfo.l(engrVar.g()).a(new Callable() { // from class: cgub
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return null;
                        }
                    }, erpp.a);
                }
                f.close();
                return e;
            }
            e = elfo.e(null);
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
