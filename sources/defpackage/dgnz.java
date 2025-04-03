package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgnz extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ dgoa a;

    public dgnz(dgoa dgoaVar) {
        this.a = dgoaVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onAsyncPsdSaved() {
        this.a.l(Status.a);
    }
}
