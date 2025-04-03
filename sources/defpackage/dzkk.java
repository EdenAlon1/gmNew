package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzkk extends dzkl {
    public final dzqy a;

    public dzkk(dzqy dzqyVar) {
        this.a = dzqyVar;
    }

    @Override // defpackage.dzkl, defpackage.dzou
    public final dzqy a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzou) {
            dzou dzouVar = (dzou) obj;
            dzouVar.b();
            if (this.a.equals(dzouVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Metadata{receiptMetadata=" + this.a.toString() + "}";
    }

    @Override // defpackage.dzou
    public final void b() {
    }
}
