package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abeh implements ffjm {
    final /* synthetic */ god a;
    final /* synthetic */ abdn b;
    final /* synthetic */ float c;

    public abeh(god godVar, abdn abdnVar, float f) {
        this.a = godVar;
        this.b = abdnVar;
        this.c = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            god godVar = this.a;
            if (this.b.q.c) {
                a = eba.j(hvi.e, 0.0f, 0.0f, 0.0f, this.c, 7);
            } else {
                a = ecs.a(hvi.e);
            }
            gnz.a(godVar, a, null, hfdVar, 6, 4);
        }
        return ffcu.a;
    }
}
