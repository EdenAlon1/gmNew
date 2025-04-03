package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elma extends Exception {
    private final engw a;

    /* JADX WARN: Multi-variable type inference failed */
    public elma(engw engwVar) {
        super((Throwable) engwVar.get(0));
        this.a = engwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return enkr.h(this.a, ((elma) obj).a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Combined exception with " + ((enou) this.a).c + " cause(s). First cause: " + String.valueOf(getCause()) + " All: " + String.valueOf(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
