package defpackage;

import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evol extends evlf {
    public static final URI c(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        try {
            String j = evplVar.j();
            if (j.equals("null")) {
                return null;
            }
            return new URI(j);
        } catch (URISyntaxException e) {
            throw new evku(e);
        }
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        return c(evplVar);
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        URI uri = (URI) obj;
        evpnVar.m(uri == null ? null : uri.toASCIIString());
    }
}
