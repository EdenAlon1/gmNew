package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovj {
    public final boolean a;

    public dovj(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dovj) && this.a == ((dovj) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(fixUriCache=" + this.a + ")";
    }

    public dovj() {
        this(false);
    }
}
