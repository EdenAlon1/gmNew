package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctur extends ctva {
    private final String a;
    private final boolean b;
    private final boolean c;

    public ctur(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.ctva
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ctva
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.ctva
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctva) {
            ctva ctvaVar = (ctva) obj;
            if (this.a.equals(ctvaVar.a()) && this.b == ctvaVar.c() && this.c == ctvaVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "PhoneNumberFormatResult{formatToNormalizedResult=" + this.a + ", isRbmOrE164=" + this.b + ", isPossibleE164Number=" + this.c + "}";
    }
}
