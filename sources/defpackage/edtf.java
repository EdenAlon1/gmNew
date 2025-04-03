package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edtf extends edtg {
    public final String a;
    public final int b;

    public edtf(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.edtg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.edtg
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edtg) {
            edtg edtgVar = (edtg) obj;
            if (this.a.equals(edtgVar.b()) && this.b == edtgVar.a()) {
                edtgVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ 1;
    }

    public final String toString() {
        return "ClientProfile{packageName=" + this.a + ", versionCode=" + this.b + ", requestSource=PROGRAMMATIC_API}";
    }

    @Override // defpackage.edtg
    public final void c() {
    }
}
