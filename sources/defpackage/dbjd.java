package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbjd {
    public final int a;
    public final String b;
    public final String c;
    public final ffix d;

    public dbjd(int i, String str, String str2, ffix ffixVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbjd)) {
            return false;
        }
        dbjd dbjdVar = (dbjd) obj;
        return this.a == dbjdVar.a && ffkj.e(this.b, dbjdVar.b) && ffkj.e(this.c, dbjdVar.c) && ffkj.e(this.d, dbjdVar.d);
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DBTool(key=" + this.a + ", descriptionText=" + this.b + ", buttonText=" + this.c + ", handler=" + this.d + ")";
    }
}
