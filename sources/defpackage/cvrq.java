package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvrq {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ChipData a(amar amarVar, aoku aokuVar) {
        engw b = amarVar.b();
        if (!b.isEmpty()) {
            enqv it = b.iterator();
            while (it.hasNext()) {
                if (((ambh) it.next()).a.equals(aokuVar)) {
                    return new ChipData(aokuVar, amarVar.d(), amarVar.f(), amarVar.a(), false, 16, null);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
