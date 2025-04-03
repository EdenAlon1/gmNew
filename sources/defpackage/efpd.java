package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpd extends efso {
    public final faje a;
    public final efnh b;
    public final boolean c;
    public final Integer d;
    public final String e;
    public final fakk f;
    public final int g;
    public final Integer h;
    public final efmg i;
    public final boolean j;
    public final boolean k;
    public final efnm l;
    public final Bundle m;

    public efpd(faje fajeVar, efnh efnhVar, boolean z, Integer num, String str, fakk fakkVar, int i, Integer num2, efmg efmgVar, boolean z2, boolean z3, efnm efnmVar, Bundle bundle) {
        this.a = fajeVar;
        this.b = efnhVar;
        this.c = z;
        this.d = num;
        this.e = str;
        this.f = fakkVar;
        this.g = i;
        this.h = num2;
        this.i = efmgVar;
        this.j = z2;
        this.k = z3;
        this.l = efnmVar;
        this.m = bundle;
    }

    @Override // defpackage.efso
    public final int a() {
        return this.g;
    }

    @Override // defpackage.efso
    public final Bundle b() {
        return this.m;
    }

    @Override // defpackage.efso
    public final efmg c() {
        return this.i;
    }

    @Override // defpackage.efso
    public final efnh d() {
        return this.b;
    }

    @Override // defpackage.efso
    public final efnm e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof efso) {
            efso efsoVar = (efso) obj;
            if (this.a.equals(efsoVar.f()) && this.b.equals(efsoVar.d()) && this.c == efsoVar.l()) {
                efsoVar.n();
                Integer num2 = this.d;
                if (num2 != null ? num2.equals(efsoVar.i()) : efsoVar.i() == null) {
                    if (this.e.equals(efsoVar.j()) && this.f.equals(efsoVar.g()) && this.g == efsoVar.a() && ((num = this.h) != null ? num.equals(efsoVar.h()) : efsoVar.h() == null) && this.i.equals(efsoVar.c()) && this.j == efsoVar.k() && this.k == efsoVar.m() && this.l.equals(efsoVar.e()) && this.m.equals(efsoVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.efso
    public final faje f() {
        return this.a;
    }

    @Override // defpackage.efso
    public final fakk g() {
        return this.f;
    }

    @Override // defpackage.efso
    public final Integer h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Integer num = this.d;
        int hashCode2 = ((((((((((((hashCode * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003;
        Integer num2 = this.h;
        return ((((((((((hashCode2 ^ (num2 != null ? num2.hashCode() : 0)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode();
    }

    @Override // defpackage.efso
    public final Integer i() {
        return this.d;
    }

    @Override // defpackage.efso
    public final String j() {
        return this.e;
    }

    @Override // defpackage.efso
    public final boolean k() {
        return this.j;
    }

    @Override // defpackage.efso
    public final boolean l() {
        return this.c;
    }

    @Override // defpackage.efso
    public final boolean m() {
        return this.k;
    }

    public final String toString() {
        Bundle bundle = this.m;
        efnm efnmVar = this.l;
        efmg efmgVar = this.i;
        fakk fakkVar = this.f;
        efnh efnhVar = this.b;
        return "SurveyQuestionsContainerViewArgs{surveyPayload=" + this.a.toString() + ", answer=" + efnhVar.toString() + ", isSubmitting=" + this.c + ", ignoreFirstQuestion=false, logoResId=" + this.d + ", triggerId=" + this.e + ", surveySession=" + fakkVar.toString() + ", startingQuestionIndex=" + this.g + ", currentItem=" + this.h + ", surveyCompletionStyle=" + efmgVar.toString() + ", hideCloseButton=" + this.j + ", keepNextButtonForLastQuestion=" + this.k + ", surveyStyle=" + efnmVar.toString() + ", singleSelectOrdinalAnswerMappings=" + bundle.toString() + "}";
    }

    @Override // defpackage.efso
    public final void n() {
    }
}
