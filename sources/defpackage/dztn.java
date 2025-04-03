package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dztn extends dzto {
    private final String b;

    public dztn(String str) {
        this.b = str;
    }

    @Override // defpackage.dzvq
    public final dzvp b() {
        return dzvp.URL;
    }

    @Override // defpackage.dzto, defpackage.dzvq
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzvq) {
            dzvq dzvqVar = (dzvq) obj;
            if (dzvp.URL == dzvqVar.b() && this.b.equals(dzvqVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaSource{url=" + this.b + "}";
    }
}
