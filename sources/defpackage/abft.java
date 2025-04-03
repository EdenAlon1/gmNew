package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abft {
    public final String a;
    public final String b;
    public final ffix c;
    public final dmzz d;

    public abft(String str, String str2, ffix ffixVar, dmzz dmzzVar) {
        this.a = str;
        this.b = str2;
        this.c = ffixVar;
        this.d = dmzzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abft)) {
            return false;
        }
        abft abftVar = (abft) obj;
        return ffkj.e(this.a, abftVar.a) && ffkj.e(this.b, abftVar.b) && ffkj.e(this.c, abftVar.c) && this.d == abftVar.d;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        dmzz dmzzVar = this.d;
        return (hashCode * 31) + (dmzzVar == null ? 0 : dmzzVar.hashCode());
    }

    public final String toString() {
        return "RadioButtonsListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", onClick=" + this.c + ", icon=" + this.d + ")";
    }
}
