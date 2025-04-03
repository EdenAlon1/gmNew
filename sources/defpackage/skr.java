package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skr implements sks {
    public final fark a;

    public skr(fark farkVar) {
        this.a = farkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skr) && ffkj.e(this.a, ((skr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Result(sodaEvent=" + this.a + ")";
    }
}
