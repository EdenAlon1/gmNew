package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobh {
    public final dnym a;
    public final String b;
    public final ffix c;
    private final String d;
    private final boolean e;

    public dobh(dnym dnymVar, String str, ffix ffixVar) {
        str.getClass();
        this.a = dnymVar;
        this.d = null;
        this.b = str;
        this.e = true;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dobh)) {
            return false;
        }
        dobh dobhVar = (dobh) obj;
        if (!ffkj.e(this.a, dobhVar.a)) {
            return false;
        }
        String str = dobhVar.d;
        if (!ffkj.e(null, null) || !ffkj.e(this.b, dobhVar.b)) {
            return false;
        }
        boolean z = dobhVar.e;
        return ffkj.e(this.c, dobhVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 961) + this.b.hashCode()) * 31) + 1231) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HeaderUiData(monogram=" + this.a + ", title=null, description=" + this.b + ", useLegacyStyle=true, onClick=" + this.c + ")";
    }
}
