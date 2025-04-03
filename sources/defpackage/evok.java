package defpackage;

import java.net.URL;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evok extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        String j = evplVar.j();
        if (j.equals("null")) {
            return null;
        }
        return new URL(j);
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        URL url = (URL) obj;
        evpnVar.m(url == null ? null : url.toExternalForm());
    }
}
