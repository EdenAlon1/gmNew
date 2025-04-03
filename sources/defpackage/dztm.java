package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dztm extends dzto {
    private final dzsq b;

    public dztm(dzsq dzsqVar) {
        this.b = dzsqVar;
    }

    @Override // defpackage.dzto, defpackage.dzvq
    public final dzsq a() {
        return this.b;
    }

    @Override // defpackage.dzvq
    public final dzvp b() {
        return dzvp.MEDIA_ID;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzvq) {
            dzvq dzvqVar = (dzvq) obj;
            if (dzvp.MEDIA_ID == dzvqVar.b() && this.b.equals(dzvqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaSource{mediaId=" + this.b.toString() + "}";
    }
}
