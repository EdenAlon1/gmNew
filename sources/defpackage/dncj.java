package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dncj {
    public final dmzz a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    private final boolean f;
    private final ffix g;

    public /* synthetic */ dncj(dmzz dmzzVar, String str, String str2, boolean z, boolean z2, int i) {
        dmzzVar.getClass();
        str.getClass();
        this.a = dmzzVar;
        this.b = str;
        this.c = (i & 4) != 0 ? null : str2;
        this.f = false;
        this.d = ((i & 16) == 0) & z;
        this.e = ((i & 32) == 0) & z2;
        this.g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dncj)) {
            return false;
        }
        dncj dncjVar = (dncj) obj;
        if (this.a != dncjVar.a || !ffkj.e(this.b, dncjVar.b) || !ffkj.e(this.c, dncjVar.c)) {
            return false;
        }
        boolean z = dncjVar.f;
        if (this.d != dncjVar.d || this.e != dncjVar.e) {
            return false;
        }
        ffix ffixVar = dncjVar.g;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return ((((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + dnci.a(false)) * 31) + dnci.a(this.d)) * 31) + dnci.a(this.e)) * 31;
    }

    public final String toString() {
        return "InfoBubbleUiData(icon=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", drawRoundedBorder=false, isIconHighlighted=" + this.d + ", isBackgroundTransparent=" + this.e + ", onClick=null)";
    }
}
