package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwm extends ffkk implements ffjm {
    final /* synthetic */ gxa a;
    final /* synthetic */ hvi b;
    final /* synthetic */ dtt c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ ebe f;
    final /* synthetic */ ffjo g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwm(gxa gxaVar, hvi hviVar, dtt dttVar, float f, float f2, ebe ebeVar, ffjo ffjoVar, int i) {
        super(2);
        this.a = gxaVar;
        this.b = hviVar;
        this.c = dttVar;
        this.d = f;
        this.e = f2;
        this.f = ebeVar;
        this.g = ffjoVar;
        this.h = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gwr.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hfd) obj, hip.a(this.h | 1));
        return ffcu.a;
    }
}
