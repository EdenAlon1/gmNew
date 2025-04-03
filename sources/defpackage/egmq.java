package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egmq extends egms {
    private final engw a;

    public egmq(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.egnl
    public final int b() {
        return 2;
    }

    @Override // defpackage.egms, defpackage.egnl
    public final engw c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof egnl) {
            egnl egnlVar = (egnl) obj;
            if (egnlVar.b() == 2 && enkr.h(this.a, egnlVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content{clusters=" + this.a.toString() + "}";
    }
}
