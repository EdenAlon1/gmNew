package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzns extends dzqy {
    public final engw a;

    public dzns(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.dzqy
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzqy) {
            return enkr.h(this.a, ((dzqy) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ReceiptMetadata{contactIds=" + this.a.toString() + "}";
    }
}
