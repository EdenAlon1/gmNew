package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgq implements hgo {
    final /* synthetic */ fr a;
    final /* synthetic */ fflb b;

    public abgq(fr frVar, fflb fflbVar) {
        this.a = frVar;
        this.b = fflbVar;
    }

    @Override // defpackage.hgo
    public final void a() {
        fr frVar = this.a;
        if (frVar == null || frVar.ai() || this.b.a == null) {
            return;
        }
        cg cgVar = new cg(frVar);
        cgVar.n((ea) this.b.a);
        cgVar.c();
    }
}
