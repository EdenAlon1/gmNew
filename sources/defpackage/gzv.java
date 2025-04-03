package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzv extends ffkk implements ffjm {
    final /* synthetic */ kev a;
    final /* synthetic */ ffsk b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ int d;
    final /* synthetic */ gvi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzv(kev kevVar, gvi gviVar, ffsk ffskVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = kevVar;
        this.e = gviVar;
        this.b = ffskVar;
        this.c = ffjmVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hak.b(this.a, this.e, this.b, this.c, (hfd) obj, hip.a(this.d | 1));
        return ffcu.a;
    }
}
