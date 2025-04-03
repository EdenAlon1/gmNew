package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgi extends qgk {
    private final String a = "rest";

    @Override // defpackage.qgk
    public final float a(qci qciVar) {
        qht c = qciVar.c(this.a);
        if (c == null) {
            return 1.0f;
        }
        return ffmk.e((c.b + c.c) / qciVar.k, 0.0f, 1.0f);
    }

    @Override // defpackage.qgk
    public final float b(qci qciVar) {
        qht c = qciVar.c(this.a);
        return ffmk.e((c != null ? c.b : 0.0f) / qciVar.k, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qgi) && ffkj.e(this.a, ((qgi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Marker(marker=" + this.a + ")";
    }
}
