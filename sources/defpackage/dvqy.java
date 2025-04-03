package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqy {
    public final String a;
    private final String b;
    private final String c;
    private final dvqz d;
    private final dvqz e;
    private final boolean f;
    private final dvqx g;
    private final int h = 1;
    private final int i = 3;
    private final int j;

    public dvqy(String str, String str2, String str3, dvqz dvqzVar, dvqz dvqzVar2, boolean z, int i, dvqx dvqxVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dvqzVar;
        this.e = dvqzVar2;
        this.f = z;
        this.j = i;
        this.g = dvqxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvqy)) {
            return false;
        }
        dvqy dvqyVar = (dvqy) obj;
        int i = dvqyVar.h;
        if (!ffkj.e(this.a, dvqyVar.a) || !ffkj.e(this.b, dvqyVar.b) || !ffkj.e(this.c, dvqyVar.c) || !ffkj.e(this.d, dvqyVar.d) || !ffkj.e(this.e, dvqyVar.e)) {
            return false;
        }
        int i2 = dvqyVar.i;
        return this.f == dvqyVar.f && this.j == dvqyVar.j && ffkj.e(this.g, dvqyVar.g);
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() + 31) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        dvqx dvqxVar = this.g;
        return (((((((hashCode * 31) + 3) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.j) * 31) + (dvqxVar == null ? 0 : dvqxVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionData(type=TOOLTIP, key=");
        sb.append(this.a);
        sb.append(", body=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", lightColors=");
        sb.append(this.d);
        sb.append(", darkColors=");
        sb.append(this.e);
        sb.append(", theme=AUTO, useCustomColors=");
        sb.append(this.f);
        sb.append(", placement=");
        int i = this.j;
        sb.append((Object) (i != 1 ? i != 2 ? "BELOW" : "ABOVE" : "UNKNOWN"));
        sb.append(", action=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
