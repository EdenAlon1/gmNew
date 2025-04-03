package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnso implements dnsp {
    public final dmzz a;
    public final String b;
    private final String c;

    public /* synthetic */ dnso(dmzz dmzzVar, String str, int i) {
        dmzzVar.getClass();
        this.a = dmzzVar;
        this.c = null;
        this.b = (i & 4) != 0 ? null : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnso)) {
            return false;
        }
        dnso dnsoVar = (dnso) obj;
        if (this.a != dnsoVar.a) {
            return false;
        }
        String str = dnsoVar.c;
        return ffkj.e(null, null) && ffkj.e(this.b, dnsoVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MetatextIconItemUiData(icon=" + this.a + ", iconContentDescription=null, colorIdentifier=" + this.b + ")";
    }
}
