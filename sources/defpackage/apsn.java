package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apsn extends apug {
    public final boolean a;
    public final alxz b;
    public final apyd c;
    public final alyu d;
    public final String e;
    public final engw f;
    public final appu g;
    public final enhk h;
    public final engw i;
    public final engw j;
    public final aqdr k;
    public final apxv l;
    public final int m;

    public apsn(boolean z, alxz alxzVar, apyd apydVar, alyu alyuVar, String str, int i, engw engwVar, appu appuVar, aqdr aqdrVar, enhk enhkVar, engw engwVar2, engw engwVar3, apxv apxvVar) {
        this.a = z;
        this.b = alxzVar;
        this.c = apydVar;
        this.d = alyuVar;
        this.e = str;
        this.m = i;
        this.f = engwVar;
        this.g = appuVar;
        this.k = aqdrVar;
        this.h = enhkVar;
        this.i = engwVar2;
        this.j = engwVar3;
        this.l = apxvVar;
    }

    @Override // defpackage.apug
    public final alxz a() {
        return this.b;
    }

    @Override // defpackage.apug
    public final alyu b() {
        return this.d;
    }

    @Override // defpackage.apug
    public final appu c() {
        return this.g;
    }

    @Override // defpackage.apug
    public final apyd d() {
        return this.c;
    }

    @Override // defpackage.apug
    public final engw e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        alxz alxzVar;
        apyd apydVar;
        alyu alyuVar;
        String str;
        appu appuVar;
        aqdr aqdrVar;
        apxv apxvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof apug) {
            apug apugVar = (apug) obj;
            if (this.a == apugVar.j() && ((alxzVar = this.b) != null ? alxzVar.equals(apugVar.a()) : apugVar.a() == null) && ((apydVar = this.c) != null ? apydVar.equals(apugVar.d()) : apugVar.d() == null) && ((alyuVar = this.d) != null ? alyuVar.equals(apugVar.b()) : apugVar.b() == null) && ((str = this.e) != null ? str.equals(apugVar.i()) : apugVar.i() == null)) {
                int i = this.m;
                int m = apugVar.m();
                if (i == 0) {
                    throw null;
                }
                if (i == m && enkr.h(this.f, apugVar.e()) && ((appuVar = this.g) != null ? appuVar.equals(apugVar.c()) : apugVar.c() == null) && ((aqdrVar = this.k) != null ? aqdrVar.equals(apugVar.k()) : apugVar.k() == null) && this.h.equals(apugVar.h()) && enkr.h(this.i, apugVar.g()) && enkr.h(this.j, apugVar.f()) && ((apxvVar = this.l) != null ? apxvVar.equals(apugVar.l()) : apugVar.l() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.apug
    public final engw f() {
        return this.j;
    }

    @Override // defpackage.apug
    public final engw g() {
        return this.i;
    }

    @Override // defpackage.apug
    public final enhk h() {
        return this.h;
    }

    public final int hashCode() {
        alxz alxzVar = this.b;
        int hashCode = (alxzVar == null ? 0 : alxzVar.hashCode()) ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
        apyd apydVar = this.c;
        int hashCode2 = ((hashCode * 1000003) ^ (apydVar == null ? 0 : apydVar.hashCode())) * 1000003;
        alyu alyuVar = this.d;
        int hashCode3 = (hashCode2 ^ (alyuVar == null ? 0 : alyuVar.hashCode())) * 1000003;
        String str = this.e;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i = this.m;
        apeo.a(i);
        int hashCode5 = (((hashCode4 ^ i) * 1000003) ^ this.f.hashCode()) * 1000003;
        appu appuVar = this.g;
        int hashCode6 = (hashCode5 ^ (appuVar == null ? 0 : appuVar.hashCode())) * 1000003;
        aqdr aqdrVar = this.k;
        int hashCode7 = (((((((hashCode6 ^ (aqdrVar == null ? 0 : aqdrVar.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        apxv apxvVar = this.l;
        return hashCode7 ^ (apxvVar != null ? apxvVar.hashCode() : 0);
    }

    @Override // defpackage.apug
    public final String i() {
        return this.e;
    }

    @Override // defpackage.apug
    public final boolean j() {
        return this.a;
    }

    @Override // defpackage.apug
    public final aqdr k() {
        return this.k;
    }

    @Override // defpackage.apug
    public final apxv l() {
        return this.l;
    }

    @Override // defpackage.apug
    public final int m() {
        return this.m;
    }

    public final String toString() {
        int i = this.m;
        alyu alyuVar = this.d;
        apyd apydVar = this.c;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(apydVar);
        String valueOf3 = String.valueOf(alyuVar);
        String str = i != 1 ? i != 2 ? "null" : "OTP" : "NORMAL";
        engw engwVar = this.f;
        appu appuVar = this.g;
        aqdr aqdrVar = this.k;
        enhk enhkVar = this.h;
        engw engwVar2 = this.i;
        engw engwVar3 = this.j;
        apxv apxvVar = this.l;
        return "MessageExtensionState{starred=" + this.a + ", preview=" + valueOf + ", reactions=" + valueOf2 + ", repliedTo=" + valueOf3 + ", caption=" + this.e + ", contentCategory=" + str + ", annotations=" + String.valueOf(engwVar) + ", suggestionShortcut=" + String.valueOf(appuVar) + ", calendarEvent=" + String.valueOf(aqdrVar) + ", voiceTranscriptions=" + String.valueOf(enhkVar) + ", readByRecipients=" + String.valueOf(engwVar2) + ", failedToDecryptRecipients=" + String.valueOf(engwVar3) + ", editStatus=" + String.valueOf(apxvVar) + "}";
    }
}
