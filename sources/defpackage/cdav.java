package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdav extends cdaz {
    private final ccce a;
    private final cfkl b;

    public cdav(ccce ccceVar, cfkl cfklVar) {
        this.a = ccceVar;
        this.b = cfklVar;
    }

    @Override // defpackage.cdaz
    public final ccce a() {
        return this.a;
    }

    @Override // defpackage.cdaz
    public final cfkl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdaz) {
            cdaz cdazVar = (cdaz) obj;
            if (this.a.equals(cdazVar.a()) && this.b.equals(cdazVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cfkl cfklVar = this.b;
        return "BatchSchedulingResult{scheduledItem=" + this.a.toString() + ", requestExtras=" + cfklVar.toString() + "}";
    }
}
