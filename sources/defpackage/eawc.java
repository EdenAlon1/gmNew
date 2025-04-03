package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eawc extends eaxn {
    public final String a;
    public final eaxg b;
    public final int c;
    public final ebin d;

    public eawc(eaxg eaxgVar, ebin ebinVar, String str, int i) {
        this.b = eaxgVar;
        this.d = ebinVar;
        this.a = str;
        this.c = i;
    }

    @Override // defpackage.eaxn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.eaxn
    public final eaxg b() {
        return this.b;
    }

    @Override // defpackage.eaxn
    public final int c() {
        return this.c;
    }

    @Override // defpackage.eaxn
    public final ebin d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eaxn) {
            eaxn eaxnVar = (eaxn) obj;
            eaxg eaxgVar = this.b;
            if (eaxgVar != null ? eaxgVar.equals(eaxnVar.b()) : eaxnVar.b() == null) {
                ebin ebinVar = this.d;
                if (ebinVar != null ? ebinVar.equals(eaxnVar.d()) : eaxnVar.d() == null) {
                    String str = this.a;
                    if (str != null ? str.equals(eaxnVar.a()) : eaxnVar.a() == null) {
                        int i = this.c;
                        if (i != 0 ? i == eaxnVar.c() : eaxnVar.c() == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        eaxg eaxgVar = this.b;
        int hashCode = eaxgVar == null ? 0 : eaxgVar.hashCode();
        ebin ebinVar = this.d;
        int hashCode2 = ebinVar == null ? 0 : ebinVar.hashCode();
        int i = hashCode ^ 1000003;
        String str = this.a;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i2 = this.c;
        return hashCode3 ^ (i2 != 0 ? i2 : 0);
    }

    public final String toString() {
        ebin ebinVar = this.d;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(ebinVar);
        int i = this.c;
        return "RingContent{scalableRingDrawableProvider=" + valueOf + ", ringDrawableProvider=" + valueOf2 + ", contentDescription=" + this.a + ", discAnimationType=" + (i != 0 ? Integer.toString(i - 1) : "null") + "}";
    }
}
