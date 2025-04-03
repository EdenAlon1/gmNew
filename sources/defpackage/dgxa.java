package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgxa extends dgxh {
    private final String a;
    private final String b;
    private final int c;

    public dgxa(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // defpackage.dgxh
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dgxh
    public final String b() {
        return this.b;
    }

    @Override // defpackage.dgxh
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dgxh) {
            dgxh dgxhVar = (dgxh) obj;
            if (this.a.equals(dgxhVar.c()) && this.b.equals(dgxhVar.b()) && this.c == dgxhVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "SystemPropertiesInfo{vendorBuildFingerprint=" + this.a + ", bootVerifiedBootState=" + this.b + ", bootFlashLocked=" + this.c + "}";
    }
}
