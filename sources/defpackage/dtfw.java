package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfw implements dtga {
    public final int a;

    public dtfw(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtfw) && this.a == ((dtfw) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Error(errorMessage=" + this.a + ")";
    }
}
