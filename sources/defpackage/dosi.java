package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dosi implements dosl {
    public final String a;
    public final String b;
    public final boolean c;
    public final ffji d;
    public final ffix e;

    public dosi(String str, String str2, boolean z, ffji ffjiVar, ffix ffixVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = ffjiVar;
        this.e = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dosi)) {
            return false;
        }
        dosi dosiVar = (dosi) obj;
        return ffkj.e(this.a, dosiVar.a) && ffkj.e(this.b, dosiVar.b) && this.c == dosiVar.c && ffkj.e(this.d, dosiVar.d) && ffkj.e(this.e, dosiVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "SearchBox(initialQuery=" + this.a + ", hintText=" + this.b + ", useBodyMedium=" + this.c + ", onTextChange=" + this.d + ", onSearch=" + this.e + ")";
    }
}
