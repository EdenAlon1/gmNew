package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpp extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;
    final /* synthetic */ hvi c;
    final /* synthetic */ boolean d;
    final /* synthetic */ ffjm e;
    final /* synthetic */ long f;
    final /* synthetic */ long g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpp(boolean z, ffix ffixVar, hvi hviVar, boolean z2, ffjm ffjmVar, long j, long j2, int i) {
        super(2);
        this.a = z;
        this.b = ffixVar;
        this.c = hviVar;
        this.d = z2;
        this.e = ffjmVar;
        this.f = j;
        this.g = j2;
        this.h = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gpy.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hfd) obj, hip.a(this.h | 1));
        return ffcu.a;
    }
}
