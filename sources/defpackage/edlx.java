package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edlx extends edqf {
    public final String a;
    public final String b;

    public edlx(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.edqf
    public final String a() {
        return this.a;
    }

    @Override // defpackage.edqf
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edqf) {
            edqf edqfVar = (edqf) obj;
            String str = this.a;
            if (str != null ? str.equals(edqfVar.a()) : edqfVar.a() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(edqfVar.b()) : edqfVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PlusCode{compoundCode=" + this.a + ", globalCode=" + this.b + "}";
    }
}
