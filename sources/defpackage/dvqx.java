package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqx {
    private final String a;
    private final faul b;
    private final faul c;
    private final ffix d;

    public dvqx(String str, faul faulVar, faul faulVar2, ffix ffixVar) {
        this.a = str;
        this.b = faulVar;
        this.c = faulVar2;
        this.d = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvqx)) {
            return false;
        }
        dvqx dvqxVar = (dvqx) obj;
        return ffkj.e(this.a, dvqxVar.a) && ffkj.e(this.b, dvqxVar.b) && ffkj.e(this.c, dvqxVar.c) && ffkj.e(this.d, dvqxVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "PromotionAction(text=" + this.a + ", lightThemeTextColor=" + this.b + ", darkThemeTextColor=" + this.c + ", onClick=" + this.d + ")";
    }
}
