package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apnc extends apof {
    public final String a;
    private final engw b;

    public apnc(String str, engw engwVar) {
        this.a = str;
        this.b = engwVar;
    }

    @Override // defpackage.apof, defpackage.appw
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.appw
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apof) {
            apof apofVar = (apof) obj;
            if (this.a.equals(apofVar.c()) && enkr.h(this.b, apofVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "BugleTextContent{text=" + this.a + ", annotations=" + this.b.toString() + "}";
    }
}
