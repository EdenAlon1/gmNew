package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggt extends egfl {
    private final String a;
    private final engw b;

    public eggt(String str, engw engwVar) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.a = str;
        if (engwVar == null) {
            throw new NullPointerException("Null hueRotations");
        }
        this.b = engwVar;
    }

    @Override // defpackage.egfl
    public final engw b() {
        return this.b;
    }

    @Override // defpackage.egfl
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egfl) {
            egfl egflVar = (egfl) obj;
            if (this.a.equals(egflVar.c()) && enkr.h(this.b, egflVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ArtPreset{url=" + this.a + ", hueRotations=" + this.b.toString() + "}";
    }
}
