package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbc implements dtbd {
    private final int a;

    public dtbc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtbc) && this.a == ((dtbc) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Open(selectedItemCount=" + this.a + ")";
    }
}
