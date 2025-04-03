package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzk {
    public String a;
    public String b;
    private SocketAddress c;
    private InetSocketAddress d;

    public final fdzl a() {
        return new fdzl(this.c, this.d, this.a, this.b);
    }

    public final void b(SocketAddress socketAddress) {
        socketAddress.getClass();
        this.c = socketAddress;
    }

    public final void c(InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.d = inetSocketAddress;
    }
}
