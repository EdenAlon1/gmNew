package defpackage;

import android.telephony.TelephonyManager;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfsl implements cfsk {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/emergency/ErcsConfigRetrieverImpl");
    private final ffbr b;
    private final ffbr c;

    public cfsl(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.cfsk
    public final Optional a(String str) {
        str.getClass();
        if (!((aojk) this.b.b()).b()) {
            return Optional.empty();
        }
        TelephonyManager telephonyManager = (TelephonyManager) ((ctvs) ((ctvb) this.c.b()).d.b()).d.get();
        Optional i = ctvb.i(telephonyManager == null ? null : telephonyManager.getNetworkOperator());
        if (!i.isPresent()) {
            ((enrr) a.j().h("com/google/android/apps/messaging/shared/emergency/ErcsConfigRetrieverImpl", "getConfig", 65, "ErcsConfigRetrieverImpl.kt")).q("Cannot parse MCC.");
            return Optional.empty();
        }
        Object obj = i.get();
        eygr eygrVar = ((aojk) this.b.b()).a().b;
        eygrVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : eygrVar) {
            fdab fdabVar = (fdab) obj2;
            eygr eygrVar2 = fdabVar.b;
            eygrVar2.getClass();
            if (!eygrVar2.isEmpty()) {
                Iterator<E> it = eygrVar2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str2 = (String) it.next();
                        str2.getClass();
                        if (ffpc.t((String) obj, str2)) {
                            if (fdabVar.c.contains(str)) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            enrr enrrVar = (enrr) a.e();
            enrrVar.Y(csux.E, str);
            enrrVar.Y(csux.N, obj);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/emergency/ErcsConfigRetrieverImpl", "getConfig", 44, "ErcsConfigRetrieverImpl.kt")).q("No ERCSConfig matched.");
            return Optional.empty();
        }
        if (arrayList.size() > 1) {
            enrr enrrVar2 = (enrr) a.j();
            enrrVar2.Y(csux.E, str);
            enrrVar2.Y(csux.N, obj);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/emergency/ErcsConfigRetrieverImpl", "getConfig", 52, "ErcsConfigRetrieverImpl.kt")).q("Multiple ERCSConfigs matched.");
            return Optional.empty();
        }
        enrr enrrVar3 = (enrr) a.h();
        enrrVar3.Y(csux.E, str);
        enrrVar3.Y(csux.N, obj);
        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/emergency/ErcsConfigRetrieverImpl", "getConfig", 60, "ErcsConfigRetrieverImpl.kt")).q("Single ERCSConfig matched.");
        return Optional.of(ffdx.T(arrayList));
    }

    @Override // defpackage.cfsk
    public final boolean b(String str) {
        str.getClass();
        eygr eygrVar = ((aojk) this.b.b()).a().b;
        eygrVar.getClass();
        if (eygrVar.isEmpty()) {
            return false;
        }
        Iterator<E> it = eygrVar.iterator();
        while (it.hasNext()) {
            if (((fdab) it.next()).c.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
