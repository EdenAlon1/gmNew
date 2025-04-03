package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfzn extends dfzr {
    final /* synthetic */ dhri a;

    public dfzn(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // defpackage.dfzr, com.google.android.gms.constellation.internal.IConstellationCallbacks
    public final void onPhoneNumberVerificationsCompleted(Status status, VerifyPhoneNumberResponse verifyPhoneNumberResponse) {
        try {
            dfup.b(status, verifyPhoneNumberResponse, this.a);
        } catch (RejectedExecutionException e) {
            dfzs.a.f("Rejected API result: ", e, new Object[0]);
        }
    }
}
