package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiup implements fiuo {
    public final fiuo a;

    private fiup(fiuo fiuoVar) {
        this.a = fiuoVar;
    }

    static fiup b(fiuo fiuoVar) {
        if (fiuoVar instanceof fiul) {
            return ((fiul) fiuoVar).a;
        }
        if (fiuoVar instanceof fiup) {
            return (fiup) fiuoVar;
        }
        if (fiuoVar == null) {
            return null;
        }
        return new fiup(fiuoVar);
    }

    @Override // defpackage.fiuo
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.fiuo
    public final int c(fiuk fiukVar, CharSequence charSequence, int i) {
        return this.a.c(fiukVar, charSequence, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fiup) {
            return this.a.equals(((fiup) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
