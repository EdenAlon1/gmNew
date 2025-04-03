package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evhw extends evii {
    private final ense a;
    private final String b;

    public evhw(ense enseVar, String str) {
        this.a = enseVar;
        this.b = str;
    }

    @Override // defpackage.evii
    public final ense a() {
        return this.a;
    }

    @Override // defpackage.evii
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof evii) {
            evii eviiVar = (evii) obj;
            if (this.a.equals(eviiVar.a()) && ((str = this.b) != null ? str.equals(eviiVar.b()) : eviiVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (hashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MessageAndLogSite{logSite=" + this.a.toString() + ", message=" + this.b + "}";
    }
}
