package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.PhoneNumberInfo;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfzl extends dfzr {
    final /* synthetic */ dhri a;

    public dfzl(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // defpackage.dfzr, com.google.android.gms.constellation.internal.IConstellationCallbacks
    public final void onPhoneNumberVerified(Status status, List<PhoneNumberInfo> list) {
        try {
            dfup.b(status, list, this.a);
        } catch (RejectedExecutionException e) {
            dfzs.a.f("Rejected API result: ", e, new Object[0]);
        }
    }
}
