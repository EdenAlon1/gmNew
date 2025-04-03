package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwc implements dlwf {
    public final String a;
    public final String b;
    private final boolean c;
    private final String d;

    public /* synthetic */ dlwc(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = (i & 2) != 0 ? null : str2;
        this.c = false;
        this.d = str3;
    }

    @Override // defpackage.dlwk
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlwc)) {
            return false;
        }
        dlwc dlwcVar = (dlwc) obj;
        if (!ffkj.e(this.a, dlwcVar.a) || !ffkj.e(this.b, dlwcVar.b)) {
            return false;
        }
        boolean z = dlwcVar.c;
        return ffkj.e(this.d, dlwcVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + 1237) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Error(title=" + this.a + ", subtitle=" + this.b + ", isIconHighlighted=false, contentDescription=" + this.d + ")";
    }
}
