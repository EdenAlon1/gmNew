package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqo extends ffkk implements ffjm {
    final /* synthetic */ fcu a;
    final /* synthetic */ hvi b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqo(fcu fcuVar, hvi hviVar, long j, int i) {
        super(2);
        this.a = fcuVar;
        this.b = hviVar;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        equ.b(this.a, this.b, this.c, (hfd) obj, hip.a(this.d | 1));
        return ffcu.a;
    }
}
