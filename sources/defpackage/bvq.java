package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvq implements bfk {
    final /* synthetic */ buy a;
    final /* synthetic */ bvu b;

    public bvq(bvu bvuVar, buy buyVar) {
        this.b = bvuVar;
        this.a = buyVar;
    }

    @Override // defpackage.bfk
    public final void a(Throwable th) {
        bvu bvuVar = this.b;
        if (bvuVar.j == this.a) {
            bvuVar.a(th);
        }
    }

    @Override // defpackage.bfk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bux buxVar = (bux) obj;
        buxVar.getClass();
        if (this.b.j == this.a) {
            avw.a("AudioSource", "Receive BufferProvider state change: " + this.b.g + " to " + buxVar);
            bvu bvuVar = this.b;
            if (bvuVar.g != buxVar) {
                bvuVar.g = buxVar;
                bvuVar.f();
            }
        }
    }
}
