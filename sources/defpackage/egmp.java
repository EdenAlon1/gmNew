package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egmp extends egms {
    private final engw a;

    public egmp(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.egms, defpackage.egnl
    public final engw a() {
        return this.a;
    }

    @Override // defpackage.egnl
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof egnl) {
            egnl egnlVar = (egnl) obj;
            if (egnlVar.b() == 3 && enkr.h(this.a, egnlVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content{allPhotos=" + this.a.toString() + "}";
    }
}
