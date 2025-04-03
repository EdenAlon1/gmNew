package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwm implements dnwq {
    public final ffjm a;
    public final char b;
    private final Boolean c;
    private final dnwk d;

    public /* synthetic */ dnwm(ffjm ffjmVar, char c, dnwk dnwkVar) {
        dnwkVar.getClass();
        this.a = ffjmVar;
        this.b = c;
        this.c = null;
        this.d = dnwkVar;
    }

    @Override // defpackage.dnwq
    public final dnwk a() {
        return this.d;
    }

    @Override // defpackage.dnwq
    public final Boolean b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnwm)) {
            return false;
        }
        dnwm dnwmVar = (dnwm) obj;
        if (!ffkj.e(this.a, dnwmVar.a) || this.b != dnwmVar.b) {
            return false;
        }
        Boolean bool = dnwmVar.c;
        return ffkj.e(null, null) && this.d == dnwmVar.d;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 961) + this.d.hashCode();
    }

    public final String toString() {
        return "Character(backgroundColor=" + this.a + ", character=" + this.b + ", forceClipToCircle=null, monogramBadge=" + this.d + ")";
    }
}
