package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlto implements dltq {
    public final dlus a;
    public final int b;
    public final int c;
    private final String d;
    private final ffji e;

    public dlto(dlus dlusVar, int i, int i2, String str, ffji ffjiVar) {
        dlusVar.getClass();
        this.a = dlusVar;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = ffjiVar;
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
        return new dlto(this.a, i, i2, this.d, this.e);
    }

    @Override // defpackage.dltq
    public final String d() {
        return this.d;
    }

    @Override // defpackage.dltq
    public final ffji e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlto)) {
            return false;
        }
        dlto dltoVar = (dlto) obj;
        return this.a == dltoVar.a && this.b == dltoVar.b && this.c == dltoVar.c && ffkj.e(this.d, dltoVar.d) && ffkj.e(this.e, dltoVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.d;
        int hashCode2 = (((((hashCode + this.b) * 31) + this.c) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        ffji ffjiVar = this.e;
        return hashCode2 + (ffjiVar != null ? ffjiVar.hashCode() : 0);
    }

    public final String toString() {
        return "Standard(type=" + this.a + ", start=" + this.b + ", end=" + this.c + ", onClickLabel=" + this.d + ", onClick=" + this.e + ")";
    }

    public /* synthetic */ dlto(dlus dlusVar, int i, int i2, ffji ffjiVar, int i3) {
        this(dlusVar, i, i2, (String) null, (i3 & 16) != 0 ? null : ffjiVar);
    }
}
