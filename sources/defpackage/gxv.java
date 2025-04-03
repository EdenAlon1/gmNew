package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxv extends ffkk implements ffjm {
    final /* synthetic */ lkr a;
    final /* synthetic */ ffji b;
    final /* synthetic */ ffix c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxv(lkr lkrVar, ffji ffjiVar, ffix ffixVar, int i) {
        super(2);
        this.a = lkrVar;
        this.b = ffjiVar;
        this.c = ffixVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d | 1);
        gxy.a(this.a, this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
