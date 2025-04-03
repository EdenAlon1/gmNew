package defpackage;

import com.google.android.gms.common.api.internal.SignInCoordinator;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfuh implements Runnable {
    final /* synthetic */ SignInResponse a;
    final /* synthetic */ SignInCoordinator b;

    public dfuh(SignInCoordinator signInCoordinator, SignInResponse signInResponse) {
        this.a = signInResponse;
        this.b = signInCoordinator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SignInCoordinator.m262$$Nest$msignInComplete(this.b, this.a);
    }
}
