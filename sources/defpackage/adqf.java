package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adqf {
    public final fgdj a;
    public final String b;
    public final ffix c;
    public final ffix d;
    private final boolean e;
    private final fgcq f;

    public adqf(boolean z, fgdj fgdjVar, String str, ffix ffixVar, ffix ffixVar2, fgcq fgcqVar) {
        fgdjVar.getClass();
        this.e = z;
        this.a = fgdjVar;
        this.b = str;
        this.c = ffixVar;
        this.d = ffixVar2;
        this.f = fgcqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adqf)) {
            return false;
        }
        adqf adqfVar = (adqf) obj;
        return this.e == adqfVar.e && ffkj.e(this.a, adqfVar.a) && ffkj.e(this.b, adqfVar.b) && ffkj.e(this.c, adqfVar.c) && ffkj.e(this.d, adqfVar.d) && ffkj.e(this.f, adqfVar.f);
    }

    public final int hashCode() {
        int hashCode = ((true != this.e ? 1237 : 1231) * 31) + this.a.hashCode();
        String str = this.b;
        return (((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "SignOutAccountScreenUiData(isSwitchingAccounts=" + this.e + ", isPositiveButtonEnabled=" + this.a + ", phoneNumber=" + this.b + ", onPositiveClick=" + this.c + ", onNegativeClick=" + this.d + ", snackbarUiDataFlow=" + this.f + ")";
    }
}
