package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zch {
    public final int a;
    public final dwjy b;
    public final int c;

    public zch(int i, dwjy dwjyVar, int i2) {
        dwjyVar.getClass();
        this.a = i;
        this.b = dwjyVar;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zch)) {
            return false;
        }
        zch zchVar = (zch) obj;
        return this.a == zchVar.a && ffkj.e(this.b, zchVar.b) && this.c == zchVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "ExampleTheme(id=" + this.a + ", tonalPalette=" + this.b + ", nameResId=" + this.c + ")";
    }
}
