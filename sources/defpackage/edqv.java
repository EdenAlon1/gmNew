package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edqv extends edrv {
    public final Integer a;
    public final Integer b;
    public final edps c;
    public final dhqd d;

    public edqv(Integer num, Integer num2, edps edpsVar, dhqd dhqdVar) {
        this.a = num;
        this.b = num2;
        this.c = edpsVar;
        this.d = dhqdVar;
    }

    @Override // defpackage.edrv, defpackage.edkr
    public final dhqd a() {
        return this.d;
    }

    @Override // defpackage.edrv
    public final edps b() {
        return this.c;
    }

    @Override // defpackage.edrv
    public final Integer c() {
        return this.b;
    }

    @Override // defpackage.edrv
    public final Integer d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        dhqd dhqdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof edrv) {
            edrv edrvVar = (edrv) obj;
            Integer num = this.a;
            if (num != null ? num.equals(edrvVar.d()) : edrvVar.d() == null) {
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(edrvVar.c()) : edrvVar.c() == null) {
                    if (this.c.equals(edrvVar.b()) && ((dhqdVar = this.d) != null ? dhqdVar.equals(edrvVar.a()) : edrvVar.a() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        int hashCode2 = ((((hashCode ^ 1000003) * 1000003) ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.c.hashCode();
        dhqd dhqdVar = this.d;
        return (hashCode2 * 1000003) ^ (dhqdVar != null ? dhqdVar.hashCode() : 0);
    }

    public final String toString() {
        dhqd dhqdVar = this.d;
        return "FetchResolvedPhotoUriRequest{maxWidth=" + this.a + ", maxHeight=" + this.b + ", photoMetadata=" + this.c.toString() + ", cancellationToken=" + String.valueOf(dhqdVar) + "}";
    }
}
