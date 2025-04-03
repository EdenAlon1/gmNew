package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfzd extends cfzl {
    private final String a;
    private final String b;

    public cfzd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.cfzl
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cfzl
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cfzl) {
            cfzl cfzlVar = (cfzl) obj;
            if (this.a.equals(cfzlVar.a()) && this.b.equals(cfzlVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PsdData{psdKey=" + this.a + ", psdValue=" + this.b + "}";
    }
}
