package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmj {
    public final boolean a;

    public dnmj(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnmj) && this.a == ((dnmj) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(showClearOnFocusOrContent=" + this.a + ")";
    }

    public dnmj() {
        this(false);
    }
}
