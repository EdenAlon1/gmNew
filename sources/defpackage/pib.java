package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pib {
    public static final pib b = new pia(1.0f);
    public static final pib c = new phy();
    private final String a;

    public pib(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pib) {
            return ffkj.e(this.a, ((pib) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
