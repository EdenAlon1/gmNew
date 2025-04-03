package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvr implements dlvw {
    public final String a;
    private final String b;

    public dlvr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.dlwk
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlvr)) {
            return false;
        }
        dlvr dlvrVar = (dlvr) obj;
        return ffkj.e(this.a, dlvrVar.a) && ffkj.e(this.b, dlvrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Downloadable(fileSizeString=" + this.a + ", contentDescription=" + this.b + ")";
    }
}
