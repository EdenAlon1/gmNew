package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebcn extends ebcy {
    private final ebcx a;

    public ebcn(ebcx ebcxVar) {
        this.a = ebcxVar;
    }

    @Override // defpackage.ebcy
    public final ebcx a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebcy) {
            return this.a.equals(((ebcy) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CardRetrieverWrapper{cardRetriever=" + this.a.toString() + "}";
    }
}
