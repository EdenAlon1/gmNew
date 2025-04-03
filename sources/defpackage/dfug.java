package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.SignInCoordinator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfug implements Runnable {
    final /* synthetic */ SignInCoordinator a;

    public dfug(SignInCoordinator signInCoordinator) {
        this.a = signInCoordinator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dfui dfuiVar;
        dfuiVar = this.a.h;
        dfuiVar.b(new ConnectionResult(4));
    }
}
