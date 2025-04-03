package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsoq extends dsos {
    private final int a;

    public dsoq(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsoq) && this.a == ((dsoq) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Open(height=" + this.a + ")";
    }
}
