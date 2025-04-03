package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnb extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ gnn b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ffjn d;
    final /* synthetic */ ffjn e;
    final /* synthetic */ int f;
    final /* synthetic */ dwn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnb(hvi hviVar, gnn gnnVar, boolean z, dwn dwnVar, ffjn ffjnVar, ffjn ffjnVar2, int i) {
        super(2);
        this.a = hviVar;
        this.b = gnnVar;
        this.c = z;
        this.g = dwnVar;
        this.d = ffjnVar;
        this.e = ffjnVar2;
        this.f = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hvi hviVar = this.a;
        gnn gnnVar = this.b;
        boolean z = this.c;
        dwn dwnVar = this.g;
        ffjn ffjnVar = this.d;
        gnj.c(hviVar, gnnVar, z, dwnVar, ffjnVar, this.e, (hfd) obj, hip.a(this.f | 1));
        return ffcu.a;
    }
}
