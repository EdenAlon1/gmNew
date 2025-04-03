package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dltn implements dltq {
    public final String a;
    public final String b;
    public final ffji c;
    private final int d;
    private final String e;
    private final int f;
    private final int g;

    public dltn(String str, String str2, int i, ffji ffjiVar) {
        this.a = str;
        this.b = str2;
        this.d = i;
        this.e = null;
        this.c = ffjiVar;
        this.f = i;
        this.g = i;
    }

    @Override // defpackage.dltq
    public final int a() {
        return this.g;
    }

    @Override // defpackage.dltq
    public final int b() {
        return this.f;
    }

    @Override // defpackage.dltq
    public final /* bridge */ /* synthetic */ dltq c(int i, int i2) {
        return new dltn(this.a, this.b, i, this.c);
    }

    @Override // defpackage.dltq
    public final String d() {
        return null;
    }

    @Override // defpackage.dltq
    public final ffji e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dltn)) {
            return false;
        }
        dltn dltnVar = (dltn) obj;
        if (!ffkj.e(this.a, dltnVar.a) || !ffkj.e(this.b, dltnVar.b) || this.d != dltnVar.d) {
            return false;
        }
        String str = dltnVar.e;
        return ffkj.e(null, null) && ffkj.e(this.c, dltnVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.d;
        ffji ffjiVar = this.c;
        return ((hashCode2 + i) * 961) + (ffjiVar != null ? ffjiVar.hashCode() : 0);
    }

    public final String toString() {
        return "Image(url=" + this.a + ", contentDescription=" + this.b + ", position=" + this.d + ", onClickLabel=null, onClick=" + this.c + ")";
    }

    public /* synthetic */ dltn(String str, String str2, int i, ffji ffjiVar, int i2) {
        this(str, str2, i, (i2 & 16) != 0 ? null : ffjiVar);
    }
}
