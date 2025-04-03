package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggl extends egen {
    private final engw a;
    private final emxc b;
    private final engw c;

    public eggl(engw engwVar, emxc emxcVar, engw engwVar2) {
        if (engwVar == null) {
            throw new NullPointerException("Null collectionPhotos");
        }
        this.a = engwVar;
        this.b = emxcVar;
        if (engwVar2 == null) {
            throw new NullPointerException("Null eventLogs");
        }
        this.c = engwVar2;
    }

    @Override // defpackage.egen
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.egen
    public final engw b() {
        return this.a;
    }

    @Override // defpackage.egen
    public final engw c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egen) {
            egen egenVar = (egen) obj;
            if (enkr.h(this.a, egenVar.b()) && this.b.equals(egenVar.a()) && enkr.h(this.c, egenVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        engw engwVar = this.c;
        emxc emxcVar = this.b;
        return "ArtCollectionPhotosResource{collectionPhotos=" + this.a.toString() + ", errorState=" + emxcVar.toString() + ", eventLogs=" + engwVar.toString() + "}";
    }
}
