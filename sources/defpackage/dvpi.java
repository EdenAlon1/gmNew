package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvpi extends dvpk {
    private final String d;
    private final String e;

    public dvpi(String str, String str2) {
        this.d = str;
        if (str2 == null) {
            throw new NullPointerException("Null key");
        }
        this.e = str2;
    }

    @Override // defpackage.dvpk
    public final String a() {
        return this.d;
    }

    @Override // defpackage.dvpk
    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvpk) {
            dvpk dvpkVar = (dvpk) obj;
            String str = this.d;
            if (str != null ? str.equals(dvpkVar.a()) : dvpkVar.a() == null) {
                if (this.e.equals(dvpkVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "TimeWindowStoreRecord{accountName=" + this.d + ", key=" + this.e + "}";
    }
}
