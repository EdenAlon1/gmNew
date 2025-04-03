package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxk {
    public final String a;
    public final int b;
    public final int c;

    public pxk(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxk)) {
            return false;
        }
        pxk pxkVar = (pxk) obj;
        return ffkj.e(this.a, pxkVar.a) && this.b == pxkVar.b && this.c == pxkVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
