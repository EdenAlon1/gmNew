package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmog {
    public final String a;
    public final String b;
    public final doie c;

    public dmog(String str, doie doieVar, String str2) {
        this.a = str;
        this.c = doieVar;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmog)) {
            return false;
        }
        dmog dmogVar = (dmog) obj;
        return ffkj.e(this.a, dmogVar.a) && ffkj.e(this.c, dmogVar.c) && ffkj.e(this.b, dmogVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        doie doieVar = this.c;
        return ((hashCode + (doieVar == null ? 0 : doieVar.hashCode())) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ComposeRowSimData(carrierName=" + this.a + ", simIcon=" + this.c + ", phoneNumber=" + this.b + ")";
    }

    public dmog() {
        this("", null, "");
    }
}
