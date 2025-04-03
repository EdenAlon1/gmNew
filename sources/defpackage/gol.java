package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gol extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ idh b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ long g;
    final /* synthetic */ int h;
    final /* synthetic */ goa i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gol(goa goaVar, hvi hviVar, idh idhVar, long j, long j2, long j3, long j4, long j5, int i) {
        super(2);
        this.i = goaVar;
        this.a = hviVar;
        this.b = idhVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.h | 1);
        gor.c(this.i, this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hfd) obj, a);
        return ffcu.a;
    }
}
