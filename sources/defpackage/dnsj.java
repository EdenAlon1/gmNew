package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsj {
    public final dmzz a;
    public final String b;
    public final ffix c;
    private final int d;

    public dnsj(int i, dmzz dmzzVar, String str, ffix ffixVar) {
        dmzzVar.getClass();
        this.d = i;
        this.a = dmzzVar;
        this.b = str;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnsj)) {
            return false;
        }
        dnsj dnsjVar = (dnsj) obj;
        return this.d == dnsjVar.d && this.a == dnsjVar.a && ffkj.e(this.b, dnsjVar.b) && ffkj.e(this.c, dnsjVar.c);
    }

    public final int hashCode() {
        return (((((this.d * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestionShortcutUiData(type=");
        int i = this.d;
        sb.append((Object) (i != 2 ? i != 3 ? "STAR" : "VIDEO_CALL" : "CALENDAR"));
        sb.append(", iconUiData=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", onClick=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
