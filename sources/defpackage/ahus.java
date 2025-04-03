package defpackage;

import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahus {
    public static final ChipData a(alxn alxnVar) {
        return new ChipData(new ChipId.Conversation(alxnVar.c()), alxnVar.e(), null, alxnVar.b(), alxnVar.a() <= 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ChipData b(amar amarVar, aoku aokuVar) {
        engw b = amarVar.b();
        if (!b.isEmpty()) {
            enqv it = b.iterator();
            while (it.hasNext()) {
                if (((ambh) it.next()).a.equals(aokuVar)) {
                    return new ChipData(new ChipId.Identity(aokuVar), amarVar.d(), amarVar.f(), amarVar.a(), false, 16, null);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
