package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlss {
    public final String a;
    public final dmzz b;
    public final ffix c;
    private final boolean d = false;

    public dlss(String str, dmzz dmzzVar, ffix ffixVar) {
        this.a = str;
        this.b = dmzzVar;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlss)) {
            return false;
        }
        dlss dlssVar = (dlss) obj;
        if (!ffkj.e(this.a, dlssVar.a) || this.b != dlssVar.b) {
            return false;
        }
        boolean z = dlssVar.d;
        return ffkj.e(this.c, dlssVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1237) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "IconActionUiData(title=" + this.a + ", icon=" + this.b + ", shouldTint=false, execute=" + this.c + ")";
    }
}
