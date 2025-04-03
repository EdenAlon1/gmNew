package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evom extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() != 9) {
            return InetAddress.getByName(evplVar.j());
        }
        evplVar.p();
        return null;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        evpnVar.m(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
