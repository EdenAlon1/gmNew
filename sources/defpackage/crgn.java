package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgn implements crgh, cfug, djrx, djru, djrl, dihl {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl");
    public final Map b;
    public final ffbr c;
    public final ffbr d;
    public final emar e;
    private final ffbr f;
    private final ffbr g;
    private final djrk h;
    private final ffsk i;
    private final AtomicBoolean j;

    public crgn(Map map, ffbr ffbrVar, ffbr ffbrVar2, djrk djrkVar, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        djrkVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        this.b = map;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = djrkVar;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.i = ffskVar;
        this.e = new emar();
        this.j = new AtomicBoolean(false);
    }

    private final Set h(Iterable iterable) {
        djsi djsiVar = (djsi) this.f.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            djrj a2 = djsiVar.a((djrm) it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((avkc) this.g.b()).c(((djrj) it2.next()).a));
        }
        return ffdx.ar(arrayList2);
    }

    private final void i() {
        if (!this.j.get()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleTransport");
            ((enrr) h.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "kickOffUpdateTransportRegistration", 205, "ChatTransportControllerImpl.kt")).q("Not kicking off update transport registration because RCS provisioning change has not been received.");
        } else {
            ensk e = a.e();
            e.Y(ente.a, "BugleTransport");
            ((enrr) e.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "kickOffUpdateTransportRegistration", 210, "ChatTransportControllerImpl.kt")).q("Kicking off update transport registration.");
            axol.k(this.i, null, new crgj(this, null), 3);
        }
    }

    @Override // defpackage.djru
    public final void a(String str, djtc djtcVar) {
        ekzz f = eleg.f("ChatTransportControllerImpl#onRcsAvailabilityUpdate");
        try {
            b(fffi.b(new djro(str)));
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.djrl
    public final void b(Set set) {
        ekzz f = eleg.f("ChatTransportControllerImpl#onRcsProvisioningChange");
        try {
            ensk e = a.e();
            e.Y(ente.a, "BugleTransport");
            ((enrr) e.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "onRcsProvisioningChange", 115, "ChatTransportControllerImpl.kt")).q("onRcsProvisioningChange event received. Kicking off transport registration update.");
            this.j.set(true);
            i();
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.crgh
    public final crgf c(awui awuiVar) {
        awuiVar.getClass();
        ekzz f = eleg.f("ChatTransportControllerImpl#getChatTransport");
        try {
            djsi djsiVar = (djsi) this.f.b();
            djrk djrkVar = this.h;
            String str = awuiVar.d;
            str.getClass();
            djrm c = djsiVar.c(djrkVar.a(str));
            if (c == null) {
                crgf crgfVar = crgf.a;
                ffig.a(f, null);
                return crgfVar;
            }
            crgf crgfVar2 = (crgf) ((crgy) this.d.b()).a().get(djrn.a(c));
            if (crgfVar2 == null) {
                crgfVar2 = crgf.a;
            }
            ffig.a(f, null);
            return crgfVar2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.crgh
    @ffbs
    public final eqna d() {
        ekzz f = eleg.f("ChatTransportControllerImpl#enabledTransport");
        try {
            crgf crgfVar = (crgf) ffdx.L(g());
            if (crgfVar == null) {
                crgfVar = crgf.a;
            }
            eqna eqnaVar = crgfVar.f;
            ffig.a(f, null);
            return eqnaVar;
        } finally {
        }
    }

    @Override // defpackage.crgh
    public final Set e() {
        ekzz f = eleg.f("ChatTransportControllerImpl#getChatEndpoints");
        try {
            enhk a2 = ((crgy) this.d.b()).a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = a2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((crgf) entry.getValue()) != crgf.a) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set h = h(linkedHashMap.keySet());
            ffig.a(f, null);
            return h;
        } finally {
        }
    }

    @Override // defpackage.crgh
    public final Set f(crgf crgfVar) {
        crgfVar.getClass();
        ekzz f = eleg.f("ChatTransportControllerImpl#getChatEndpoints_forChatTransport");
        try {
            Set h = h(((crgy) this.d.b()).a().u().f().c(crgfVar));
            ffig.a(f, null);
            return h;
        } finally {
        }
    }

    @Override // defpackage.crgh
    public final Set g() {
        ekzz f = eleg.f("ChatTransportControllerImpl#getChatTransports");
        try {
            Collection values = ((crgy) this.d.b()).a().values();
            values.getClass();
            Set ar = ffdx.ar(values);
            ffig.a(f, null);
            return ar;
        } finally {
        }
    }

    @Override // defpackage.cfug
    public final boolean ge() {
        return true;
    }

    @Override // defpackage.cfug
    public final void gg() {
        ekzz f = eleg.f("ChatTransportControllerImpl#onBuglePhenotypeFlagChanged");
        try {
            ensk e = a.e();
            e.Y(ente.a, "BugleTransport");
            ((enrr) e.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "onBuglePhenotypeFlagChanged", 97, "ChatTransportControllerImpl.kt")).q("onBuglePhenotypeFlagChanged event received. Kicking off transport registration update.");
            i();
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.djrx
    public final void gh(String str, Optional optional) {
        ekzz f = eleg.f("ChatTransportControllerImpl#onRcsConfigurationUpdate");
        try {
            b(fffi.d(new djro(str)));
            ffig.a(f, null);
        } finally {
        }
    }

    @Override // defpackage.dihl
    public final void u() {
        ekzz f = eleg.f("ChatTransportControllerImpl#onSystemBound");
        try {
            ensk e = a.e();
            e.Y(ente.a, "BugleTransport");
            ((enrr) e.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl", "onSystemBound", 107, "ChatTransportControllerImpl.kt")).q("onSystemBound event received. Kicking off transport registration update.");
            i();
            ffig.a(f, null);
        } finally {
        }
    }
}
