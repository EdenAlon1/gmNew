package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwg implements dlwj {
    public final String a;
    public final String b;
    private final boolean c;
    private final String d;

    public /* synthetic */ dlwg(String str, String str2, String str3, int i) {
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
        if (!(obj instanceof dlwg)) {
            return false;
        }
        dlwg dlwgVar = (dlwg) obj;
        if (!ffkj.e(this.a, dlwgVar.a) || !ffkj.e(this.b, dlwgVar.b)) {
            return false;
        }
        boolean z = dlwgVar.c;
        return ffkj.e(this.d, dlwgVar.d);
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
