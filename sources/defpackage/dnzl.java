package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnzl {
    public final boolean a;

    public dnzl(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnzl) && this.a == ((dnzl) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableZippyToS=" + this.a + ")";
    }

    public dnzl() {
        this(false);
    }
}
