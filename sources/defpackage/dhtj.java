package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhtj extends dhtr {
    public final Long a;
    public final int b;

    public dhtj(Long l, int i) {
        this.a = l;
        this.b = i;
    }

    @Override // defpackage.dhsg
    public final long a(dhsh dhshVar, dhsh dhshVar2) {
        b(dhshVar);
        b(dhshVar2);
        return dhut.c(dhshVar2.b, dhshVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dhtj) {
            return Objects.equals(this.a, ((dhtj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "BasicPhysicalTicker";
    }
}
