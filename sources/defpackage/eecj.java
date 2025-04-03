package defpackage;

import j$.util.Optional;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eecj implements eecn {
    private final eeco a;
    private final eecm b;
    private final String c;
    private final int d;
    private final Optional e;

    public eecj(eeco eecoVar, eecm eecmVar, String str, int i, Optional optional) {
        this.a = eecoVar;
        this.b = eecmVar;
        this.c = str;
        this.d = i;
        this.e = optional;
    }

    @Override // defpackage.eecn
    public final Optional a() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [eebp, java.lang.Object] */
    @Override // defpackage.eecn
    public final Socket b() {
        Socket a = this.a.a();
        boolean z = a instanceof SSLSocket;
        Socket h = eebo.h(a);
        String str = this.c;
        InetAddress a2 = this.b.a(h, true != z ? null : str);
        int i = this.d;
        InetSocketAddress inetSocketAddress = a2 != null ? new InetSocketAddress(a2, i) : new InetSocketAddress(str, i);
        dkty.d(dkty.b, "Connecting %s to %s", a.getClass().getName(), dktx.IP_ADDRESS.c(inetSocketAddress));
        a.connect(inetSocketAddress, 15000);
        if (this.e.isPresent()) {
            dkty.d(dkty.b, "Socket [isBound = %s, isConnected = %s, isClosed = %s, localAddress = %s, remoteAddress = %s]", Boolean.valueOf(a.isBound()), Boolean.valueOf(a.isConnected()), Boolean.valueOf(a.isClosed()), dktx.IP_ADDRESS.c(a.getLocalSocketAddress()), dktx.IP_ADDRESS.c(a.getRemoteSocketAddress()));
            try {
                this.e.get().b(eebo.h(a));
                return a;
            } catch (IOException e) {
                if (!dizg.x()) {
                    dkty.t(e, dkty.b, "[SR] Failed to setup dedicated bearer, fallback disabled.", new Object[0]);
                    throw e;
                }
                dkty.t(e, dkty.b, "[SR] Failed to setup dedicated bearer, falling back to default bearer.", new Object[0]);
            }
        }
        return a;
    }
}
