package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvx extends exab {
    public final boolean a;
    public final ewze b;
    public final engw c;
    public final ewyr d;
    public final ewyr e;
    public final ewyr f;
    public final ewyr g;
    public final ewyr h;
    public final ewyr i;
    public final ewyr j;
    public final ewyr k;
    private final ewxw l;
    private final exaa m;

    public ewvx(ewyr ewyrVar, ewyr ewyrVar2, ewyr ewyrVar3, ewyr ewyrVar4, ewyr ewyrVar5, ewyr ewyrVar6, ewyr ewyrVar7, ewyr ewyrVar8, boolean z, ewze ewzeVar, ewxw ewxwVar, engw engwVar, exaa exaaVar) {
        this.d = ewyrVar;
        this.e = ewyrVar2;
        this.f = ewyrVar3;
        this.g = ewyrVar4;
        this.h = ewyrVar5;
        this.i = ewyrVar6;
        this.j = ewyrVar7;
        this.k = ewyrVar8;
        this.a = z;
        this.b = ewzeVar;
        this.l = ewxwVar;
        this.c = engwVar;
        this.m = exaaVar;
    }

    @Override // defpackage.exab
    public final engw a() {
        return this.c;
    }

    @Override // defpackage.exab
    public final ewxw b() {
        return this.l;
    }

    @Override // defpackage.exab
    public final ewze c() {
        return this.b;
    }

    @Override // defpackage.exab
    public final exaa d() {
        return this.m;
    }

    @Override // defpackage.exab
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ewze ewzeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof exab) {
            exab exabVar = (exab) obj;
            if (this.d.equals(exabVar.h()) && this.e.equals(exabVar.j()) && this.f.equals(exabVar.f()) && this.g.equals(exabVar.m()) && this.h.equals(exabVar.l()) && this.i.equals(exabVar.g()) && this.j.equals(exabVar.k()) && this.k.equals(exabVar.i()) && this.a == exabVar.e() && ((ewzeVar = this.b) != null ? ewzeVar.equals(exabVar.c()) : exabVar.c() == null)) {
                exabVar.n();
                exabVar.o();
                if (this.l.equals(exabVar.b()) && enkr.h(this.c, exabVar.a()) && this.m.equals(exabVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.exab
    public final ewyr f() {
        return this.f;
    }

    @Override // defpackage.exab
    public final ewyr g() {
        return this.i;
    }

    @Override // defpackage.exab
    public final ewyr h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
        ewze ewzeVar = this.b;
        return (((((((((((((hashCode * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (ewzeVar == null ? 0 : ewzeVar.hashCode())) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 385622423;
    }

    @Override // defpackage.exab
    public final ewyr i() {
        return this.k;
    }

    @Override // defpackage.exab
    public final ewyr j() {
        return this.e;
    }

    @Override // defpackage.exab
    public final ewyr k() {
        return this.j;
    }

    @Override // defpackage.exab
    public final ewyr l() {
        return this.h;
    }

    @Override // defpackage.exab
    public final ewyr m() {
        return this.g;
    }

    public final String toString() {
        return "TextClassifierOptions{coreModelProvider=" + this.d.toString() + ", langIdModelProvider=" + this.e.toString() + ", actionsSuggestionsModelProvider=" + this.f.toString() + ", webrefModelProvider=" + this.g.toString() + ", personNameModelProvider=" + this.h.toString() + ", alternateContactModelProvider=" + this.i.toString() + ", neuralMatchingEncoderProvider=" + this.j.toString() + ", deepCluModelProvider=" + this.k.toString() + ", enableFallback=" + this.a + ", contactOptions=" + String.valueOf(this.b) + ", enableInstalledApps=false, enableTranslationInClassifier=false, eventLogger=" + this.l.toString() + ", actionsSuggestionsLocales=" + this.c.toString() + ", intentGenerationOptions=IntentGenerationOptions{addContactIntentEnabled=false, searchIntentEnabled=false}}";
    }

    @Override // defpackage.exab
    public final void n() {
    }

    @Override // defpackage.exab
    public final void o() {
    }
}
