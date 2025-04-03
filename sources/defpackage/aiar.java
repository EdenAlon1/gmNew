package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiar {
    public final String a;
    public final dngx b;
    public final String c;

    public aiar(String str, dngx dngxVar, String str2) {
        str.getClass();
        this.a = str;
        this.b = dngxVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiar)) {
            return false;
        }
        aiar aiarVar = (aiar) obj;
        return ffkj.e(this.a, aiarVar.a) && ffkj.e(this.b, aiarVar.b) && ffkj.e(this.c, aiarVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ContactUiData(id=" + this.a + ", itemUiData=" + this.b + ", header=" + this.c + ")";
    }
}
