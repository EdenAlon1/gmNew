package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggi extends egec {
    private final String a;
    private final engw b;

    public eggi(String str, engw engwVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (engwVar == null) {
            throw new NullPointerException("Null collections");
        }
        this.b = engwVar;
    }

    @Override // defpackage.egec
    public final engw b() {
        return this.b;
    }

    @Override // defpackage.egec
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egec) {
            egec egecVar = (egec) obj;
            if (this.a.equals(egecVar.c()) && enkr.h(this.b, egecVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ArtCategory{name=" + this.a + ", collections=" + this.b.toString() + "}";
    }
}
