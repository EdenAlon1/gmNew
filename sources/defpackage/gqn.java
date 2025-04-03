package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gqn extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ ffjn d;
    final /* synthetic */ ffjm e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqn(hvi hviVar, long j, long j2, ffjn ffjnVar, ffjm ffjmVar, ffjm ffjmVar2, int i) {
        super(2);
        this.a = hviVar;
        this.b = j;
        this.c = j2;
        this.d = ffjnVar;
        this.e = ffjmVar;
        this.f = ffjmVar2;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hvi hviVar = this.a;
        long j = this.b;
        long j2 = this.c;
        ffjn ffjnVar = this.d;
        ffjm ffjmVar = this.e;
        gqo.a(hviVar, j, j2, ffjnVar, ffjmVar, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
