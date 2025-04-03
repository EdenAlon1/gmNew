package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import internal.J.N;
import java.io.IOException;
import org.chromium.net.HttpNegotiateAuthenticator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fifm implements AccountManagerCallback {
    public final fifn a;
    final /* synthetic */ HttpNegotiateAuthenticator b;

    public fifm(HttpNegotiateAuthenticator httpNegotiateAuthenticator, fifn fifnVar) {
        this.b = httpNegotiateAuthenticator;
        this.a = fifnVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (!bundle.containsKey("intent")) {
                this.b.processResult(bundle, this.a);
            } else {
                Context context = fidy.a;
                fidy.a(context, new fifl(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.w("cn_net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
            fifn fifnVar = this.a;
            N.M0s8NeYn(fifnVar.a, this.b, -9, null);
        }
    }
}
