package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aobf extends aoga {
    private final String a;
    private final aoqz b;
    private final String c;
    private final esfh d;
    private final String e;
    private final ctvf f;
    private final int g;

    public aobf(String str, aoqz aoqzVar, String str2, esfh esfhVar, int i, String str3, ctvf ctvfVar) {
        this.a = str;
        if (aoqzVar == null) {
            throw new NullPointerException("Null destinationType");
        }
        this.b = aoqzVar;
        if (str2 == null) {
            throw new NullPointerException("Null sourceRegionCode");
        }
        this.c = str2;
        this.d = esfhVar;
        this.g = i;
        this.e = str3;
        this.f = ctvfVar;
    }

    @Override // defpackage.aoga
    public final aoqz a() {
        return this.b;
    }

    @Override // defpackage.aoga
    public final ctvf b() {
        return this.f;
    }

    @Override // defpackage.aoga
    public final esfh c() {
        return this.d;
    }

    @Override // defpackage.aoga
    public final String d() {
        return this.a;
    }

    @Override // defpackage.aoga
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        esfh esfhVar;
        int i;
        String str;
        ctvf ctvfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoga) {
            aoga aogaVar = (aoga) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(aogaVar.d()) : aogaVar.d() == null) {
                if (this.b.equals(aogaVar.a()) && this.c.equals(aogaVar.e()) && ((esfhVar = this.d) != null ? esfhVar.equals(aogaVar.c()) : aogaVar.c() == null) && ((i = this.g) != 0 ? i == aogaVar.g() : aogaVar.g() == 0) && ((str = this.e) != null ? str.equals(aogaVar.f()) : aogaVar.f() == null) && ((ctvfVar = this.f) != null ? ctvfVar.equals(aogaVar.b()) : aogaVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aoga
    public final String f() {
        return this.e;
    }

    @Override // defpackage.aoga
    public final int g() {
        return this.g;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        esfh esfhVar = this.d;
        int hashCode2 = ((hashCode * 1000003) ^ (esfhVar == null ? 0 : esfhVar.hashCode())) * 1000003;
        int i = this.g;
        if (i == 0) {
            i = 0;
        }
        int i2 = (hashCode2 ^ i) * 1000003;
        String str2 = this.e;
        int hashCode3 = (i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        ctvf ctvfVar = this.f;
        return hashCode3 ^ (ctvfVar != null ? ctvfVar.a : 0);
    }

    public final String toString() {
        ctvf ctvfVar = this.f;
        esfh esfhVar = this.d;
        return "ParsedDestination{rawDestination=" + this.a + ", destinationType=" + this.b.toString() + ", sourceRegionCode=" + this.c + ", parsedNumber=" + String.valueOf(esfhVar) + ", validation=" + esfj.a(this.g) + ", targetRegionCode=" + this.e + ", targetCallingCode=" + String.valueOf(ctvfVar) + "}";
    }
}
