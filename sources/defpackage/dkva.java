package defpackage;

import android.telephony.gba.UaSecurityProtocolIdentifier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkva extends dkvs {
    public final UaSecurityProtocolIdentifier a;

    public dkva(UaSecurityProtocolIdentifier uaSecurityProtocolIdentifier) {
        if (uaSecurityProtocolIdentifier == null) {
            throw new NullPointerException("Null identifier");
        }
        this.a = uaSecurityProtocolIdentifier;
    }

    @Override // defpackage.dkvs
    public final UaSecurityProtocolIdentifier a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkvs) {
            return this.a.equals(((dkvs) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "UaSecurityProtocolIdentifierWrapper{identifier=" + this.a.toString() + "}";
    }
}
