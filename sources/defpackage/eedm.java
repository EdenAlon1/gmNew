package defpackage;

import java.net.InetAddress;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eedm extends eeeq {
    private final InetAddress a;
    private final int b;
    private final eeev c;

    public eedm(InetAddress inetAddress, int i, eeev eeevVar) {
        if (inetAddress == null) {
            throw new NullPointerException("Null inetAddress");
        }
        this.a = inetAddress;
        this.b = i;
        if (eeevVar == null) {
            throw new NullPointerException("Null transport");
        }
        this.c = eeevVar;
    }

    @Override // defpackage.eeeq
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eeeq
    public final eeev b() {
        return this.c;
    }

    @Override // defpackage.eeeq
    public final InetAddress c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eeeq) {
            eeeq eeeqVar = (eeeq) obj;
            if (this.a.equals(eeeqVar.c()) && this.b == eeeqVar.a() && this.c.equals(eeeqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        eeev eeevVar = this.c;
        return "DnsTransportAddress{inetAddress=" + this.a.toString() + ", port=" + this.b + ", transport=" + eeevVar.toString() + "}";
    }
}
