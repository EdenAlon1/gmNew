package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.SparseArray;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpai implements cpbv {
    private final Context f;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private static final enru e = enru.c("com/google/android/apps/messaging/shared/sms/apns/BugleCarrierConfigValuesLoader");
    public static final cfva b = cfvl.i(cfvl.b, "enable_experiment_carrier_config_override", false);
    public static final cfva c = cfvl.g(cfvl.b, "experiment_carrier_config_override", eymw.a);
    private final SparseArray g = new SparseArray();
    public final Bundle d = new Bundle();

    public cpai(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.f = context;
        this.k = ffbrVar4;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        new ersb((Executor) ffbrVar5.b());
    }

    public static Bundle c(int i, ctwb ctwbVar) {
        try {
            Optional j = ctwbVar.h(i).j();
            if (!j.isPresent()) {
                return null;
            }
            Bundle bundle = (Bundle) j.get();
            if (bundle.get("spamForwardingNumber") instanceof Boolean) {
                bundle.remove("spamForwardingNumber");
            }
            return bundle;
        } catch (Exception e2) {
            ensk j2 = e.j();
            j2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) j2).g(e2)).h("com/google/android/apps/messaging/shared/sms/apns/BugleCarrierConfigValuesLoader", "loadFromSystem", (char) 219, "BugleCarrierConfigValuesLoader.java")).q("Calling system getCarrierConfigValues exception");
            return null;
        }
    }

    @Override // defpackage.kx
    @Deprecated
    public final Bundle a(int i) {
        Bundle bundle;
        int a = ((ctwb) this.h.b()).h(i).a();
        synchronized (this.g) {
            bundle = (Bundle) this.g.get(a);
            if (bundle == null) {
                bundle = new Bundle();
                this.g.put(a, bundle);
                cpbf cpbfVar = (cpbf) this.k.b();
                Bundle bundle2 = new Bundle();
                enqv it = cpbfVar.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    cpcc cpccVar = (cpcc) it.next();
                    try {
                        bundle2.putAll(cpccVar.a(a));
                    } catch (Exception e2) {
                        enrr enrrVar = (enrr) cpbf.a.j();
                        enrrVar.Y(ente.a, "Bugle");
                        ((enrr) enrrVar.g(e2).h("com/google/android/apps/messaging/shared/sms/config/CarrierConfigRepository", "getConfigs", 69, "CarrierConfigRepository.kt")).t("Exception when getting configs from %s", cpccVar);
                    }
                }
                if (cpbfVar.d.a()) {
                    cpcb cpcbVar = cpbfVar.c;
                    axol.k(((cpck) cpcbVar).c, null, new cpcj((cpck) cpcbVar, a, null), 3);
                }
                bundle.putAll(bundle2);
            }
        }
        return bundle;
    }

    public final Bundle b(cfva cfvaVar) {
        if (((ctwb) this.h.b()).a() > 1) {
            return new Bundle();
        }
        eymw eymwVar = (eymw) cfvaVar.e();
        return eymwVar.equals(((cfun) cfvaVar).c) ? new Bundle() : cpbh.a(eymwVar);
    }

    public final void d(int i, Bundle bundle, int i2) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = ((cpby) this.j.b()).a(this.f, i).getResources().getXml(i2);
                cpav a = cpav.a(xmlResourceParser, (ctvb) this.i.b());
                a.a = new cpah(bundle);
                a.b();
            } catch (Resources.NotFoundException e2) {
                ensk j = e.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/shared/sms/apns/BugleCarrierConfigValuesLoader", "loadFromResources", (char) 254, "BugleCarrierConfigValuesLoader.java")).q("Can not find mms_config.xml");
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } finally {
        }
    }

    public final void e(int i, Bundle bundle) {
        int a = cpax.a();
        if (a != Integer.MIN_VALUE) {
            d(i, bundle, a);
        }
    }

    @Override // defpackage.cpbv
    public final void f() {
        synchronized (this.g) {
            this.g.clear();
        }
    }
}
