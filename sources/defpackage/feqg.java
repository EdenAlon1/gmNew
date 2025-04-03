package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqg extends fecd {
    final SocketAddress a;
    final String b;
    final Collection c;

    public feqg(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
        this.c = Collections.singleton(socketAddress.getClass());
    }

    @Override // defpackage.febx
    public final fecc a(URI uri, febv febvVar) {
        return new feqf(this);
    }

    @Override // defpackage.febx
    public final String b() {
        return "directaddress";
    }

    @Override // defpackage.fecd
    public final Collection c() {
        return this.c;
    }

    @Override // defpackage.fecd
    protected final void d() {
    }

    @Override // defpackage.fecd
    protected final void e() {
    }
}
