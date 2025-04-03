package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwo implements dnwq {
    public final int a;
    private final Boolean b;
    private final dnwk c;

    public dnwo(int i, dnwk dnwkVar) {
        dnwkVar.getClass();
        this.a = i;
        this.b = null;
        this.c = dnwkVar;
    }

    @Override // defpackage.dnwq
    public final dnwk a() {
        return this.c;
    }

    @Override // defpackage.dnwq
    public final Boolean b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnwo)) {
            return false;
        }
        dnwo dnwoVar = (dnwo) obj;
        if (this.a != dnwoVar.a) {
            return false;
        }
        Boolean bool = dnwoVar.b;
        return ffkj.e(null, null) && this.c == dnwoVar.c;
    }

    public final int hashCode() {
        return (this.a * 961) + this.c.hashCode();
    }

    public final String toString() {
        return "Overflow(count=" + this.a + ", forceClipToCircle=null, monogramBadge=" + this.c + ")";
    }
}
