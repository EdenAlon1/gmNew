package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajnf {
    public final avlk a;
    public final Instant b;

    public ajnf(avlk avlkVar, Instant instant) {
        this.a = avlkVar;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajnf)) {
            return false;
        }
        ajnf ajnfVar = (ajnf) obj;
        return ffkj.e(this.a, ajnfVar.a) && ffkj.e(this.b, ajnfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RcsCapabilitiesWithTimestamp(capabilities=" + this.a + ", timestamp=" + this.b + ")";
    }
}
