package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doat {
    public final int a;

    public doat(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof doat) && this.a == ((doat) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Static(resId=" + this.a + ")";
    }
}
