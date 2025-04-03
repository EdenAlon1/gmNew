package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egmr extends egms {
    private final engw a;

    public egmr(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.egnl
    public final int b() {
        return 1;
    }

    @Override // defpackage.egms, defpackage.egnl
    public final engw d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof egnl) {
            egnl egnlVar = (egnl) obj;
            if (egnlVar.b() == 1 && enkr.h(this.a, egnlVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content{mePhotos=" + this.a.toString() + "}";
    }
}
