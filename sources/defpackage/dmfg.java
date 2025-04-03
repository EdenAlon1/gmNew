package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmfg {
    public final boolean a;

    public dmfg(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmfg) && this.a == ((dmfg) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(zippyGaiaTosEnabled=" + this.a + ")";
    }

    public dmfg() {
        this(false);
    }
}
