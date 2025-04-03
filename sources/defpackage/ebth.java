package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebth extends ebtq {
    private final ebtg b;

    public ebth(ebtg ebtgVar) {
        this.b = ebtgVar;
    }

    @Override // defpackage.ebtq
    public final ebtg b() {
        return this.b;
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebtq) {
            return this.b.equals(((ebtq) obj).b());
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }
}
