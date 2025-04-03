package defpackage;

import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deyn extends deyr {
    final /* synthetic */ dhri a;

    public deyn(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // defpackage.deyr, com.google.android.gms.asterism.internal.IAsterismCallbacks
    public final void onConsentFetched(Status status, GetAsterismConsentResponse getAsterismConsentResponse) {
        dfup.b(status, getAsterismConsentResponse, this.a);
    }
}
