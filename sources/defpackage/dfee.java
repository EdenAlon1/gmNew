package defpackage;

import com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfee extends AbstractSignInCallbacks {
    final /* synthetic */ dfef a;

    public dfee(dfef dfefVar) {
        this.a = dfefVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks, com.google.android.gms.auth.api.signin.internal.ISignInCallbacks
    public final void onSignedOutFromGoogle(Status status) {
        this.a.l(status);
    }
}
