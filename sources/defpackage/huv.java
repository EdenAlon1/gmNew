package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huv implements hvi {
    public final hvi a;
    public final hvi b;

    public huv(hvi hviVar, hvi hviVar2) {
        this.a = hviVar;
        this.b = hviVar2;
    }

    @Override // defpackage.hvi
    public final /* synthetic */ hvi a(hvi hviVar) {
        return hvd.a(this, hviVar);
    }

    @Override // defpackage.hvi
    public final Object b(Object obj, ffjm ffjmVar) {
        return this.b.b(this.a.b(obj, ffjmVar), ffjmVar);
    }

    @Override // defpackage.hvi
    public final boolean c(ffji ffjiVar) {
        return this.a.c(ffjiVar) && this.b.c(ffjiVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof huv)) {
            return false;
        }
        huv huvVar = (huv) obj;
        return ffkj.e(this.a, huvVar.a) && ffkj.e(this.b, huvVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "[" + ((String) b("", huu.a)) + ']';
    }
}
