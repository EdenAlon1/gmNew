package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmht {
    public final String a;
    public final ffix b;
    public final dmhs c;

    public dmht(String str, ffix ffixVar, dmhs dmhsVar) {
        this.a = str;
        this.b = ffixVar;
        this.c = dmhsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmht)) {
            return false;
        }
        dmht dmhtVar = (dmht) obj;
        return ffkj.e(this.a, dmhtVar.a) && ffkj.e(this.b, dmhtVar.b) && ffkj.e(this.c, dmhtVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SwipeButtonUiData(text=" + this.a + ", onSwiped=" + this.b + ", flags=" + this.c + ")";
    }
}
