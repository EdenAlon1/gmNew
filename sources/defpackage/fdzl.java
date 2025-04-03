package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzl extends feco {
    private static final long serialVersionUID = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;

    public fdzl(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        socketAddress.getClass();
        inetSocketAddress.getClass();
        emxf.p(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fdzl)) {
            return false;
        }
        fdzl fdzlVar = (fdzl) obj;
        return emxb.a(this.a, fdzlVar.a) && emxb.a(this.b, fdzlVar.b) && emxb.a(this.c, fdzlVar.c) && emxb.a(this.d, fdzlVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("proxyAddr", this.a);
        b.b("targetAddr", this.b);
        b.b("username", this.c);
        b.h("hasPassword", this.d != null);
        return b.toString();
    }
}
