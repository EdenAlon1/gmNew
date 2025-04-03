package defpackage;

import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deyp extends deyr {
    final /* synthetic */ dhri a;

    public deyp(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // defpackage.deyr, com.google.android.gms.asterism.internal.IAsterismCallbacks
    public final void onConsentRegistered(Status status, SetAsterismConsentResponse setAsterismConsentResponse) {
        dfup.b(status, setAsterismConsentResponse, this.a);
    }
}
