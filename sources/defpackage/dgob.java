package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgob extends SimpleGoogleHelpCallbacks {
    final /* synthetic */ dgoc a;

    public dgob(dgoc dgocVar) {
        this.a = dgocVar;
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public final void onAsyncPsbdSaved() {
        this.a.l(Status.a);
    }
}
