package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egdm extends egdr {
    private final emxc a;
    private final eghq b;
    private final eghy c;
    private final egig d;
    private final eghu e;
    private final eghm f;

    public egdm(emxc emxcVar, eghq eghqVar, eghy eghyVar, egig egigVar, eghu eghuVar, eghm eghmVar) {
        this.a = emxcVar;
        this.b = eghqVar;
        this.c = eghyVar;
        this.d = egigVar;
        this.e = eghuVar;
        this.f = eghmVar;
    }

    @Override // defpackage.egdr
    public final eghm a() {
        return this.f;
    }

    @Override // defpackage.egdr
    public final eghq b() {
        return this.b;
    }

    @Override // defpackage.egdr
    public final eghu c() {
        return this.e;
    }

    @Override // defpackage.egdr
    public final eghy e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egdr) {
            egdr egdrVar = (egdr) obj;
            if (this.a.equals(egdrVar.k()) && this.b.equals(egdrVar.b()) && this.c.equals(egdrVar.e()) && this.d.equals(egdrVar.f()) && this.e.equals(egdrVar.c()) && this.f.equals(egdrVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.egdr
    public final egig f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    @Override // defpackage.egdr
    public final emxc k() {
        return this.a;
    }

    public final String toString() {
        eghm eghmVar = this.f;
        eghu eghuVar = this.e;
        egig egigVar = this.d;
        eghy eghyVar = this.c;
        eghq eghqVar = this.b;
        return "ModelProvider{artCollectionsRepository=" + this.a.toString() + ", clusterPhotosRepository=" + eghqVar.toString() + ", meClusterPhotosRepository=" + eghyVar.toString() + ", suggestedPhotosRepository=" + egigVar.toString() + ", clustersRepository=" + eghuVar.toString() + ", devicePhotosFetcher=" + eghmVar.toString() + "}";
    }
}
