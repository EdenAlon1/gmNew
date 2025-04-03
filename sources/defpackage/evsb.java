package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evsb {
    public final String a;

    public evsb(evsc evscVar) {
        this.a = evscVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof evsb) {
            return Objects.equals(this.a, ((evsb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return "CapabilityAlias{alias='" + this.a + "'}";
    }
}
