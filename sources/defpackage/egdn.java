package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egdn extends egdv {
    private final egja a;
    private final egiu b;

    public egdn(egja egjaVar, egiu egiuVar) {
        this.a = egjaVar;
        this.b = egiuVar;
    }

    @Override // defpackage.egdv
    public final egiu a() {
        return this.b;
    }

    @Override // defpackage.egdv
    public final egja b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egdv) {
            egdv egdvVar = (egdv) obj;
            if (this.a.equals(egdvVar.b()) && this.b.equals(egdvVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        egiu egiuVar = this.b;
        return "ProfileModelProvider{profileStateRepository=" + this.a.toString() + ", mdiPhotoRepository=" + egiuVar.toString() + "}";
    }
}
