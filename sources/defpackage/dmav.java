package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmav implements dmba {
    public final String a;
    public final int b;
    public final String c;
    public final dmci d;

    public dmav(String str, int i, String str2, dmci dmciVar) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = dmciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmav)) {
            return false;
        }
        dmav dmavVar = (dmav) obj;
        return ffkj.e(this.a, dmavVar.a) && this.b == dmavVar.b && ffkj.e(this.c, dmavVar.c) && ffkj.e(this.d, dmavVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Emoji(emoji=" + this.a + ", count=" + this.b + ", contentDescription=" + this.c + ", style=" + this.d + ")";
    }
}
