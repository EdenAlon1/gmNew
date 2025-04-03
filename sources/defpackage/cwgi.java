package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwgi {
    public final cwgp a;
    private final cwgp b = null;

    public cwgi(cwgp cwgpVar) {
        this.a = cwgpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwgi)) {
            return false;
        }
        cwgi cwgiVar = (cwgi) obj;
        cwgp cwgpVar = cwgiVar.b;
        return ffkj.e(null, null) && ffkj.e(this.a, cwgiVar.a);
    }

    public final int hashCode() {
        cwgp cwgpVar = this.a;
        if (cwgpVar == null) {
            return 0;
        }
        return cwgpVar.hashCode();
    }

    public final String toString() {
        return "ProfileSuggestionUiData(profileSuggestionRow=null, phoneSuggestionRow=" + this.a + ")";
    }
}
