package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxye extends cyaz {
    private final String a;
    private final Runnable b;
    private final Runnable c;
    private final Runnable d;
    private final cyak e;
    private final CharSequence f;
    private final Integer g;
    private final CharSequence h;
    private final String i;
    private final String j;

    public cxye(String str, Runnable runnable, Runnable runnable2, Runnable runnable3, cyak cyakVar, CharSequence charSequence, Integer num, CharSequence charSequence2, String str2, String str3) {
        this.a = str;
        this.b = runnable;
        this.c = runnable2;
        this.d = runnable3;
        this.e = cyakVar;
        this.f = charSequence;
        this.g = num;
        this.h = charSequence2;
        this.i = str2;
        this.j = str3;
    }

    @Override // defpackage.cyaz
    public final cyak a() {
        return this.e;
    }

    @Override // defpackage.cyaz
    public final CharSequence b() {
        return this.h;
    }

    @Override // defpackage.cyaz
    public final CharSequence c() {
        return this.f;
    }

    @Override // defpackage.cyaz
    public final Integer d() {
        return this.g;
    }

    @Override // defpackage.cyaz
    public final Runnable e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        cyak cyakVar;
        CharSequence charSequence;
        Integer num;
        CharSequence charSequence2;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyaz) {
            cyaz cyazVar = (cyaz) obj;
            if (this.a.equals(cyazVar.i())) {
                cyazVar.m();
                cyazVar.l();
                if (this.b.equals(cyazVar.g()) && this.c.equals(cyazVar.f())) {
                    cyazVar.k();
                    if (this.d.equals(cyazVar.e()) && ((cyakVar = this.e) != null ? cyakVar.equals(cyazVar.a()) : cyazVar.a() == null) && ((charSequence = this.f) != null ? charSequence.equals(cyazVar.c()) : cyazVar.c() == null) && ((num = this.g) != null ? num.equals(cyazVar.d()) : cyazVar.d() == null) && ((charSequence2 = this.h) != null ? charSequence2.equals(cyazVar.b()) : cyazVar.b() == null) && ((str = this.i) != null ? str.equals(cyazVar.j()) : cyazVar.j() == null) && ((str2 = this.j) != null ? str2.equals(cyazVar.h()) : cyazVar.h() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cyaz
    public final Runnable f() {
        return this.c;
    }

    @Override // defpackage.cyaz
    public final Runnable g() {
        return this.b;
    }

    @Override // defpackage.cyaz
    public final String h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 583896283) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ this.d.hashCode();
        cyak cyakVar = this.e;
        int hashCode2 = ((hashCode * 1000003) ^ (cyakVar == null ? 0 : cyakVar.hashCode())) * 1000003;
        CharSequence charSequence = this.f;
        int hashCode3 = (hashCode2 ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        Integer num = this.g;
        int hashCode4 = (hashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        CharSequence charSequence2 = this.h;
        int hashCode5 = (hashCode4 ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003;
        String str = this.i;
        int hashCode6 = (hashCode5 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.j;
        return hashCode6 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.cyaz
    public final String i() {
        return this.a;
    }

    @Override // defpackage.cyaz
    public final String j() {
        return this.i;
    }

    public final String toString() {
        CharSequence charSequence = this.h;
        CharSequence charSequence2 = this.f;
        cyak cyakVar = this.e;
        Runnable runnable = this.d;
        Runnable runnable2 = this.c;
        return "StackedBannerUiControllerParams{id=" + this.a + ", onBannerShowTransitionListener=null, onBannerDismissTransitionListener=null, onStartButtonClickRunnable=" + this.b.toString() + ", onEndButtonClickRunnable=" + runnable2.toString() + ", onChipClickRunnable=null, onCardClickRunnable=" + runnable.toString() + ", iconParams=" + String.valueOf(cyakVar) + ", titleText=" + String.valueOf(charSequence2) + ", titleTextColor=" + this.g + ", bodyText=" + String.valueOf(charSequence) + ", startButtonText=" + this.i + ", endButtonText=" + this.j + "}";
    }

    @Override // defpackage.cyaz
    public final void k() {
    }

    @Override // defpackage.cyaz
    public final void l() {
    }

    @Override // defpackage.cyaz
    public final void m() {
    }
}
