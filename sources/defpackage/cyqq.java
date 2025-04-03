package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyqq {
    public final String a;
    public final int b;

    public cyqq(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyqq)) {
            return false;
        }
        cyqq cyqqVar = (cyqq) obj;
        return this.b == cyqqVar.b && ffkj.e(this.a, cyqqVar.a);
    }

    public final int hashCode() {
        String str = this.a;
        return (this.b * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("E2eeStatusUiData(e2eeStatus=");
        sb.append((Object) (this.b != 1 ? "OFF" : "ON"));
        sb.append(", e2eeMessage=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
