package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkq implements dmfn {
    public final String a;
    public final String b;
    private final boolean c = true;
    private final ffix d;

    public abkq(String str, String str2, ffix ffixVar) {
        this.a = str;
        this.b = str2;
        this.d = ffixVar;
    }

    @Override // defpackage.dmfn
    public final dmfn a(ffix ffixVar) {
        ffixVar.getClass();
        return new abkq(this.a, this.b, ffixVar);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.d;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abkq)) {
            return false;
        }
        abkq abkqVar = (abkq) obj;
        if (!ffkj.e(this.a, abkqVar.a) || !ffkj.e(this.b, abkqVar.b)) {
            return false;
        }
        boolean z = abkqVar.c;
        return ffkj.e(this.d, abkqVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1231) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "CustomBottomSheetUiData(title=" + this.a + ", body=" + this.b + ", includeScrim=true, onDismiss=" + this.d + ")";
    }
}
