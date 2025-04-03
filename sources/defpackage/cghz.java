package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cghz {
    public final Set a;
    public final Set b;

    public cghz(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cghz)) {
            return false;
        }
        cghz cghzVar = (cghz) obj;
        return ffkj.e(this.a, cghzVar.a) && ffkj.e(this.b, cghzVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AllowedAndDisallowedParticipants(allowedParticipants=" + this.a + ", disallowedParticipants=" + this.b + ")";
    }
}
