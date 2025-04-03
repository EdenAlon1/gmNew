package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efna extends efnc {
    public final String a;
    public final efnm b;
    private final String c;

    public efna(String str, String str2, efnm efnmVar) {
        this.a = str;
        this.c = str2;
        this.b = efnmVar;
    }

    @Override // defpackage.efnc
    public final efnm a() {
        return this.b;
    }

    @Override // defpackage.efnc
    public final String b() {
        return this.a;
    }

    @Override // defpackage.efnc
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efnc) {
            efnc efncVar = (efnc) obj;
            if (this.a.equals(efncVar.b()) && this.c.equals(efncVar.c()) && this.b.equals(efncVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SurveyInternalEvent{sessionId=" + this.a + ", triggerId=" + this.c + ", surveyStyle=" + this.b.toString() + "}";
    }
}
