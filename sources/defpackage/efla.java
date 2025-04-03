package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efla {
    public final String a;
    public final Class b;

    public efla(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efla) {
            efla eflaVar = (efla) obj;
            if (this.b == eflaVar.b && this.a.equals(eflaVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
