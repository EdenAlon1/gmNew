package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhb {
    public final dmte a;
    public final cwec b;

    public cwhb(dmte dmteVar, cwec cwecVar) {
        cwecVar.getClass();
        this.a = dmteVar;
        this.b = cwecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwhb)) {
            return false;
        }
        cwhb cwhbVar = (cwhb) obj;
        return ffkj.e(this.a, cwhbVar.a) && ffkj.e(this.b, cwhbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AutoCompleteContactBarUiData(contactBarUiData=" + this.a + ", contactSuggestionListUiData=" + this.b + ")";
    }
}
