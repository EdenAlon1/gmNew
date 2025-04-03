package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edrb extends edsb {
    public final List a;
    public final dhqd b;

    public edrb(List list, dhqd dhqdVar) {
        this.a = list;
        this.b = dhqdVar;
    }

    @Override // defpackage.edsb, defpackage.edkr
    public final dhqd a() {
        return this.b;
    }

    @Override // defpackage.edsb
    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        dhqd dhqdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof edsb) {
            edsb edsbVar = (edsb) obj;
            if (this.a.equals(edsbVar.b()) && ((dhqdVar = this.b) != null ? dhqdVar.equals(edsbVar.a()) : edsbVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        dhqd dhqdVar = this.b;
        return (hashCode * 1000003) ^ (dhqdVar == null ? 0 : dhqdVar.hashCode());
    }

    public final String toString() {
        dhqd dhqdVar = this.b;
        return "FindCurrentPlaceRequest{placeFields=" + this.a.toString() + ", cancellationToken=" + String.valueOf(dhqdVar) + "}";
    }
}
