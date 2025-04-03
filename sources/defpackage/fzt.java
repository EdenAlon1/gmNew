package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzt extends ffkk implements ffjm {
    final /* synthetic */ fzw a;
    final /* synthetic */ Long b;
    final /* synthetic */ int c;
    final /* synthetic */ hvi d;
    final /* synthetic */ long e;
    final /* synthetic */ int f;
    final /* synthetic */ gae g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzt(fzw fzwVar, Long l, int i, gae gaeVar, hvi hviVar, long j, int i2) {
        super(2);
        this.a = fzwVar;
        this.b = l;
        this.c = i;
        this.g = gaeVar;
        this.d = hviVar;
        this.e = j;
        this.f = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.a.a(this.b, this.c, this.g, this.d, this.e, (hfd) obj, hip.a(this.f | 1));
        return ffcu.a;
    }
}
