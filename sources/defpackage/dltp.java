package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dltp implements dltq {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    private final String e;
    private final ffji f;

    public dltp(String str, int i, int i2, boolean z, ffji ffjiVar) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.e = null;
        this.d = z;
        this.f = ffjiVar;
    }

    @Override // defpackage.dltq
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dltq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dltq
    public final /* bridge */ /* synthetic */ dltq c(int i, int i2) {
        return new dltp(this.a, i, i2, this.d, this.f);
    }

    @Override // defpackage.dltq
    public final String d() {
        return null;
    }

    @Override // defpackage.dltq
    public final ffji e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dltp)) {
            return false;
        }
        dltp dltpVar = (dltp) obj;
        if (!ffkj.e(this.a, dltpVar.a) || this.b != dltpVar.b || this.c != dltpVar.c) {
            return false;
        }
        String str = dltpVar.e;
        return ffkj.e(null, null) && this.d == dltpVar.d && ffkj.e(this.f, dltpVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ffji ffjiVar = this.f;
        return ((((((hashCode + this.b) * 31) + this.c) * 961) + (true != this.d ? 1237 : 1231)) * 31) + (ffjiVar == null ? 0 : ffjiVar.hashCode());
    }

    public final String toString() {
        return "Url(url=" + this.a + ", start=" + this.b + ", end=" + this.c + ", onClickLabel=null, usePrimaryColor=" + this.d + ", onClick=" + this.f + ")";
    }

    public /* synthetic */ dltp(String str, int i, int i2, ffji ffjiVar, int i3) {
        this(str, i, i2, (i3 & 16) != 0, (i3 & 32) != 0 ? null : ffjiVar);
    }
}
