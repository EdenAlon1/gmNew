package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikz implements aihs {
    public final aila a;

    public aikz(aila ailaVar) {
        this.a = ailaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aikz) && ffkj.e(this.a, ((aikz) obj).a);
    }

    public final int hashCode() {
        return 3;
    }

    public final String toString() {
        return "Home(arguments=" + this.a + ")";
    }
}
