package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqk {
    public final boolean a;

    public zqk(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqk) && this.a == ((zqk) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(animateTypingIndicatorVisibility=" + this.a + ")";
    }

    public zqk() {
        this(false);
    }
}
