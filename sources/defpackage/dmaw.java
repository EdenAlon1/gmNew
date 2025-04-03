package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmaw implements dmba {
    public final String a;
    public final float b;
    public final int c;
    public final String d;
    public final dmci e;
    private final String f;

    public dmaw(String str, String str2, float f, int i, String str3, dmci dmciVar) {
        this.f = str;
        this.a = str2;
        this.b = f;
        this.c = i;
        this.d = str3;
        this.e = dmciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmaw)) {
            return false;
        }
        dmaw dmawVar = (dmaw) obj;
        return ffkj.e(this.f, dmawVar.f) && ffkj.e(this.a, dmawVar.a) && Float.compare(this.b, dmawVar.b) == 0 && this.c == dmawVar.c && ffkj.e(this.d, dmawVar.d) && ffkj.e(this.e, dmawVar.e);
    }

    public final int hashCode() {
        return (((((((((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Emotify(id=" + this.f + ", uri=" + this.a + ", scale=" + this.b + ", count=" + this.c + ", contentDescription=" + this.d + ", style=" + this.e + ")";
    }
}
