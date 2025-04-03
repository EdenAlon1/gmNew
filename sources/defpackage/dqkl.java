package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqkl {
    public final boolean a;

    public dqkl(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqkl) && this.a == ((dqkl) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "TracingConfiguration(isEnabled=" + this.a + ")";
    }

    public dqkl() {
        this(true);
    }
}
