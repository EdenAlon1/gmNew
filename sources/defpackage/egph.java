package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egph extends egpj {
    private final boolean a;
    private final enhk b;
    private final efnl c;

    public egph(efnl efnlVar, boolean z, enhk enhkVar) {
        this.c = efnlVar;
        this.a = z;
        this.b = enhkVar;
    }

    @Override // defpackage.egpj
    public final enhk a() {
        return this.b;
    }

    @Override // defpackage.egpj
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.egpj
    public final efnl c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egpj) {
            egpj egpjVar = (egpj) obj;
            if (this.c.equals(egpjVar.c()) && this.a == egpjVar.b() && ennc.m(this.b, egpjVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HatsSurveyData{surveyData=" + this.c.toString() + ", wasMonogram=" + this.a + ", psd=" + ennc.g(this.b) + "}";
    }
}
