package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apni extends apol {
    private final String a = "text/plain";
    private final int b;

    public apni(int i) {
        this.b = i;
    }

    @Override // defpackage.apqa
    public final int a() {
        return this.b;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apol) {
            apol apolVar = (apol) obj;
            if (this.a.equals(apolVar.b()) && this.b == apolVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.b;
        String str = i != 2 ? i != 3 ? i != 4 ? "SPATULA" : "SCAM" : "SATELLITE" : "SUGGESTED_STAR";
        return "BugleToolstoneContent{contentType=" + this.a + ", toolstoneType=" + str + "}";
    }
}
