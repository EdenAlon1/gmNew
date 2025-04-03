package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adkw extends adkm {
    private final adko a;
    private final int b;

    public adkw(int i, adko adkoVar) {
        adkoVar.getClass();
        this.b = i;
        this.a = adkoVar;
    }

    @Override // defpackage.adkm
    public final adko a() {
        return this.a;
    }

    @Override // defpackage.adkm
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adkw)) {
            return false;
        }
        adkw adkwVar = (adkw) obj;
        return this.b == adkwVar.b && this.a == adkwVar.a;
    }

    public final int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessfulCapabilityResult(umaCode=");
        String str = this.b != 7 ? "YES_CODE" : "NO_CODE";
        adko adkoVar = this.a;
        sb.append((Object) str);
        sb.append(", result=");
        sb.append(adkoVar);
        sb.append(")");
        return sb.toString();
    }
}
