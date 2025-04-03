package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhf {
    public final fhey a;
    public final Proxy b;
    public final InetSocketAddress c;

    public fhhf(fhey fheyVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        proxy.getClass();
        inetSocketAddress.getClass();
        this.a = fheyVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean a() {
        return this.a.c != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fhhf)) {
            return false;
        }
        fhhf fhhfVar = (fhhf) obj;
        return ffkj.e(fhhfVar.a, this.a) && ffkj.e(fhhfVar.b, this.b) && ffkj.e(fhhfVar.c, this.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }
}
