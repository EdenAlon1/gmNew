package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class denz {
    public final boolean a;

    public denz(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof denz) && this.a == ((denz) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(addMinorUiTweaksToWelcome=" + this.a + ")";
    }

    public denz() {
        this(false);
    }
}
