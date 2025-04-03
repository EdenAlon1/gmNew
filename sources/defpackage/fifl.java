package defpackage;

import android.accounts.AccountManagerCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import org.chromium.net.HttpNegotiateAuthenticator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fifl extends BroadcastReceiver {
    final /* synthetic */ Context a;
    final /* synthetic */ fifm b;

    public fifl(fifm fifmVar, Context context) {
        this.b = fifmVar;
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.unregisterReceiver(this);
        fifm fifmVar = this.b;
        HttpNegotiateAuthenticator httpNegotiateAuthenticator = fifmVar.b;
        fifn fifnVar = fifmVar.a;
        fifnVar.b.getAuthToken(fifnVar.e, fifnVar.d, fifnVar.c, true, (AccountManagerCallback<Bundle>) new fifm(httpNegotiateAuthenticator, fifnVar), (Handler) null);
    }
}
