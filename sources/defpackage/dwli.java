package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwli {
    public final jsy a;
    public final int b;

    public dwli(jsy jsyVar) {
        jsyVar.getClass();
        this.a = jsyVar;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwli)) {
            return false;
        }
        dwli dwliVar = (dwli) obj;
        if (!ffkj.e(this.a, dwliVar.a)) {
            return false;
        }
        int i = dwliVar.b;
        return jss.b(0, 0);
    }

    public final int hashCode() {
        return this.a.i * 31;
    }

    public final String toString() {
        return "GoogleSansConfig(weight=" + this.a + ", style=" + jss.a(0) + ")";
    }
}
