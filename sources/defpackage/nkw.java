package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nkw extends nkc implements Comparable {
    public long i;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        nkw nkwVar = (nkw) obj;
        if (eR() != nkwVar.eR()) {
            return !eR() ? -1 : 1;
        }
        long j = this.f - nkwVar.f;
        if (j == 0) {
            j = this.i - nkwVar.i;
            if (j == 0) {
                return 0;
            }
        }
        return j <= 0 ? -1 : 1;
    }
}
