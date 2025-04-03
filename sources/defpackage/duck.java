package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duck extends duco {
    private final ezib a;
    private final engw b;
    private final engw c;

    public duck(ezib ezibVar, engw engwVar, engw engwVar2) {
        if (ezibVar == null) {
            throw new NullPointerException("Null corpus");
        }
        this.a = ezibVar;
        if (engwVar == null) {
            throw new NullPointerException("Null elementsToUpdate");
        }
        this.b = engwVar;
        if (engwVar2 == null) {
            throw new NullPointerException("Null elementsToDelete");
        }
        this.c = engwVar2;
    }

    @Override // defpackage.duco
    public final engw a() {
        return this.c;
    }

    @Override // defpackage.duco
    public final engw b() {
        return this.b;
    }

    @Override // defpackage.duco
    public final ezib c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof duco) {
            duco ducoVar = (duco) obj;
            if (this.a.equals(ducoVar.c()) && enkr.h(this.b, ducoVar.b()) && enkr.h(this.c, ducoVar.a())) {
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
        engw engwVar2 = this.b;
        return "CorpusUploadMutation{corpus=" + this.a.toString() + ", elementsToUpdate=" + engwVar2.toString() + ", elementsToDelete=" + engwVar.toString() + "}";
    }
}
