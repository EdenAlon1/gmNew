package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edqt extends edrt {
    private final edqc a;

    public edqt(edqc edqcVar) {
        this.a = edqcVar;
    }

    @Override // defpackage.edrt
    public final edqc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edrt) {
            return this.a.equals(((edrt) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FetchPlaceResponse{place=" + this.a.toString() + "}";
    }
}
