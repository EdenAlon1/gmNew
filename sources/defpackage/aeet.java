package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeet extends aefb {
    private final String a;
    private final int b;
    private final CharSequence c;
    private final CharSequence d;
    private final boolean e;
    private final CharSequence f;
    private final CharSequence g;
    private final aefa h;
    private final aefa i;
    private final aeez j;

    public aeet(String str, int i, CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, CharSequence charSequence4, aefa aefaVar, aefa aefaVar2, aeez aeezVar) {
        this.a = str;
        this.b = i;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
        this.f = charSequence3;
        this.g = charSequence4;
        this.h = aefaVar;
        this.i = aefaVar2;
        this.j = aeezVar;
    }

    @Override // defpackage.aefb
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aefb
    public final aeez b() {
        return this.j;
    }

    @Override // defpackage.aefb
    public final aefa c() {
        return this.h;
    }

    @Override // defpackage.aefb
    public final aefa d() {
        return this.i;
    }

    @Override // defpackage.aefb
    public final CharSequence e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        aefa aefaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aefb) {
            aefb aefbVar = (aefb) obj;
            if (this.a.equals(aefbVar.i()) && this.b == aefbVar.a()) {
                aefbVar.k();
                CharSequence charSequence2 = this.c;
                if (charSequence2 != null ? charSequence2.equals(aefbVar.h()) : aefbVar.h() == null) {
                    CharSequence charSequence3 = this.d;
                    if (charSequence3 != null ? charSequence3.equals(aefbVar.e()) : aefbVar.e() == null) {
                        if (this.e == aefbVar.j() && this.f.equals(aefbVar.f()) && ((charSequence = this.g) != null ? charSequence.equals(aefbVar.g()) : aefbVar.g() == null) && this.h.equals(aefbVar.c()) && ((aefaVar = this.i) != null ? aefaVar.equals(aefbVar.d()) : aefbVar.d() == null) && this.j.equals(aefbVar.b())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aefb
    public final CharSequence f() {
        return this.f;
    }

    @Override // defpackage.aefb
    public final CharSequence g() {
        return this.g;
    }

    @Override // defpackage.aefb
    public final CharSequence h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        CharSequence charSequence = this.c;
        int hashCode2 = ((((hashCode * 1000003) ^ this.b) * (-721379959)) ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        CharSequence charSequence2 = this.d;
        int hashCode3 = (((((hashCode2 ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003;
        CharSequence charSequence3 = this.g;
        int hashCode4 = (((hashCode3 ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        aefa aefaVar = this.i;
        return ((hashCode4 ^ (aefaVar != null ? aefaVar.hashCode() : 0)) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.aefb
    public final String i() {
        return this.a;
    }

    @Override // defpackage.aefb
    public final boolean j() {
        return this.e;
    }

    public final String toString() {
        aeez aeezVar = this.j;
        aefa aefaVar = this.i;
        aefa aefaVar2 = this.h;
        CharSequence charSequence = this.g;
        CharSequence charSequence2 = this.f;
        CharSequence charSequence3 = this.d;
        return "HomeBannerBindData{bannerName=" + this.a + ", iconRes=" + this.b + ", iconUrl=null, title=" + String.valueOf(this.c) + ", body=" + String.valueOf(charSequence3) + ", canIgnore=" + this.e + ", negativeButtonText=" + charSequence2.toString() + ", positiveButtonText=" + String.valueOf(charSequence) + ", negativeButtonOnClickListener=" + aefaVar2.toString() + ", positiveButtonOnClickListener=" + String.valueOf(aefaVar) + ", logger=" + aeezVar.toString() + "}";
    }

    @Override // defpackage.aefb
    public final void k() {
    }
}
