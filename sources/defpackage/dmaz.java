package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmaz implements dmba {
    public final String a;
    public final String b;
    public final dmci c;
    private final int d = 0;

    public dmaz(String str, String str2, dmci dmciVar) {
        this.a = str;
        this.b = str2;
        this.c = dmciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmaz)) {
            return false;
        }
        dmaz dmazVar = (dmaz) obj;
        if (!ffkj.e(this.a, dmazVar.a)) {
            return false;
        }
        int i = dmazVar.d;
        return ffkj.e(this.b, dmazVar.b) && ffkj.e(this.c, dmazVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 961) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Text(text=" + this.a + ", count=0, contentDescription=" + this.b + ", style=" + this.c + ")";
    }
}
