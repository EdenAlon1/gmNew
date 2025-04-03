package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aphi {
    public final int a;

    public aphi(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aphi) && this.a == ((aphi) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "SatelliteConfigImpl(maxMessageSize=" + this.a + ")";
    }
}
