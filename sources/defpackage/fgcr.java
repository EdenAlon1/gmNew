package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgcr implements ffte {
    public final fgct a;
    public final long b;
    public final Object c;
    public final ffgu d;

    public fgcr(fgct fgctVar, long j, Object obj, ffgu ffguVar) {
        this.a = fgctVar;
        this.b = j;
        this.c = obj;
        this.d = ffguVar;
    }

    @Override // defpackage.ffte
    public final void hO() {
        fgct fgctVar = this.a;
        synchronized (fgctVar) {
            if (this.b < fgctVar.f()) {
                return;
            }
            Object[] objArr = fgctVar.a;
            objArr.getClass();
            if (fgcu.a(objArr, this.b) != this) {
                return;
            }
            fgcu.b(objArr, this.b, fgcu.a);
            fgctVar.k();
        }
    }
}
