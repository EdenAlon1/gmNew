package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkh extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ long b;
    final /* synthetic */ float c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    final /* synthetic */ float f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkh(hvi hviVar, long j, float f, long j2, int i, float f2, int i2, int i3) {
        super(2);
        this.a = hviVar;
        this.b = j;
        this.c = f;
        this.d = j2;
        this.e = i;
        this.f = f2;
        this.g = i2;
        this.h = i3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gkn.a(this.a, this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1), this.h);
        return ffcu.a;
    }
}
