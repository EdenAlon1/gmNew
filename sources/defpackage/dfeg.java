package defpackage;

import com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfeg extends AbstractSignInCallbacks {
    final /* synthetic */ dfeh a;

    public dfeg(dfeh dfehVar) {
        this.a = dfehVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.AbstractSignInCallbacks, com.google.android.gms.auth.api.signin.internal.ISignInCallbacks
    public final void onAccessRevokedFromGoogle(Status status) {
        this.a.l(status);
    }
}
