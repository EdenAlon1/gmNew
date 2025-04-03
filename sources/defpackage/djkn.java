package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djkn extends djkr {
    private final engw a;
    private final engw b;
    private final Network c;
    private final NetworkCapabilities d;
    private final String e;

    public djkn(engw engwVar, engw engwVar2, Network network, NetworkCapabilities networkCapabilities, String str) {
        this.a = engwVar;
        this.b = engwVar2;
        this.c = network;
        this.d = networkCapabilities;
        this.e = str;
    }

    @Override // defpackage.djkr
    public final Network a() {
        return this.c;
    }

    @Override // defpackage.djkr
    public final NetworkCapabilities b() {
        return this.d;
    }

    @Override // defpackage.djkr
    public final engw c() {
        return this.b;
    }

    @Override // defpackage.djkr
    public final engw d() {
        return this.a;
    }

    @Override // defpackage.djkr
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djkr) {
            djkr djkrVar = (djkr) obj;
            if (enkr.h(this.a, djkrVar.d()) && enkr.h(this.b, djkrVar.c()) && this.c.equals(djkrVar.a()) && this.d.equals(djkrVar.b()) && this.e.equals(djkrVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        NetworkCapabilities networkCapabilities = this.d;
        Network network = this.c;
        engw engwVar = this.b;
        return "NetworkInterface{ipAddresses=" + this.a.toString() + ", dnsServers=" + engwVar.toString() + ", network=" + network.toString() + ", networkCapabilities=" + networkCapabilities.toString() + ", interfaceName=" + this.e + "}";
    }
}
