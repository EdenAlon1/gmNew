package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfz implements dtga {
    public final drng a;

    public dtfz(drng drngVar) {
        this.a = drngVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtfz) && ffkj.e(this.a, ((dtfz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Stopped(audioFile=" + this.a + ")";
    }
}
