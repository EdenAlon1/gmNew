package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gob {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;

    public gob(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gob gobVar = (gob) obj;
            return ffkj.e(this.a, gobVar.a) && ffkj.e(this.b, gobVar.b) && this.c == gobVar.c && this.d == gobVar.d;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d;
    }
}
