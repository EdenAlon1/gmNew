package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egmt extends egmz {
    private final egih a;
    private final eghw b;
    private final egih c;

    public egmt(egih egihVar, eghw eghwVar, egih egihVar2) {
        this.a = egihVar;
        this.b = eghwVar;
        this.c = egihVar2;
    }

    @Override // defpackage.egmz
    public final eghw a() {
        return this.b;
    }

    @Override // defpackage.egmz
    public final egih b() {
        return this.a;
    }

    @Override // defpackage.egmz
    public final egih c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egmz) {
            egmz egmzVar = (egmz) obj;
            if (this.a.equals(egmzVar.b()) && this.b.equals(egmzVar.a()) && this.c.equals(egmzVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        egih egihVar = this.c;
        eghw eghwVar = this.b;
        return "GooglePhotosResource{meSuggestedPhotosResource=" + this.a.toString() + ", clustersResource=" + eghwVar.toString() + ", suggestedPhotosResource=" + egihVar.toString() + "}";
    }
}
