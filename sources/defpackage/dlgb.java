package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlgb {
    public final String a;
    public final String b;

    public dlgb(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        if (ffkj.e(this.b, "")) {
            return this.a;
        }
        return this.a + ":" + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlgb)) {
            return false;
        }
        dlgb dlgbVar = (dlgb) obj;
        return ffkj.e(this.a, dlgbVar.a) && ffkj.e(this.b, dlgbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return a();
    }
}
