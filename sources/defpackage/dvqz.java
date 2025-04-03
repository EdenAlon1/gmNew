package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqz {
    private final faul a;
    private final faul b;
    private final faul c;

    public dvqz(faul faulVar, faul faulVar2, faul faulVar3) {
        this.a = faulVar;
        this.b = faulVar2;
        this.c = faulVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvqz)) {
            return false;
        }
        dvqz dvqzVar = (dvqz) obj;
        return ffkj.e(this.a, dvqzVar.a) && ffkj.e(this.b, dvqzVar.b) && ffkj.e(this.c, dvqzVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PromotionDataColors(backgroundColor=" + this.a + ", titleColor=" + this.b + ", bodyColor=" + this.c + ")";
    }
}
