package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbhk implements cfvv {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler");
    private final ckds b;

    public cbhk(ckds ckdsVar) {
        this.b = ckdsVar;
    }

    private static eyte d(euxg euxgVar) {
        Map c = euxgVar.c();
        if (c == null) {
            ensk e = a.e();
            e.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler", "getRcsSelfServiceMessage", 77, "RcsTicklesHandler.java")).q("Empty RCS FCM Tickle received");
            return null;
        }
        String str = (String) c.get("message");
        if (TextUtils.isEmpty(str)) {
            ensk e2 = a.e();
            e2.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler", "getRcsSelfServiceMessage", 83, "RcsTicklesHandler.java")).q("Self-service message is missing in RCS FCM Tickle");
            return null;
        }
        try {
            try {
                eytb eytbVar = (eytb) ((eyte) eyfy.parseFrom(eyte.a, Base64.decode(str, 0))).toBuilder();
                eytbVar.copyOnWrite();
                ((eyte) eytbVar.instance).d = true;
                boolean z = euxgVar.b() == 1;
                eytbVar.copyOnWrite();
                ((eyte) eytbVar.instance).e = z;
                boolean z2 = euxgVar.b() != euxgVar.a();
                eytbVar.copyOnWrite();
                ((eyte) eytbVar.instance).f = z2;
                return (eyte) eytbVar.build();
            } catch (eygu e3) {
                ensk j = a.j();
                j.Y(ente.a, "BugleRcs");
                ((enrr) ((enrr) ((enrr) j).g(e3)).h("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler", "getRcsSelfServiceMessage", 'd', "RcsTicklesHandler.java")).q("Could not parse Self-service message");
                return null;
            }
        } catch (IllegalArgumentException unused) {
            ensk i = a.i();
            i.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler", "getRcsSelfServiceMessage", 92, "RcsTicklesHandler.java")).q("Could not decode the message from RCS FCM Tickle");
            return null;
        }
    }

    @Override // defpackage.cfvv
    public final int a(euxg euxgVar) {
        eyte d = d(euxgVar);
        if (d == null) {
            return 0;
        }
        eytd b = eytd.b(d.b);
        if (b == null) {
            b = eytd.UNRECOGNIZED;
        }
        return b.a();
    }

    @Override // defpackage.cfvv
    public final void b(euxg euxgVar) {
        eyte d = d(euxgVar);
        if (d == null) {
            return;
        }
        String str = (String) euxgVar.c().get("tickle");
        if (!TextUtils.isEmpty(str)) {
            eytb eytbVar = (eytb) d.toBuilder();
            eytbVar.copyOnWrite();
            eyte eyteVar = (eyte) eytbVar.instance;
            str.getClass();
            eyteVar.c = str;
            d = (eyte) eytbVar.build();
        }
        String str2 = d.e ? "HIGH" : d.f ? "DOWNGRADED" : "LOW";
        ensk h = a.h();
        h.Y(ente.a, "BugleRcs");
        enrr enrrVar = (enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/rcs/impl/RcsTicklesHandler", "logSelfServiceMessage", 68, "RcsTicklesHandler.java");
        eytd b = eytd.b(d.b);
        if (b == null) {
            b = eytd.UNRECOGNIZED;
        }
        enrrVar.J("Received %s priority FCM Tickle: %s, id: %s", str2, b, d.c);
        this.b.w(d);
    }

    @Override // defpackage.cfvv
    public final void c() {
    }
}
