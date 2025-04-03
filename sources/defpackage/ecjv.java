package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecjv extends ecjw {
    private final int a;

    public ecjv(int i) {
        this.a = i;
    }

    @Override // defpackage.ecjw
    public final int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ecjw) && this.a == ((ecjw) obj).d();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "PrimesProfilingV2Configurations{enablement=" + echm.a(this.a) + "}";
    }
}
