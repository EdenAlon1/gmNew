package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.net.ProxyChangeListener;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class figa extends BroadcastReceiver {
    private final ProxyChangeListener a;

    public figa(ProxyChangeListener proxyChangeListener) {
        this.a = proxyChangeListener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            this.a.updateProxyConfigFromConnectivityManager(intent);
        }
    }
}
