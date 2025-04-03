package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duld implements dulh {
    final /* synthetic */ dule a;

    public duld(dule duleVar) {
        this.a = duleVar;
    }

    @Override // defpackage.dulh
    public final void a(int i) {
        dule duleVar = this.a;
        duleVar.d = Integer.toString(i);
        duleVar.e = i;
        duleVar.ag.b();
        dule duleVar2 = this.a;
        if (duleVar2.a.g) {
            ((dula) duleVar2.G()).D();
        } else {
            ((dulb) duleVar2.G()).F(duleVar2.r(), duleVar2);
        }
    }
}
