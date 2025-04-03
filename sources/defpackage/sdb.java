package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdb extends sdg {
    private final String a;
    private final String b;

    public sdb(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.sdg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.sdg
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sdg) {
            sdg sdgVar = (sdg) obj;
            if (this.a.equals(sdgVar.a()) && this.b.equals(sdgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SmartReplyMessage{text=" + this.a + ", userId=" + this.b + "}";
    }
}
