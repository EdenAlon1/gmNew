package defpackage;

import android.app.Activity;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aciy {
    public static final enru a = enru.c("com/google/android/apps/messaging/dittosatellite/appcontrol/SatelliteAppActionManager");
    public final ffbr b;
    public final ffhd c;
    public final ffsk d;
    public final elni e;
    private final Activity f;
    private final dlou g;

    public aciy(Activity activity, ffbr ffbrVar, ffhd ffhdVar, ffsk ffskVar) {
        activity.getClass();
        ffbrVar.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        this.f = activity;
        this.b = ffbrVar;
        this.c = ffhdVar;
        this.d = ffskVar;
        int i = dlou.b;
        engr engrVar = new engr();
        elod elodVar = elox.a;
        elor elorVar = new elor();
        elorVar.a = "send";
        elwq elwqVar = new elwq(elow.class);
        elwqVar.b(elow.SEND);
        elwqVar.b = true;
        elorVar.c(elwqVar.a());
        elorVar.b(dloy.a(new Consumer() { // from class: aciv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                elfl c;
                ((elyt) obj).getClass();
                ensk h = aciy.a.h();
                h.Y(ente.a, "BugleSatelliteAppMgr");
                ((enrr) h.h("com/google/android/apps/messaging/dittosatellite/appcontrol/SatelliteAppActionManager", "handleSendAction", 86, "SatelliteAppActionManager.kt")).q("Voice Assistant Send Action");
                aciy aciyVar = aciy.this;
                c = axol.c(aciyVar.d, ffhe.a, ffsm.a, new acix(aciyVar, null));
                axnw.h(c);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
        engrVar.h(elorVar.a());
        dlou a2 = dlot.a(engrVar);
        this.g = a2;
        this.e = new elni(activity, a2);
    }
}
