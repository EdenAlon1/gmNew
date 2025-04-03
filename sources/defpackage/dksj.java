package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksj {
    private final dkvp a;
    private final ctwb b;
    private final Object c = new Object();
    private ConnectivityManager.NetworkCallback d = null;

    public dksj(Context context, ctwb ctwbVar) {
        this.a = dkvo.f(context);
        this.b = ctwbVar;
    }

    public final Network a() {
        this.b.i();
        Network network = null;
        if (!this.b.i().B()) {
            return null;
        }
        SettableFuture create = SettableFuture.create();
        NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
        try {
            synchronized (this.c) {
                dksi dksiVar = new dksi(create);
                this.d = dksiVar;
                try {
                    ((dkvo) this.a).a.requestNetwork(build, dksiVar);
                } catch (SecurityException e) {
                    throw new dkvd("ACCESS_NETWORK_STATE permission is missing.", e);
                }
            }
            network = (Network) create.get(10L, TimeUnit.SECONDS);
        } catch (dkvd e2) {
            dkty.i(e2, "Do not have required permission to get mobile network.", new Object[0]);
        } catch (TimeoutException e3) {
            dkty.i(e3, "Timeout when trying to get mobile network.", new Object[0]);
        } catch (Exception e4) {
            dkty.i(e4, "Exception when trying to get mobile network.", new Object[0]);
        }
        dkty.o("Got mobile network: %s", network);
        if (network == null) {
            b();
        }
        return network;
    }

    public final void b() {
        synchronized (this.c) {
            ConnectivityManager.NetworkCallback networkCallback = this.d;
            if (networkCallback != null) {
                try {
                    this.a.h(networkCallback);
                } catch (Exception e) {
                    dkty.i(e, "Exception when trying close network.", new Object[0]);
                }
                this.d = null;
            }
        }
    }
}
