package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceyn extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ ceyo a;
    final /* synthetic */ ConnectivityManager b;

    public ceyn(ceyo ceyoVar, ConnectivityManager connectivityManager) {
        this.a = ceyoVar;
        this.b = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        fgcm fgcmVar;
        Object c;
        ffga ffgaVar;
        fgcm fgcmVar2;
        Object c2;
        ffga ffgaVar2;
        network.getClass();
        if (((ersq) ((avdq) this.a.b).a.b()).a("bugle.handle_network_with_null_capabilities")) {
            NetworkCapabilities networkCapabilities = this.b.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                return;
            }
            this.a.d.h(ffcu.a);
            ceyo ceyoVar = this.a;
            do {
                fgcmVar2 = ceyoVar.c;
                c2 = fgcmVar2.c();
                ffgaVar2 = new ffga();
                ffgaVar2.putAll((Map) c2);
                ffgaVar2.put(Long.valueOf(network.getNetworkHandle()), networkCapabilities);
            } while (!fgcmVar2.g(c2, ffew.b(ffgaVar2)));
            return;
        }
        this.a.d.h(ffcu.a);
        ceyo ceyoVar2 = this.a;
        ConnectivityManager connectivityManager = this.b;
        do {
            fgcmVar = ceyoVar2.c;
            c = fgcmVar.c();
            ffgaVar = new ffga();
            ffgaVar.putAll((Map) c);
            Long valueOf = Long.valueOf(network.getNetworkHandle());
            NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(network);
            networkCapabilities2.getClass();
            ffgaVar.put(valueOf, networkCapabilities2);
        } while (!fgcmVar.g(c, ffew.b(ffgaVar)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        fgcm fgcmVar;
        Object c;
        ffga ffgaVar;
        network.getClass();
        networkCapabilities.getClass();
        this.a.d.h(ffcu.a);
        do {
            fgcmVar = this.a.c;
            c = fgcmVar.c();
            ffgaVar = new ffga();
            ffgaVar.putAll((Map) c);
            ffgaVar.put(Long.valueOf(network.getNetworkHandle()), networkCapabilities);
        } while (!fgcmVar.g(c, ffew.b(ffgaVar)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        fgcm fgcmVar;
        Object c;
        ffga ffgaVar;
        network.getClass();
        do {
            fgcmVar = this.a.c;
            c = fgcmVar.c();
            ffgaVar = new ffga();
            ffgaVar.putAll((Map) c);
            ffgaVar.remove(Long.valueOf(network.getNetworkHandle()));
        } while (!fgcmVar.g(c, ffew.b(ffgaVar)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.a.d.h(ffcu.a);
    }
}
