package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpcl implements cpcc {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/sms/config/accessors/SystemCarrierConfigAccessor");
    private final ffbr b;
    private final ctwb c;

    public cpcl(ffbr ffbrVar, ctwb ctwbVar) {
        ffbrVar.getClass();
        ctwbVar.getClass();
        this.b = ffbrVar;
        this.c = ctwbVar;
    }

    @Override // defpackage.cpcc
    public final Bundle a(int i) {
        csrw csrwVar = (csrw) this.b.b();
        SparseArray sparseArray = csrwVar.b;
        if (sparseArray != null && ((cssv) csrwVar.a.b()).a() && ((Integer[]) sparseArray.get(i)) != null) {
            return new Bundle();
        }
        try {
            Optional j = this.c.h(i).j();
            Bundle bundle = new Bundle();
            if (j.isPresent()) {
                bundle.putAll((Bundle) j.get());
                if (bundle.get("spamForwardingNumber") instanceof Boolean) {
                    bundle.remove("spamForwardingNumber");
                }
            }
            return bundle;
        } catch (Exception e) {
            enrr enrrVar = (enrr) a.j();
            enrrVar.Y(ente.a, "Bugle");
            ((enrr) enrrVar.g(e).h("com/google/android/apps/messaging/shared/sms/config/accessors/SystemCarrierConfigAccessor", "get", 52, "SystemCarrierConfigAccessor.kt")).q("Error fetching system carrier config values");
            return new Bundle();
        }
    }
}
