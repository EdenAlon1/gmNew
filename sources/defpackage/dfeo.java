package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfeo implements lon {
    final /* synthetic */ SignInHubActivity a;

    public dfeo(SignInHubActivity signInHubActivity) {
        this.a = signInHubActivity;
    }

    @Override // defpackage.lon
    public final lox a(int i, Bundle bundle) {
        return new dfec(this.a, dfre.a());
    }

    @Override // defpackage.lon
    public final /* bridge */ /* synthetic */ void b(lox loxVar, Object obj) {
        SignInHubActivity signInHubActivity = this.a;
        signInHubActivity.setResult(signInHubActivity.n, signInHubActivity.o);
        this.a.finish();
    }

    @Override // defpackage.lon
    public final void c(lox loxVar) {
    }
}
