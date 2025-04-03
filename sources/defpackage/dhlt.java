package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhlt extends dhlu {
    final /* synthetic */ dhri a;

    public dhlt(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // defpackage.dhlu, com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
    public final void onTokenRetrieved(Status status, PseudonymousIdToken pseudonymousIdToken) {
        dfup.b(status, pseudonymousIdToken, this.a);
    }
}
