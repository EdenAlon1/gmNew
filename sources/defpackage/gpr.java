package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpr extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;
    final /* synthetic */ hvi c;
    final /* synthetic */ boolean d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ ffjn g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpr(boolean z, ffix ffixVar, hvi hviVar, boolean z2, long j, long j2, ffjn ffjnVar, int i) {
        super(2);
        this.a = z;
        this.b = ffixVar;
        this.c = hviVar;
        this.d = z2;
        this.e = j;
        this.f = j2;
        this.g = ffjnVar;
        this.h = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gpy.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hfd) obj, hip.a(this.h | 1));
        return ffcu.a;
    }
}
