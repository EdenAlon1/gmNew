package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyxt {
    public final String a;
    public final ffji b;
    private final String c;

    public cyxt(String str, String str2, ffji ffjiVar) {
        this.c = str;
        this.a = str2;
        this.b = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyxt)) {
            return false;
        }
        cyxt cyxtVar = (cyxt) obj;
        return ffkj.e(this.c, cyxtVar.c) && ffkj.e(this.a, cyxtVar.a) && ffkj.e(this.b, cyxtVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ButtonUiData(contentDescription=" + this.c + ", title=" + this.a + ", onClick=" + this.b + ")";
    }
}
