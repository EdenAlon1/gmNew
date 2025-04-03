package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsop extends dsos {
    private final int a;

    public dsop(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsop) && this.a == ((dsop) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Closing(currentHeight=" + this.a + ")";
    }
}
