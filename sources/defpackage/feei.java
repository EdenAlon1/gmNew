package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feei {
    public static final feei a;
    public final int b;

    static {
        feeh feehVar = new feeh(0);
        feehVar.b(1);
        a = feehVar.a();
    }

    public feei(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.b == ((feei) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return "BindServiceFlags{" + Integer.toHexString(this.b) + "}";
    }
}
