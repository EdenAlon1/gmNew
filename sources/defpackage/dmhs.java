package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmhs {
    public final boolean a;

    public dmhs(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmhs) && this.a == ((dmhs) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(removeSwipeWhenTalkbackEnabled=" + this.a + ")";
    }

    public dmhs() {
        this(false);
    }
}
