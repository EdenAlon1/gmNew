package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chgs extends chig {
    public final String a;
    public final String b;

    public chgs(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.chig
    public final String a() {
        return this.b;
    }

    @Override // defpackage.chig
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chig) {
            chig chigVar = (chig) obj;
            String str = this.a;
            if (str != null ? str.equals(chigVar.b()) : chigVar.b() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(chigVar.a()) : chigVar.a() == null) {
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
        return "RpcRuntimeMetric{timeCounterName=" + this.a + ", statusCounterName=" + this.b + "}";
    }
}
