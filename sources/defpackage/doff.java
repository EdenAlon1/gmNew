package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doff {
    public final boolean a;

    public doff(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof doff) && this.a == ((doff) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableEmotify=" + this.a + ")";
    }

    public doff() {
        this(false);
    }
}
