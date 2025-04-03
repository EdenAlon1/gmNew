package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpu extends ffkk implements ffjm {
    final /* synthetic */ fqa a;
    final /* synthetic */ fkw b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ ffjn e;
    final /* synthetic */ ffjq f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpu(fqa fqaVar, fkw fkwVar, long j, long j2, ffjn ffjnVar, ffjq ffjqVar, int i) {
        super(2);
        this.a = fqaVar;
        this.b = fkwVar;
        this.c = j;
        this.d = j2;
        this.e = ffjnVar;
        this.f = ffjqVar;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.a.a(this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
